package com.fugage.kidsquizrecode.ui.home

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.BarChart
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.List
import androidx.compose.ui.graphics.vector.ImageVector
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