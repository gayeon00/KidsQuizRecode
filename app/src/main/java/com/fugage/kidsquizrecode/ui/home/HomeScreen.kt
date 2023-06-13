package com.fugage.kidsquizrecode.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.chargemap.compose.numberpicker.FullHours
import com.chargemap.compose.numberpicker.Hours
import com.chargemap.compose.numberpicker.HoursNumberPicker
import com.chargemap.compose.numberpicker.NumberPicker
import com.fugage.kidsquizrecode.ui.theme.md_theme_dark_onBackground
import com.fugage.kidsquizrecode.ui.theme.md_theme_dark_onSurface
import com.fugage.kidsquizrecode.ui.theme.md_theme_light_onSurface

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    navHostController: NavHostController? = null,
) {
    var agePickerValue by remember { mutableStateOf(0) }
    var fullHourPickerValue by remember { mutableStateOf<Hours>(FullHours(0, 0)) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Text(text = "우리 아이는 몇 살 인가요?")

        Card(modifier = modifier) {
            NumberPicker(
                value = 2,
                onValueChange = {
                    agePickerValue = it
                },
                range = 2..6,
                dividersColor = md_theme_light_onSurface,
            )
        }

        Text(text = "몇 분에 한 번씩 퀴즈를 풀까요?")
        Card(modifier = modifier) {
            HoursNumberPicker(
                value = fullHourPickerValue,
                onValueChange = { fullHourPickerValue = it },
                hoursDivider = {
                    Text(
                        text = "분"
                    )
                },
                hoursRange = 0..59,
                minutesDivider = {
                    Text(
                        text = "초"
                    )
                },
                minutesRange = 0..59,
                dividersColor = md_theme_light_onSurface
            )
        }
    }

}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
