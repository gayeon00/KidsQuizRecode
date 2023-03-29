package com.fugage.kidsquizrecode.ui

import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination

/**
 * Destinations used in the [KidsQuiz]
 */

object KidsQuizDestinations {
    const val HOME_ROUTE = "home"
    const val STAT_ROUTE = "stat"
    const val PROFILE_ROUTE = "profile"
}

/**
 * Models the navigation actions in the app.
 */
class KidsQuizNavigationActions(navController: NavController) {
    val navigateToHome: () -> Unit = {
        navController.navigate(KidsQuizDestinations.HOME_ROUTE){
            // Pop up to the start destination of the graph to
            // avoid building up a large stack of destinations
            // on the back stack as users select items
            popUpTo(navController.graph.findStartDestination().id){
                saveState = true
            }
            // Avoid multiple copies of the same destination when
            // reselecting the same item
            launchSingleTop = true
            // Restore state when reselecting a previously selected item
            restoreState = true
        }
    }
    val navigateToStat: () -> Unit = {
        navController.navigate(KidsQuizDestinations.STAT_ROUTE){
            // Pop up to the start destination of the graph to
            // avoid building up a large stack of destinations
            // on the back stack as users select items
            popUpTo(navController.graph.findStartDestination().id){
                saveState = true
            }
            // Avoid multiple copies of the same destination when
            // reselecting the same item
            launchSingleTop = true
            // Restore state when reselecting a previously selected item
            restoreState = true
        }
    }

    val navigateToProfile: () -> Unit = {
        navController.navigate(KidsQuizDestinations.PROFILE_ROUTE){
            // Pop up to the start destination of the graph to
            // avoid building up a large stack of destinations
            // on the back stack as users select items
            popUpTo(navController.graph.findStartDestination().id){
                saveState = true
            }
            // Avoid multiple copies of the same destination when
            // reselecting the same item
            launchSingleTop = true
            // Restore state when reselecting a previously selected item
            restoreState = true
        }
    }
}
