package com.fugage.kidsquizrecode.ui

import androidx.compose.runtime.Composable
import androidx.compose.material.ScaffoldState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.fugage.kidsquizrecode.ui.home.HomeSections
import kotlinx.coroutines.CoroutineScope

/**
 * Remembers and creates an instance of [KidsQuizAppState]
 */
@Composable
fun rememberKidsQuizAppState(
    scaffoldState: ScaffoldState = rememberScaffoldState(),
    navController: NavHostController = rememberNavController(),
    coroutineScope: CoroutineScope = rememberCoroutineScope()
) =
    remember(scaffoldState, navController, coroutineScope) {
        KidsQuizAppState(scaffoldState, navController, coroutineScope)
    }

/**
 * Responsible for holding state related to [KidsQuizAppState] and containing UI-related logic.
 */
@Stable
class KidsQuizAppState(
    val scaffoldState: ScaffoldState,
    val navController: NavHostController,
    coroutineScope: CoroutineScope
) {

    val currentRoute: String?
        get() = navController.currentDestination?.route

    fun upPress(){
        navController.navigateUp()
    }

    fun navigateToNavRoute(route: String){
        if(route!=currentRoute){
            navController.navigate(route){
                launchSingleTop = true
                restoreState = true
                // Pop up backstack to the first destination and save state. This makes going back
                // to the start destination when pressing back in any other bottom tab.
                popUpTo(findStartDestination(navController.graph).id){
                    saveState = true
                }
                
            }
        }
    }

    //이게 멀까...?
    private tailrec fun findStartDestination(graph: NavDestination): NavDestination {
        return if(graph is NavGraph) findStartDestination(graph.findStartDestination()) else graph
    }


}
