package com.fugage.kidsquizrecode.ui

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.fugage.kidsquizrecode.ui.theme.KidsQuizRecodeTheme


@Composable
fun KidsQuizApp() {
    KidsQuizRecodeTheme {
        var title by remember { mutableStateOf("키즈퀴즈") }
        val navController = rememberNavController()

        val items = listOf(
            Screen.Home,
            Screen.Stat,
            Screen.MyPage
        )

        Scaffold(
            bottomBar = {
                KidsQuizBottomNavigation(
                    navController = navController,
                    items = items
                ){ newTitle ->
                    title = newTitle
                }
            },
            topBar = {
                KidsQuizTopAppBar(
                    title = title
                )
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
    title: String,
) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = title,
                style = if (title == "키즈퀴즈") MaterialTheme.typography.displayLarge
                else MaterialTheme.typography.headlineLarge
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