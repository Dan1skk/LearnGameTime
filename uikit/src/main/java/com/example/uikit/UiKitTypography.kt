package com.example.uikit

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

private val sansSemiBold = FontFamily(Font(R.font.sans_semibold))
private val sansExtraBold = FontFamily(Font(R.font.sans_extrabold))
private val sansReg = FontFamily(Font(R.font.sans_regular))
private val sansMedium = FontFamily(Font(R.font.sans_medium))
private val sansBold = FontFamily(Font(R.font.sans_bold))

object UiKitTypography {

    val title1Semibold = TextStyle(
        fontFamily = sansSemiBold,
        fontSize = 24.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 28.sp
    )
    val title1ExtraBold = TextStyle(
        fontFamily = sansExtraBold,
        fontSize = 24.sp,
        fontWeight = FontWeight.ExtraBold,
        lineHeight = 28.sp

    )

    val title2Regular = TextStyle(
        fontFamily = sansReg,
        fontSize = 20.sp,
        lineHeight = 28.sp,

    )
    val title2SemiBold = TextStyle(
        fontFamily = sansSemiBold,
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 28.sp

    )
    val title2ExtraBold = TextStyle(
        fontFamily = sansExtraBold,
        fontSize = 20.sp,
        fontWeight = FontWeight.ExtraBold,
        lineHeight = 28.sp
    )

    val title3Regular = TextStyle(
        fontFamily = sansReg,
        fontSize = 17.sp,
        lineHeight = 24.sp
    )
    val title3Medium = TextStyle(
        fontFamily = sansMedium,
        fontSize = 17.sp,
        lineHeight = 24.sp,
        fontWeight = FontWeight.Medium
    )
    val title3SemiBold = TextStyle(
        fontFamily = sansSemiBold,
        fontSize = 17.sp,
        lineHeight = 24.sp,
        fontWeight = FontWeight.SemiBold
    )

    val headlineRegular = TextStyle(
        fontFamily = sansReg,
        fontSize = 16.sp,
        lineHeight = 20.sp,
    )
    val headlineMedium = TextStyle(
        fontFamily = sansMedium,
        fontSize = 16.sp,
        lineHeight = 20.sp,
        fontWeight = FontWeight.Medium
    )

    val textRegular = TextStyle(
        fontFamily = sansReg,
        fontSize = 15.sp,
        lineHeight = 20.sp
    )
    val textMedium = TextStyle(
        fontFamily = sansMedium,
        fontWeight = FontWeight.Medium,
        fontSize = 15.sp,
        lineHeight = 20.sp
    )

    val captionRegular = TextStyle(
        fontFamily = sansReg,
        fontSize = 14.sp,
        lineHeight = 20.sp
    )
    val captionSemibold = TextStyle(
        fontFamily = sansSemiBold,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        lineHeight = 20.sp
    )

    val caption2Regular = TextStyle(
        fontFamily = sansReg,
        fontSize = 12.sp,
        lineHeight = 16.sp
    )
    val caption2Bold = TextStyle(
        fontFamily = sansBold,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
        lineHeight = 16.sp
    )
}