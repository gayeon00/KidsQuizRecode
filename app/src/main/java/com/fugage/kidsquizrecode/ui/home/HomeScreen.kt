package com.fugage.kidsquizrecode.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.chargemap.compose.numberpicker.FullHours
import com.chargemap.compose.numberpicker.Hours
import com.chargemap.compose.numberpicker.HoursNumberPicker
import com.chargemap.compose.numberpicker.NumberPicker
import com.fugage.kidsquizrecode.R
import com.fugage.kidsquizrecode.ui.theme.md_theme_light_onSurface

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    navHostController: NavHostController? = null,
) {
    var agePickerValue by remember { mutableStateOf(0) }
    var fullHourPickerValue by remember { mutableStateOf<Hours>(FullHours(0, 0)) }

    val 

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .padding(PaddingValues(10.dp, 0.dp))
    ) {
        Text(
            text = stringResource(R.string.ask_child_age),
            style = MaterialTheme.typography.displayMedium
        )

        Spacer(modifier = modifier.height(20.dp))

        Card(modifier = modifier
            .fillMaxWidth()
        ) {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(PaddingValues(10.dp, 0.dp)),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ){
                NumberPicker(
                    value = agePickerValue,
                    onValueChange = {
                        agePickerValue = it
                    },
                    range = 2..6,
                    dividersColor = md_theme_light_onSurface,
                )
                Text(text = stringResource(R.string.age_old))
            }

        }

        Spacer(modifier = modifier.height(20.dp))

        Text(
            text = stringResource(R.string.ask_time_interval),
            style = MaterialTheme.typography.displayMedium
        )

        Spacer(modifier = modifier.height(20.dp))

        Card(modifier = modifier
            .fillMaxWidth()
        ) {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(PaddingValues(10.dp, 0.dp)),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ){
                HoursNumberPicker(
                    modifier = modifier
                        .width(200.dp),
                    value = fullHourPickerValue,
                    onValueChange = { fullHourPickerValue = it },
                    hoursDivider = {
                        Text(
                            text = stringResource(R.string.minute)
                        )
                    },
                    hoursRange = 0..59,
                    minutesDivider = {
                        Text(
                            text = stringResource(R.string.second)
                        )
                    },
                    minutesRange = 0..59,
                    dividersColor = md_theme_light_onSurface
                )
            }
        }

        Spacer(modifier = modifier.height(30.dp))

        Button(
            modifier = modifier
                .fillMaxWidth(),
            onClick = {
            /*TODO: 권한 받아오기*/
            }
        ) {
            Text("퀴즈 시작")
        }
    }

}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
