package com.fugage.kidsquizrecode.ui

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.navigation.compose.rememberNavController
import com.fugage.kidsquizrecode.ui.theme.KidsQuizRecodeTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun KidsQuizApp() {
    KidsQuizRecodeTheme {
        val navController = rememberNavController()

        val items = listOf(
            Screen.Home,
            Screen.Stat,
            Screen.Profile
        )

        Scaffold(
            bottomBar = {
                KidsQuizBottomNavigation(
                    navController = navController,
                    items = items
                )
            }
        ) {
            KidsQuizNavGraph(navController = navController)
        }
    }
}