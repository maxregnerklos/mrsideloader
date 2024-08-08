package vegabobo.dsusideloader.ui.screen;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavGraphBuilderKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import vegabobo.dsusideloader.ui.screen.about.AboutScreenKt;
import vegabobo.dsusideloader.ui.screen.about.AboutViewModel;
import vegabobo.dsusideloader.ui.screen.adb.AdbScreenKt;
import vegabobo.dsusideloader.ui.screen.adb.AdbViewModel;
import vegabobo.dsusideloader.ui.screen.home.HomeScreenKt;
import vegabobo.dsusideloader.ui.screen.home.HomeViewModel;
import vegabobo.dsusideloader.ui.screen.libraries.LibrariesScreenKt;
import vegabobo.dsusideloader.ui.screen.settings.SettingsScreenKt;
import vegabobo.dsusideloader.ui.screen.settings.SettingsViewModel;

/* compiled from: Navigation.kt */
public final class NavigationKt$Navigation$1 extends Lambda implements Function1 {
    public final /* synthetic */ NavHostController $navController;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationKt$Navigation$1(NavHostController navHostController) {
        super(1);
        this.$navController = navHostController;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        invoke((NavGraphBuilder) p1);
        return Unit.INSTANCE;
    }

    public static final void invoke$navigate(NavHostController navController, String destination) {
        if (Intrinsics.areEqual((Object) destination, (Object) "up")) {
            navController.navigateUp();
        } else {
            NavController.navigate$default(navController, destination, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        }
    }

    public final void invoke(NavGraphBuilder $this$NavHost) {
        Intrinsics.checkNotNullParameter($this$NavHost, "$this$NavHost");
        final NavHostController navHostController = this.$navController;
        NavGraphBuilderKt.composable$default($this$NavHost, "home", (List) null, (List) null, ComposableLambdaKt.composableLambdaInstance(115966336, true, new Function3() {
            public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
                invoke((NavBackStackEntry) p1, (Composer) p2, ((Number) p3).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(NavBackStackEntry it, Composer $composer, int $changed) {
                Intrinsics.checkNotNullParameter(it, "it");
                ComposerKt.sourceInformation($composer, "C33@1205L33:Navigation.kt#i3zc1p");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(115966336, $changed, -1, "vegabobo.dsusideloader.ui.screen.Navigation.<anonymous>.<anonymous> (Navigation.kt:33)");
                }
                final NavHostController navHostController = navHostController;
                HomeScreenKt.Home(new Function1() {
                    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                        invoke((String) p1);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(String it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        NavigationKt$Navigation$1.invoke$navigate(navHostController, it);
                    }
                }, (HomeViewModel) null, $composer, 0, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 6, (Object) null);
        final NavHostController navHostController2 = this.$navController;
        NavGraphBuilderKt.composable$default($this$NavHost, "preferences", (List) null, (List) null, ComposableLambdaKt.composableLambdaInstance(-4456457, true, new Function3() {
            public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
                invoke((NavBackStackEntry) p1, (Composer) p2, ((Number) p3).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(NavBackStackEntry it, Composer $composer, int $changed) {
                Intrinsics.checkNotNullParameter(it, "it");
                ComposerKt.sourceInformation($composer, "C34@1288L37:Navigation.kt#i3zc1p");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-4456457, $changed, -1, "vegabobo.dsusideloader.ui.screen.Navigation.<anonymous>.<anonymous> (Navigation.kt:34)");
                }
                final NavHostController navHostController = navHostController2;
                SettingsScreenKt.Settings(new Function1() {
                    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                        invoke((String) p1);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(String it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        NavigationKt$Navigation$1.invoke$navigate(navHostController, it);
                    }
                }, (SettingsViewModel) null, $composer, 0, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 6, (Object) null);
        final NavHostController navHostController3 = this.$navController;
        NavGraphBuilderKt.composable$default($this$NavHost, "adb_installation", (List) null, (List) null, ComposableLambdaKt.composableLambdaInstance(-1452463304, true, new Function3() {
            public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
                invoke((NavBackStackEntry) p1, (Composer) p2, ((Number) p3).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(NavBackStackEntry it, Composer $composer, int $changed) {
                Intrinsics.checkNotNullParameter(it, "it");
                ComposerKt.sourceInformation($composer, "C35@1379L38:Navigation.kt#i3zc1p");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1452463304, $changed, -1, "vegabobo.dsusideloader.ui.screen.Navigation.<anonymous>.<anonymous> (Navigation.kt:35)");
                }
                final NavHostController navHostController = navHostController3;
                AdbScreenKt.AdbScreen(new Function1() {
                    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                        invoke((String) p1);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(String it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        NavigationKt$Navigation$1.invoke$navigate(navHostController, it);
                    }
                }, (AdbViewModel) null, $composer, 0, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 6, (Object) null);
        final NavHostController navHostController4 = this.$navController;
        NavGraphBuilderKt.composable$default($this$NavHost, "about", (List) null, (List) null, ComposableLambdaKt.composableLambdaInstance(1394497145, true, new Function3() {
            public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
                invoke((NavBackStackEntry) p1, (Composer) p2, ((Number) p3).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(NavBackStackEntry it, Composer $composer, int $changed) {
                Intrinsics.checkNotNullParameter(it, "it");
                ComposerKt.sourceInformation($composer, "C36@1461L40:Navigation.kt#i3zc1p");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1394497145, $changed, -1, "vegabobo.dsusideloader.ui.screen.Navigation.<anonymous>.<anonymous> (Navigation.kt:36)");
                }
                final NavHostController navHostController = navHostController4;
                AboutScreenKt.AboutScreen(new Function1() {
                    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                        invoke((String) p1);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(String it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        NavigationKt$Navigation$1.invoke$navigate(navHostController, it);
                    }
                }, (AboutViewModel) null, $composer, 0, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 6, (Object) null);
        final NavHostController navHostController5 = this.$navController;
        NavGraphBuilderKt.composable$default($this$NavHost, "libraries", (List) null, (List) null, ComposableLambdaKt.composableLambdaInstance(-53509702, true, new Function3() {
            public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
                invoke((NavBackStackEntry) p1, (Composer) p2, ((Number) p3).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(NavBackStackEntry it, Composer $composer, int $changed) {
                Intrinsics.checkNotNullParameter(it, "it");
                ComposerKt.sourceInformation($composer, "C37@1549L44:Navigation.kt#i3zc1p");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-53509702, $changed, -1, "vegabobo.dsusideloader.ui.screen.Navigation.<anonymous>.<anonymous> (Navigation.kt:37)");
                }
                final NavHostController navHostController = navHostController5;
                LibrariesScreenKt.LibrariesScreen(new Function1() {
                    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                        invoke((String) p1);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(String it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        NavigationKt$Navigation$1.invoke$navigate(navHostController, it);
                    }
                }, $composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 6, (Object) null);
    }
}
