package vegabobo.dsusideloader.ui.screen.about;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: AboutViewModel.kt */
public final class UpdaterResponse$$serializer implements GeneratedSerializer {
    public static final int $stable = LiveLiterals$AboutViewModelKt.INSTANCE.m3111Int$class$serializer$classUpdaterResponse();
    public static final UpdaterResponse$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        UpdaterResponse$$serializer updaterResponse$$serializer = new UpdaterResponse$$serializer();
        INSTANCE = updaterResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("vegabobo.dsusideloader.ui.screen.about.UpdaterResponse", updaterResponse$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("identifier", true);
        pluginGeneratedSerialDescriptor.addElement("versionCode", true);
        pluginGeneratedSerialDescriptor.addElement("versionName", true);
        pluginGeneratedSerialDescriptor.addElement("apkUrl", true);
        pluginGeneratedSerialDescriptor.addElement("changelogUrl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, IntSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer};
    }

    public UpdaterResponse deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.checkNotNullParameter(decoder2, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder2.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 1);
            str3 = beginStructure.decodeStringElement(descriptor2, 2);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 3);
            str4 = decodeStringElement;
            i2 = 31;
            str = beginStructure.decodeStringElement(descriptor2, 4);
            i = decodeIntElement;
            str2 = decodeStringElement2;
        } else {
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            boolean z = true;
            int i3 = 0;
            int i4 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        str5 = beginStructure.decodeStringElement(descriptor2, 0);
                        i4 |= 1;
                        break;
                    case 1:
                        i3 = beginStructure.decodeIntElement(descriptor2, 1);
                        i4 |= 2;
                        break;
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER:
                        str8 = beginStructure.decodeStringElement(descriptor2, 2);
                        i4 |= 4;
                        break;
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER:
                        str6 = beginStructure.decodeStringElement(descriptor2, 3);
                        i4 |= 8;
                        break;
                    case PreferencesProto$Value.LONG_FIELD_NUMBER:
                        str7 = beginStructure.decodeStringElement(descriptor2, 4);
                        i4 |= 16;
                        break;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            str4 = str5;
            str2 = str6;
            str = str7;
            str3 = str8;
            i = i3;
            i2 = i4;
        }
        beginStructure.endStructure(descriptor2);
        return new UpdaterResponse(i2, str4, i, str3, str2, str, (SerializationConstructorMarker) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
