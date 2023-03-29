package com.fugage.kidsquizrecode.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.fugage.kidsquizrecode.ui.home.HomeScreen
import com.fugage.kidsquizrecode.ui.profile.ProfileScreen
import com.fugage.kidsquizrecode.ui.stat.StatScreen

@Composable
fun KidsQuizNavGraph(
    navController: NavHostController
){
    NavHost(
        navController,
        startDestination = Screen.Profile.route
    ) {
        composable(Screen.Home.route) { HomeScreen(navController) }
        composable(Screen.Stat.route) { StatScreen(navController) }
        composable(Screen.Profile.route) { ProfileScreen(navController) }
    }
}