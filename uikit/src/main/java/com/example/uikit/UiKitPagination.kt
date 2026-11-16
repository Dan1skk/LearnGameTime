package com.example.uikit

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.graphics.alpha

@Composable
fun UiKitPagination(
    modifier: Modifier = Modifier,
    pageCount: Int,
    currentPage: Int
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalAlignment = Alignment.CenterVertically,

        ) {
        for (i in 0 until pageCount) {
            val isSelected = i == currentPage
            val boxColor: Color =
                if (isSelected) Color(0xFFFA5075) else Color(0xFFFA5075).copy(alpha = 0.35f)

            Box(
                modifier = Modifier
                    .size(10.dp)
                    .clip(CircleShape)
                    .background(color = boxColor)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun prevva() {
    UiKitPagination(pageCount = 3, currentPage = 0)
}