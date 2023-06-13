package com.fugage.kidsquizrecode.ui

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.fugage.kidsquizrecode.R
import com.fugage.kidsquizrecode.ui.theme.KidsQuizRecodeTheme


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
                KidsQuizTopAppBar()
            }
        ) {
            KidsQuizNavHost(navController = navController, paddingValues = it)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun KidsQuizTopAppBar(
    modifier: Modifier = Modifier,
) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(R.string.korean_app_name),
                style = MaterialTheme.typography.displayLarge
            )
        },
        modifier = modifier
    )
}

@Preview
@Composable
fun KidsQuizAppPreview() {
    KidsQuizApp()
}