package vegabobo.dsusideloader.ui.screen;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;

/* compiled from: Navigation.kt */
public abstract class NavigationKt {
    public static final void Navigation(Composer $composer, int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-531434053);
        ComposerKt.sourceInformation($composer2, "C(Navigation)23@815L23,24@843L758:Navigation.kt#i3zc1p");
        if ($changed != 0 || !$composer2.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-531434053, $changed, -1, "vegabobo.dsusideloader.ui.screen.Navigation (Navigation.kt:22)");
            }
            NavHostController navController = NavHostControllerKt.rememberNavController(new Navigator[0], $composer2, 8);
            NavHostKt.NavHost(navController, "home", (Modifier) null, (String) null, new NavigationKt$Navigation$1(navController), $composer2, 56, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new NavigationKt$Navigation$2($changed));
        }
    }
}
