package com.example.uikit

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

object UiKitColor {
    val accent = Color(0xFF2074F2)
    val accentInactive = Color(0xFFC5D2FF)
    val black = Color(0xFF2D2C2C)
    val white = Color(0xFFF7F7F7)
    val error = Color(0xFFFF4646)
    val success = Color(0xFF00B412)
    val inputBG = Color(0xFFF7F7FA)
    val inputStrok = Color(0xFFE6E6E6)
    val inputIconki = Color(0xFFBFC7D1)
    val placeHolder = Color(0xFF98989A)
    val description = Color(0xFF8787A1)
    val cardStrok = Color(0xFFF2F2F2)

    val redGradientMain = Brush.linearGradient(
        listOf(
            Color(0xFFFF6480), Color(0xFFF22E63)
        )
    )
}