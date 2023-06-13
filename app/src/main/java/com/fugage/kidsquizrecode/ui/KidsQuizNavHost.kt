package com.fugage.kidsquizrecode.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.fugage.kidsquizrecode.ui.home.HomeScreen
import com.fugage.kidsquizrecode.ui.profile.ProfileScreen
import com.fugage.kidsquizrecode.ui.stat.StatScreen

@Composable
fun KidsQuizNavHost(
    navController: NavHostController,
    paddingValues: PaddingValues
) {
    NavHost(
        navController,
        startDestination = Screen.Home.route,
        modifier = Modifier.padding(paddingValues)
    ) {
        composable(Screen.Home.route) { HomeScreen(navHostController = navController) }
        composable(Screen.Stat.route) { StatScreen(navHostController = navController) }
        composable(Screen.Profile.route) { ProfileScreen(navHostController = navController) }
    }
}