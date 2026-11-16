package com.example.uikit

import androidx.annotation.Size
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UiKitCard(
    modifier: Modifier = Modifier,
    header: String,
    description: String,
    img: Int,
    imgModifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(170.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(brush = UiKitColor.redGradientMain)
            .clickable(onClick = onClick)
            .padding(top = 30.dp, start = 24.dp, bottom = 24.dp, end = 22.dp)
    ) {
        Row(modifier = Modifier.fillMaxSize()) {
            Column(horizontalAlignment = Alignment.Start, modifier = Modifier.weight(1f)) {
                Text(header, style = UiKitTypography.caption2Bold, color = Color.White)
                Spacer(Modifier.height(14.dp))
                Text(
                    description,
                    fontFamily = FontFamily(Font(R.font.sans_regular)),
                    fontSize = 10.sp,
                    color = Color.White
                )
                Spacer(Modifier.weight(1f))
                Icon(
                    painterResource(R.drawable.forward_arrow),
                    contentDescription = null,
                    tint = Color.White
                )
            }
            Image(
                painterResource(img),
                contentDescription = null,
                modifier = imgModifier
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun praa() {
    UiKitCard(
        header = "Schedule",
        description = "Easily schedule event/games then find like minded players for battle. You up for it?",
        img = R.drawable.e0eede2c998db45f76c40f1c4cc113d1f64011e0,
        imgModifier = Modifier
            .size(112.dp, 107.dp),
        onClick = {}
    )
}