package vegabobo.dsusideloader.installer.root;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Locale;

public class SparseInputStream extends InputStream {
    public long mBlockSize;
    public SparseChunk mCur;
    public int mCurChunks;
    public BufferedInputStream mIn;
    public boolean mIsSparse;
    public long mLeft;
    public long mTotalBlocks;
    public long mTotalChunks;

    public class SparseChunk {
        public byte[] fill;
        public int mChunkSize;
        public short mChunkType;
        public int mTotalSize;

        public SparseChunk() {
        }

        public String toString() {
            return String.format(Locale.getDefault(), "type: %x, chunk_size: %d, total_size: %d", new Object[]{Short.valueOf(this.mChunkType), Integer.valueOf(this.mChunkSize), Integer.valueOf(this.mTotalSize)});
        }
    }

    public final byte[] readFull(InputStream in, int size) {
        byte[] buf = new byte[size];
        int done = 0;
        while (done < size) {
            int read = in.read(buf, done, size - done);
            int n = read;
            if (read >= 0) {
                done += n;
            } else {
                throw new IOException("Failed to readFull");
            }
        }
        return buf;
    }

    public final ByteBuffer readBuffer(InputStream in, int size) {
        return ByteBuffer.wrap(readFull(in, size)).order(ByteOrder.LITTLE_ENDIAN);
    }

    public final SparseChunk readChunk(InputStream in) {
        SparseChunk chunk = new SparseChunk();
        ByteBuffer buf = readBuffer(in, 12);
        chunk.mChunkType = buf.getShort();
        buf.getShort();
        chunk.mChunkSize = buf.getInt();
        chunk.mTotalSize = buf.getInt();
        return chunk;
    }

    public SparseInputStream(BufferedInputStream in) {
        this.mIn = in;
        in.mark(56);
        ByteBuffer buf = readBuffer(this.mIn, 28);
        boolean z = buf.getInt() == -316211398;
        this.mIsSparse = z;
        if (!z) {
            this.mIn.reset();
            return;
        }
        int major = buf.getShort();
        int minor = buf.getShort();
        if (major > 1 || minor > 0) {
            throw new IOException("Unsupported sparse version: " + major + "." + minor);
        } else if (buf.getShort() != 28) {
            throw new IOException("Illegal file header size");
        } else if (buf.getShort() == 12) {
            long j = (long) buf.getInt();
            this.mBlockSize = j;
            if ((j & 3) == 0) {
                this.mTotalBlocks = (long) buf.getInt();
                this.mTotalChunks = (long) buf.getInt();
                this.mCurChunks = 0;
                this.mLeft = (long) 0;
                return;
            }
            throw new IOException("Illegal block size, must be a multiple of 4");
        } else {
            throw new IOException("Illegal chunk header size");
        }
    }

    public final boolean prepareChunk() {
        if (this.mCur == null || this.mLeft <= 0) {
            int i = this.mCurChunks + 1;
            this.mCurChunks = i;
            if (((long) i) > this.mTotalChunks) {
                return true;
            }
            SparseChunk readChunk = readChunk(this.mIn);
            this.mCur = readChunk;
            if (readChunk.mChunkType == -13630) {
                readChunk.fill = readFull(this.mIn, 4);
            }
            this.mLeft = ((long) this.mCur.mChunkSize) * this.mBlockSize;
        }
        if (this.mLeft == 0) {
            return true;
        }
        return false;
    }

    public int read(byte[] buf, int off, int len) {
        if (!this.mIsSparse) {
            return this.mIn.read(buf, off, len);
        }
        if (prepareChunk()) {
            return -1;
        }
        switch (this.mCur.mChunkType) {
            case -13631:
                int n = this.mIn.read(buf, off, (int) Math.min(this.mLeft, (long) len));
                this.mLeft -= (long) n;
                return n;
            case -13630:
                return super.read(buf, off, len);
            case -13629:
                int n2 = (int) Math.min(this.mLeft, (long) len);
                Arrays.fill(buf, off, off + n2, (byte) 0);
                this.mLeft -= (long) n2;
                return n2;
            default:
                throw new IOException("Unsupported Chunk:" + this.mCur.toString());
        }
    }

    public int read() {
        int ret;
        if (!this.mIsSparse) {
            return this.mIn.read();
        }
        if (prepareChunk()) {
            return -1;
        }
        SparseChunk sparseChunk = this.mCur;
        switch (sparseChunk.mChunkType) {
            case -13631:
                ret = this.mIn.read();
                break;
            case -13630:
                ret = Byte.toUnsignedInt(sparseChunk.fill[(4 - (((int) this.mLeft) & 3)) & 3]);
                break;
            case -13629:
                ret = 0;
                break;
            default:
                throw new IOException("Unsupported Chunk:" + this.mCur.toString());
        }
        this.mLeft--;
        return ret;
    }

    public long getUnsparseSize() {
        if (!this.mIsSparse) {
            return -1;
        }
        return this.mBlockSize * this.mTotalBlocks;
    }
}
