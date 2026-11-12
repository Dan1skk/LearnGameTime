package com.example.uikit

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UiKitButton(
    onClick: () -> Unit,
    name: String
) {
    TextButton(
        onClick = onClick,
        modifier = Modifier
            .size(width = 224.dp, height = 58.dp)
            .background(
                UiKitColor.redGradientMain,
                RoundedCornerShape(100)
            ),

        ) {
        Text(
            name,
            fontFamily = FontFamily(Font(R.font.poppins_semibold)),
            fontSize = 14.sp,
            color = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
fun prevew() {
    UiKitButton({}, "Let’s Combat!")
}