package com.fugage.kidsquizrecode.ui.home

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.BarChart
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.List
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import com.fugage.kidsquizrecode.R

enum class HomeSections(
    @StringRes val title: Int,
    val icon: ImageVector,
    val route: String
){
    STAT(R.string.home_stat, Icons.Outlined.BarChart, "home/stat"),
    QUIZ(R.string.home_quiz, Icons.Outlined.Home, "home/quiz"),
    PROFILE(R.string.home_profile, Icons.Outlined.Home, "home/profile"),
}

@Composable
fun KidsQuizBottomNavigation(
    tabs: Array<HomeSections>,
    currentRoute: String,
    navigateToRoute: (String) -> Unit,
) {
    val currentSection = tabs.first { it.route == currentRoute }

    NavigationBar() {
        tabs.forEach { section ->
            val selected = section==currentSection
            val text = stringResource(section.title)
            NavigationBarItem(
                icon = {Icon(section.icon, contentDescription = text)},
                label = { Text(text = text)},
                selected = selected,
                onClick = {navigateToRoute(section.route)}
            )
        }
    }
}