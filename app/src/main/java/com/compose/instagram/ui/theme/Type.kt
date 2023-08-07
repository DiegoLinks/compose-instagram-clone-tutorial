package com.compose.instagram.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.compose.instagram.R

val instagramFont = FontFamily(Font(R.font.billabong))

fun typography(onBackGround:Color): Typography{
    return Typography(
        bodyLarge = TextStyle(
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Normal,
            fontSize = fontSmall,
            color = onBackGround
        ),
        headlineLarge = TextStyle(
            fontFamily = instagramFont,
            fontWeight = FontWeight.Normal,
            fontSize = fontXXLarge,
            color = onBackGround
        )
    )
}