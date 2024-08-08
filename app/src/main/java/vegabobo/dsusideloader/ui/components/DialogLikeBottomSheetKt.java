package vegabobo.dsusideloader.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.LocalSoftwareKeyboardController;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DialogLikeBottomSheet.kt */
public abstract class DialogLikeBottomSheetKt {
    public static final void DialogLikeBottomSheet(Modifier modifier, ImageVector icon, String title, String text, String confirmText, String cancelText, boolean hideKeyboard, Function0 onClickConfirm, Function0 onClickCancel, Function0 onDismiss, Function3 content, Composer $composer, int $changed, int $changed1, int i) {
        String text2;
        String confirmText2;
        String cancelText2;
        boolean z;
        Function3 content2;
        Function0 onDismiss2;
        Function0 onClickCancel2;
        Function0 onClickConfirm2;
        boolean hideKeyboard2;
        String cancelText3;
        String confirmText3;
        String text3;
        String title2;
        Modifier modifier2;
        Function0 onDismiss3;
        boolean hideKeyboard3;
        String title3;
        Function0 onClickConfirm3;
        Function0 onClickCancel3;
        Modifier modifier3;
        Function3 content3;
        Object value$iv$iv$iv;
        boolean hideKeyboard4;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ImageVector imageVector = icon;
        int i8 = $changed;
        int i9 = i;
        Intrinsics.checkNotNullParameter(imageVector, "icon");
        Composer $composer2 = $composer.startRestartGroup(-1700682427);
        ComposerKt.sourceInformation($composer2, "C(DialogLikeBottomSheet)P(5,4,10,9,1!1,3,7,6,8)37@1477L24,44@1641L909:DialogLikeBottomSheet.kt#bcxyhz");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        int i10 = i9 & 1;
        if (i10 != 0) {
            $dirty |= 6;
            Modifier modifier4 = modifier;
        } else if ((i8 & 14) == 0) {
            $dirty |= $composer2.changed((Object) modifier) ? 4 : 2;
        } else {
            Modifier modifier5 = modifier;
        }
        if ((i9 & 2) != 0) {
            $dirty |= 48;
        } else if ((i8 & 112) == 0) {
            $dirty |= $composer2.changed((Object) imageVector) ? 32 : 16;
        }
        if ((i8 & 896) == 0) {
            if ((i9 & 4) != 0) {
                String str = title;
            } else if ($composer2.changed((Object) title)) {
                i7 = 256;
                $dirty |= i7;
            }
            i7 = 128;
            $dirty |= i7;
        } else {
            String str2 = title;
        }
        if ((i8 & 7168) == 0) {
            if ((i9 & 8) == 0) {
                text2 = text;
                if ($composer2.changed((Object) text2)) {
                    i6 = 2048;
                    $dirty |= i6;
                }
            } else {
                text2 = text;
            }
            i6 = 1024;
            $dirty |= i6;
        } else {
            text2 = text;
        }
        if ((57344 & i8) == 0) {
            if ((i9 & 16) == 0) {
                confirmText2 = confirmText;
                if ($composer2.changed((Object) confirmText2)) {
                    i5 = 16384;
                    $dirty |= i5;
                }
            } else {
                confirmText2 = confirmText;
            }
            i5 = 8192;
            $dirty |= i5;
        } else {
            confirmText2 = confirmText;
        }
        if ((458752 & i8) == 0) {
            if ((i9 & 32) == 0) {
                cancelText2 = cancelText;
                if ($composer2.changed((Object) cancelText2)) {
                    i4 = 131072;
                    $dirty |= i4;
                }
            } else {
                cancelText2 = cancelText;
            }
            i4 = 65536;
            $dirty |= i4;
        } else {
            cancelText2 = cancelText;
        }
        if ((3670016 & i8) == 0) {
            if ((i9 & 64) == 0) {
                z = hideKeyboard;
                if ($composer2.changed(z)) {
                    i3 = 1048576;
                    $dirty |= i3;
                }
            } else {
                z = hideKeyboard;
            }
            i3 = 524288;
            $dirty |= i3;
        } else {
            z = hideKeyboard;
        }
        int i11 = i9 & 128;
        if (i11 != 0) {
            $dirty |= 12582912;
            Function0 function0 = onClickConfirm;
        } else if ((i8 & 29360128) == 0) {
            $dirty |= $composer2.changedInstance(onClickConfirm) ? 8388608 : 4194304;
        } else {
            Function0 function02 = onClickConfirm;
        }
        int i12 = i9 & 256;
        if (i12 != 0) {
            $dirty |= 100663296;
            Function0 function03 = onClickCancel;
        } else if ((i8 & 234881024) == 0) {
            $dirty |= $composer2.changedInstance(onClickCancel) ? 67108864 : 33554432;
        } else {
            Function0 function04 = onClickCancel;
        }
        if ((i8 & 1879048192) == 0) {
            if ((i9 & 512) != 0) {
                Function0 function05 = onDismiss;
            } else if ($composer2.changedInstance(onDismiss)) {
                i2 = 536870912;
                $dirty |= i2;
            }
            i2 = 268435456;
            $dirty |= i2;
        } else {
            Function0 function06 = onDismiss;
        }
        int i13 = i9 & 1024;
        if (i13 != 0) {
            $dirty1 |= 6;
            Function3 function3 = content;
        } else if (($changed1 & 14) == 0) {
            $dirty1 |= $composer2.changedInstance(content) ? 4 : 2;
        } else {
            Function3 function32 = content;
        }
        if (($dirty & 1533916891) == 306783378 && ($dirty1 & 11) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
            title2 = title;
            onClickConfirm2 = onClickConfirm;
            onClickCancel2 = onClickCancel;
            onDismiss2 = onDismiss;
            content2 = content;
            int i14 = $dirty;
            text3 = text2;
            confirmText3 = confirmText2;
            cancelText3 = cancelText2;
            hideKeyboard2 = z;
        } else {
            $composer2.startDefaults();
            if ((i8 & 1) == 0 || $composer2.getDefaultsInvalid()) {
                if (i10 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier;
                }
                if ((i9 & 4) != 0) {
                    title3 = LiveLiterals$DialogLikeBottomSheetKt.INSTANCE.m2989String$paramtitle$funDialogLikeBottomSheet();
                    $dirty &= -897;
                } else {
                    title3 = title;
                }
                if ((i9 & 8) != 0) {
                    text2 = LiveLiterals$DialogLikeBottomSheetKt.INSTANCE.m2988String$paramtext$funDialogLikeBottomSheet();
                    $dirty &= -7169;
                }
                if ((i9 & 16) != 0) {
                    confirmText2 = LiveLiterals$DialogLikeBottomSheetKt.INSTANCE.m2987String$paramconfirmText$funDialogLikeBottomSheet();
                    $dirty &= -57345;
                }
                if ((i9 & 32) != 0) {
                    cancelText2 = LiveLiterals$DialogLikeBottomSheetKt.INSTANCE.m2986String$paramcancelText$funDialogLikeBottomSheet();
                    $dirty &= -458753;
                }
                if ((i9 & 64) != 0) {
                    hideKeyboard3 = LiveLiterals$DialogLikeBottomSheetKt.INSTANCE.m2982Boolean$paramhideKeyboard$funDialogLikeBottomSheet();
                    $dirty &= -3670017;
                } else {
                    hideKeyboard3 = z;
                }
                if (i11 != 0) {
                    onClickConfirm3 = DialogLikeBottomSheetKt$DialogLikeBottomSheet$1.INSTANCE;
                } else {
                    onClickConfirm3 = onClickConfirm;
                }
                if (i12 != 0) {
                    onClickCancel3 = DialogLikeBottomSheetKt$DialogLikeBottomSheet$2.INSTANCE;
                } else {
                    onClickCancel3 = onClickCancel;
                }
                if ((i9 & 512) != 0) {
                    onDismiss3 = onClickCancel3;
                    $dirty &= -1879048193;
                } else {
                    onDismiss3 = onDismiss;
                }
                content3 = i13 != 0 ? ComposableSingletons$DialogLikeBottomSheetKt.INSTANCE.m2932getLambda1$app_miniDebug() : content;
            } else {
                $composer2.skipToGroupEnd();
                if ((i9 & 4) != 0) {
                    $dirty &= -897;
                }
                if ((i9 & 8) != 0) {
                    $dirty &= -7169;
                }
                if ((i9 & 16) != 0) {
                    $dirty &= -57345;
                }
                if ((i9 & 32) != 0) {
                    $dirty &= -458753;
                }
                if ((i9 & 64) != 0) {
                    $dirty &= -3670017;
                }
                if ((i9 & 512) != 0) {
                    modifier3 = modifier;
                    title3 = title;
                    onClickConfirm3 = onClickConfirm;
                    onClickCancel3 = onClickCancel;
                    $dirty = -1879048193 & $dirty;
                    hideKeyboard3 = z;
                    onDismiss3 = onDismiss;
                    content3 = content;
                } else {
                    modifier3 = modifier;
                    title3 = title;
                    onClickConfirm3 = onClickConfirm;
                    onClickCancel3 = onClickCancel;
                    content3 = content;
                    hideKeyboard3 = z;
                    onDismiss3 = onDismiss;
                }
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1700682427, $dirty, $dirty1, "vegabobo.dsusideloader.ui.components.DialogLikeBottomSheet (DialogLikeBottomSheet.kt:24)");
            }
            $composer2.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation($composer2, "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
            Composer composer$iv = $composer2;
            $composer2.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation($composer2, "CC(remember):Composables.kt#9igjgp");
            Composer $this$cache$iv$iv$iv = $composer2;
            Object it$iv$iv$iv = $this$cache$iv$iv$iv.rememberedValue();
            if (it$iv$iv$iv == Composer.Companion.getEmpty()) {
                Object obj = it$iv$iv$iv;
                Composer composer = composer$iv;
                value$iv$iv$iv = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer$iv));
                $this$cache$iv$iv$iv.updateRememberedValue(value$iv$iv$iv);
            } else {
                Object it$iv$iv$iv2 = it$iv$iv$iv;
                Object it$iv$iv$iv3 = $this$cache$iv$iv$iv;
                value$iv$iv$iv = it$iv$iv$iv2;
            }
            $composer2.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) value$iv$iv$iv).getCoroutineScope();
            $composer2.endReplaceableGroup();
            $composer2.startReplaceableGroup(-1241958891);
            ComposerKt.sourceInformation($composer2, "40@1567L7,41@1609L7");
            if (hideKeyboard3) {
                SoftwareKeyboardController current = LocalSoftwareKeyboardController.INSTANCE.getCurrent($composer2, LocalSoftwareKeyboardController.$stable);
                if (current != null) {
                    current.hide();
                }
                CompositionLocal this_$iv = CompositionLocalsKt.getLocalFocusManager();
                hideKeyboard4 = hideKeyboard3;
                ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = $composer2.consume(this_$iv);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                FocusManager.clearFocus$default((FocusManager) consume, false, 1, (Object) null);
            } else {
                hideKeyboard4 = hideKeyboard3;
            }
            $composer2.endReplaceableGroup();
            CustomBottomSheetKt.CustomBottomSheet(modifier3, title3, icon, onDismiss3, ComposableLambdaKt.composableLambda($composer2, 972084261, true, new DialogLikeBottomSheetKt$DialogLikeBottomSheet$3(text2, $dirty, content3, $dirty1, cancelText2, confirmText2, coroutineScope, onClickCancel3, onClickConfirm3)), $composer2, ($dirty & 14) | 24576 | (($dirty >> 3) & 112) | (($dirty << 3) & 896) | (($dirty >> 18) & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            hideKeyboard2 = hideKeyboard4;
            content2 = content3;
            int i15 = $dirty;
            modifier2 = modifier3;
            onClickCancel2 = onClickCancel3;
            onClickConfirm2 = onClickConfirm3;
            title2 = title3;
            text3 = text2;
            confirmText3 = confirmText2;
            cancelText3 = cancelText2;
            onDismiss2 = onDismiss3;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup == null) {
            int i16 = $dirty1;
            Composer composer2 = $composer2;
            Modifier modifier6 = modifier2;
            return;
        }
        int i17 = $dirty1;
        Composer composer3 = $composer2;
        Modifier modifier7 = modifier2;
        DialogLikeBottomSheetKt$DialogLikeBottomSheet$4 dialogLikeBottomSheetKt$DialogLikeBottomSheet$4 = r0;
        DialogLikeBottomSheetKt$DialogLikeBottomSheet$4 dialogLikeBottomSheetKt$DialogLikeBottomSheet$42 = new DialogLikeBottomSheetKt$DialogLikeBottomSheet$4(modifier2, icon, title2, text3, confirmText3, cancelText3, hideKeyboard2, onClickConfirm2, onClickCancel2, onDismiss2, content2, $changed, $changed1, i);
        endRestartGroup.updateScope(dialogLikeBottomSheetKt$DialogLikeBottomSheet$4);
    }
}
