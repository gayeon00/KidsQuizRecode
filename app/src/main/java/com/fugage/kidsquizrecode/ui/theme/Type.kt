package com.fugage.kidsquizrecode.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.fugage.kidsquizrecode.R

val NotoSansKR = FontFamily(
    Font(R.font.notosanskr_regular),
    Font(R.font.notosanskr_bold, FontWeight.Bold),
    Font(R.font.notosanskr_light, FontWeight.Light),
    Font(R.font.notosanskr_medium, FontWeight.Medium),
    Font(R.font.notosanskr_thin, FontWeight.Thin)
)

val GasoekOne = FontFamily(
    Font(R.font.gasoekone_regular)
)

// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = GasoekOne,
        fontWeight = FontWeight.Normal,
        fontSize = 36.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = NotoSansKR,
        fontWeight = FontWeight.Black,
        fontSize = 30.sp
    ),
    displayMedium = TextStyle(
        fontFamily = NotoSansKR,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    labelSmall = TextStyle(
        fontFamily = NotoSansKR,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = NotoSansKR,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

