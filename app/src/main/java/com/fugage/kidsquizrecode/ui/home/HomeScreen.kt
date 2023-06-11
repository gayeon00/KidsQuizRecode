package com.fugage.kidsquizrecode.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(
    navHostController: NavHostController? = null
){
    Column(
        modifier = Modifier
            .padding(10.dp)
    ) {
        Text(text = "우리 아이는 몇 살 인가요?")

        Surface() {

        }

        Text(text = "몇 분에 한 번씩 퀴즈를 풀까요?")
    }

}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
