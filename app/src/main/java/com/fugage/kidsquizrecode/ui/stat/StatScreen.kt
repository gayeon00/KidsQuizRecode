package com.fugage.kidsquizrecode.ui.stat
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun StatScreen(
    modifier: Modifier = Modifier,
    navHostController: NavHostController? = null,
    ){
    Surface {
        Text(text = "StatScreen!")
    }
}