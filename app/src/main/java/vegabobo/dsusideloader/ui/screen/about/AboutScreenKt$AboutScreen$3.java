package vegabobo.dsusideloader.ui.screen.about;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.C0001R$string;
import vegabobo.dsusideloader.ui.cards.updater.UpdaterCardKt;
import vegabobo.dsusideloader.ui.components.PreferenceItemKt;
import vegabobo.dsusideloader.ui.components.SimpleCardKt;
import vegabobo.dsusideloader.ui.components.TitleKt;

/* compiled from: AboutScreen.kt */
public final class AboutScreenKt$AboutScreen$3 extends Lambda implements Function2 {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ AboutViewModel $aboutViewModel;
    public final /* synthetic */ Function1 $navigate;
    public final /* synthetic */ State $uiState$delegate;
    public final /* synthetic */ UriHandler $uriHandler;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AboutScreenKt$AboutScreen$3(State state, AboutViewModel aboutViewModel, UriHandler uriHandler, Function1 function1, int i) {
        super(2);
        this.$uiState$delegate = state;
        this.$aboutViewModel = aboutViewModel;
        this.$uriHandler = uriHandler;
        this.$navigate = function1;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
        invoke((Composer) p1, ((Number) p2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer $composer, int $changed) {
        Composer composer = $composer;
        int i = $changed;
        ComposerKt.sourceInformation(composer, "C75@2847L446,84@3321L41,83@3302L139,87@3450L596,102@4074L43,101@4055L141,105@4205L1182:AboutScreen.kt#bgkqvw");
        if ((i & 11) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1126364708, i, -1, "vegabobo.dsusideloader.ui.screen.about.AboutScreen.<anonymous> (AboutScreen.kt:74)");
            }
            UpdaterCardState updaterCardState = AboutScreenKt.AboutScreen$lambda$0(this.$uiState$delegate).getUpdaterCardState();
            boolean isUpdaterAvailable = AboutScreenKt.AboutScreen$lambda$0(this.$uiState$delegate).isUpdaterAvailable();
            final AboutViewModel aboutViewModel = this.$aboutViewModel;
            AnonymousClass1 r3 = new Function0() {
                public final void invoke() {
                    aboutViewModel.onClickImage();
                }
            };
            final AboutViewModel aboutViewModel2 = this.$aboutViewModel;
            AnonymousClass2 r4 = new Function0() {
                public final void invoke() {
                    aboutViewModel2.onClickCheckUpdates();
                }
            };
            final AboutViewModel aboutViewModel3 = this.$aboutViewModel;
            AnonymousClass3 r5 = new Function0() {
                public final void invoke() {
                    aboutViewModel3.onClickDownloadUpdate();
                }
            };
            final UriHandler uriHandler = this.$uriHandler;
            final AboutViewModel aboutViewModel4 = this.$aboutViewModel;
            UpdaterCardKt.UpdaterCard(updaterCardState, isUpdaterAvailable, r3, r4, r5, new Function0() {
                public final void invoke() {
                    uriHandler.openUri(aboutViewModel4.getResponse().getChangelogUrl());
                }
            }, $composer, 0);
            String stringResource = StringResources_androidKt.stringResource(C0001R$string.application, composer, 0);
            Modifier.Companion companion = Modifier.Companion;
            LiveLiterals$AboutScreenKt liveLiterals$AboutScreenKt = LiveLiterals$AboutScreenKt.INSTANCE;
            TitleKt.Title(stringResource, PaddingKt.m225paddingqDBjuR0$default(companion, 0.0f, Dp.m2350constructorimpl((float) liveLiterals$AboutScreenKt.m3040Int$$$this$call$getdp$$arg1$callpadding$arg1$callTitle$fun$anonymous$$arg7$callApplicationScreen$funAboutScreen()), 0.0f, Dp.m2350constructorimpl((float) liveLiterals$AboutScreenKt.m3043Int$$$this$call$getdp$$arg3$callpadding$arg1$callTitle$fun$anonymous$$arg7$callApplicationScreen$funAboutScreen()), 5, (Object) null), composer, 0, 0);
            boolean r10 = liveLiterals$AboutScreenKt.m3037Boolean$arg8$callSimpleCard$fun$anonymous$$arg7$callApplicationScreen$funAboutScreen();
            final Function1 function1 = this.$navigate;
            final int i2 = this.$$dirty;
            final UriHandler uriHandler2 = this.$uriHandler;
            SimpleCardKt.m3027SimpleCardYod850M((Modifier) null, (String) null, (String) null, false, false, 0, false, false, r10, ComposableLambdaKt.composableLambda(composer, -830770092, true, new Function2() {
                public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
                    invoke((Composer) p1, ((Number) p2).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer $composer, int $changed) {
                    Object value$iv$iv;
                    Composer composer = $composer;
                    int i = $changed;
                    ComposerKt.sourceInformation(composer, "C91@3558L41,92@3631L53,90@3518L258,96@3829L45,97@3906L51,98@3985L36,95@3789L247:AboutScreen.kt#bgkqvw");
                    if ((i & 11) != 2 || !$composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-830770092, i, -1, "vegabobo.dsusideloader.ui.screen.about.AboutScreen.<anonymous>.<anonymous> (AboutScreen.kt:89)");
                        }
                        String stringResource = StringResources_androidKt.stringResource(C0001R$string.github_repo, composer, 0);
                        String stringResource2 = StringResources_androidKt.stringResource(C0001R$string.github_repo_description, composer, 0);
                        final UriHandler uriHandler = uriHandler2;
                        PreferenceItemKt.PreferenceItem(stringResource, stringResource2, (ImageVector) null, new Function1() {
                            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                                invoke(((Boolean) p1).booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean it) {
                                uriHandler.openUri("https://github.com/VegaBobo/DSU-Sideloader");
                            }
                        }, false, false, false, $composer, 0, 116);
                        String stringResource3 = StringResources_androidKt.stringResource(C0001R$string.libraries_title, composer, 0);
                        String stringResource4 = StringResources_androidKt.stringResource(C0001R$string.libraries_description, composer, 0);
                        Object key1$iv = function1;
                        Function1 function1 = function1;
                        int i2 = i2 & 14;
                        composer.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
                        boolean invalid$iv$iv = composer.changed(key1$iv);
                        Composer $this$cache$iv$iv = $composer;
                        Object it$iv$iv = $this$cache$iv$iv.rememberedValue();
                        if (invalid$iv$iv || it$iv$iv == Composer.Companion.getEmpty()) {
                            value$iv$iv = new AboutScreenKt$AboutScreen$3$5$2$1(function1);
                            $this$cache$iv$iv.updateRememberedValue(value$iv$iv);
                        } else {
                            value$iv$iv = it$iv$iv;
                        }
                        $composer.endReplaceableGroup();
                        PreferenceItemKt.PreferenceItem(stringResource3, stringResource4, (ImageVector) null, value$iv$iv, false, false, false, $composer, 0, 116);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    $composer.skipToGroupEnd();
                }
            }), $composer, 805306368, 255);
            TitleKt.Title(StringResources_androidKt.stringResource(C0001R$string.collaborators, composer, 0), PaddingKt.m225paddingqDBjuR0$default(companion, 0.0f, Dp.m2350constructorimpl((float) liveLiterals$AboutScreenKt.m3041Int$$$this$call$getdp$$arg1$callpadding$arg1$callTitle1$fun$anonymous$$arg7$callApplicationScreen$funAboutScreen()), 0.0f, Dp.m2350constructorimpl((float) liveLiterals$AboutScreenKt.m3044Int$$$this$call$getdp$$arg3$callpadding$arg1$callTitle1$fun$anonymous$$arg7$callApplicationScreen$funAboutScreen()), 5, (Object) null), composer, 0, 0);
            boolean r102 = liveLiterals$AboutScreenKt.m3038Boolean$arg8$callSimpleCard1$fun$anonymous$$arg7$callApplicationScreen$funAboutScreen();
            final UriHandler uriHandler3 = this.$uriHandler;
            SimpleCardKt.m3027SimpleCardYod850M((Modifier) null, (String) null, (String) null, false, false, 0, false, false, r102, ComposableLambdaKt.composableLambda(composer, 1352690123, true, new Function2() {
                public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
                    invoke((Composer) p1, ((Number) p2).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer $composer, int $changed) {
                    Composer composer = $composer;
                    int i = $changed;
                    ComposerKt.sourceInformation(composer, "C110@4355L44,108@4273L219,115@4585L46,113@4505L217,118@4753L46,126@5156L48,127@5236L47,125@5116L261:AboutScreen.kt#bgkqvw");
                    if ((i & 11) != 2 || !$composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1352690123, i, -1, "vegabobo.dsusideloader.ui.screen.about.AboutScreen.<anonymous>.<anonymous> (AboutScreen.kt:107)");
                        }
                        LiveLiterals$AboutScreenKt liveLiterals$AboutScreenKt = LiveLiterals$AboutScreenKt.INSTANCE;
                        String r1 = liveLiterals$AboutScreenKt.m3045String$arg0$callPreferenceItem$fun$anonymous$$arg9$callSimpleCard1$fun$anonymous$$arg7$callApplicationScreen$funAboutScreen();
                        String stringResource = StringResources_androidKt.stringResource(C0001R$string.role_developer, composer, 0);
                        final UriHandler uriHandler = uriHandler3;
                        Composer composer2 = $composer;
                        PreferenceItemKt.PreferenceItem(r1, stringResource, (ImageVector) null, new Function1() {
                            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                                invoke(((Boolean) p1).booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean it) {
                                uriHandler.openUri("https://github.com/VegaBobo");
                            }
                        }, false, false, false, composer2, 0, 116);
                        String r12 = liveLiterals$AboutScreenKt.m3046String$arg0$callPreferenceItem1$fun$anonymous$$arg9$callSimpleCard1$fun$anonymous$$arg7$callApplicationScreen$funAboutScreen();
                        String stringResource2 = StringResources_androidKt.stringResource(C0001R$string.role_design_icon, composer, 0);
                        final UriHandler uriHandler2 = uriHandler3;
                        PreferenceItemKt.PreferenceItem(r12, stringResource2, (ImageVector) null, new Function1() {
                            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                                invoke(((Boolean) p1).booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean it) {
                                uriHandler2.openUri("https://github.com/WSTxda");
                            }
                        }, false, false, false, composer2, 0, 116);
                        String translators = StringResources_androidKt.stringResource(C0001R$string.translators_list, composer, 0);
                        composer.startReplaceableGroup(1341503239);
                        ComposerKt.sourceInformation(composer, "121@4941L47,122@5024L46,120@4897L192");
                        if ((translators.length() > 0) && !Intrinsics.areEqual((Object) translators, (Object) liveLiterals$AboutScreenKt.m3047String$arg1$callEQEQ$$this$callnot$branch$cond$if$fun$anonymous$$arg9$callSimpleCard1$fun$anonymous$$arg7$callApplicationScreen$funAboutScreen())) {
                            PreferenceItemKt.PreferenceItem(StringResources_androidKt.stringResource(C0001R$string.translators_title, composer, 0), StringResources_androidKt.stringResource(C0001R$string.translators_list, composer, 0), (ImageVector) null, (Function1) null, false, false, false, $composer, 0, 124);
                        }
                        $composer.endReplaceableGroup();
                        String stringResource3 = StringResources_androidKt.stringResource(C0001R$string.contributors_title, composer, 0);
                        String stringResource4 = StringResources_androidKt.stringResource(C0001R$string.contributors_text, composer, 0);
                        final UriHandler uriHandler3 = uriHandler3;
                        PreferenceItemKt.PreferenceItem(stringResource3, stringResource4, (ImageVector) null, new Function1() {
                            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                                invoke(((Boolean) p1).booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean it) {
                                uriHandler3.openUri("https://github.com/VegaBobo/DSU-Sideloader/graphs/contributors");
                            }
                        }, false, false, false, $composer, 0, 116);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    $composer.skipToGroupEnd();
                }
            }), $composer, 805306368, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        $composer.skipToGroupEnd();
    }
}
