package com.fugage.kidsquizrecode.ui.home

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(
    navHostController: NavHostController
){
    Surface {
        Text(text = "Hello window!")
    }
}
