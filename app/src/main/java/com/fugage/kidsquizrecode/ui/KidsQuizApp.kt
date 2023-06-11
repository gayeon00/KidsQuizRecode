package com.fugage.kidsquizrecode.ui

import androidx.compose.foundation.background
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.fugage.kidsquizrecode.R
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
            },
            topBar = {
                TopAppBar(title = {
                    Text(text = stringResource(id = R.string.app_name))
                })
            }
        ) {
            KidsQuizNavHost(navController = navController, paddingValues = it)
        }
    }
}

@Preview
@Composable
fun KidsQuizAppPreview() {
    KidsQuizApp()
}