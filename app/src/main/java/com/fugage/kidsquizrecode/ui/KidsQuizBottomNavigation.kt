package com.fugage.kidsquizrecode.ui

import androidx.annotation.StringRes
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.BarChart
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.fugage.kidsquizrecode.R
import androidx.compose.ui.Modifier

sealed class Screen(
    val route: String,
    @StringRes val resourceId: Int,
    val icon: ImageVector,
    val title: String
) {
    object Home : Screen("home", R.string.home, Icons.Outlined.Home, "키즈퀴즈")
    object Stat : Screen("stat", R.string.stat, Icons.Outlined.BarChart, "통계")
    object MyPage : Screen("my_page", R.string.my_page, Icons.Outlined.AccountCircle, "마이페이지")
}

@Composable
fun KidsQuizBottomNavigation(
    navController: NavController,
    items: List<Screen>,
    modifier: Modifier = Modifier,
    onTitleChange: (String) -> Unit
) {
    NavigationBar(
        modifier = modifier
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination
        items.forEach { screen ->
            NavigationBarItem(
                icon = { Icon(screen.icon, contentDescription = null) },
                label = { Text(stringResource(screen.resourceId)) },
                selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
                onClick = {
                    navController.navigate(screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }

                    onTitleChange(screen.title)
                }
            )
        }
    }
}