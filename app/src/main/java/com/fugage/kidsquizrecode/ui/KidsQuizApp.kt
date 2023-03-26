package com.fugage.kidsquizrecode.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.fugage.kidsquizrecode.ui.home.HomeSections
import com.fugage.kidsquizrecode.ui.home.KidsQuizBottomNavigation
import com.fugage.kidsquizrecode.ui.theme.KidsQuizRecodeTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun KidsQuizApp() {
    KidsQuizRecodeTheme {
        val navTabs = HomeSections.values()
        val appState = rememberKidsQuizAppState()
        Scaffold(
            bottomBar = {
                KidsQuizBottomNavigation(
                    tabs = navTabs,
                    currentRoute =  appState.currentRoute!!,
                    navigateToRoute = appState::navigateToNavRoute
                )
            }
        ) {
            Surface(
                modifier = Modifier.fillMaxSize(),
            ) {
                Greeting("Android")
            }
        }
/*        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {
            Greeting("Android")
        }*/
    }
}

/*@Composable
fun KidsQuizBottomNavigation(){
    var selectedItem by remember { mutableStateOf(0) }
    val items = listOf("Songs", "Artists", "Playlists")
    NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = { Icon(Icons.Filled.Favorite, contentDescription = item) },
                label = { Text(item) },
                selected = selectedItem == index,
                onClick = { selectedItem = index }
            )
        }
    }
}*/

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}