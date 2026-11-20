package com.example.uikit

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UiKitSelect(
    topText: String? = null,
    mainText: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.Start
    ) {
        if (topText != null) {
            Text(
                topText,
                fontSize = 8.sp,
                fontFamily = FontFamily(Font(R.font.poppins_reg)),
                color = UiKitColor.redMain
            )
            Spacer(Modifier.height(10.dp))
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable(onClick = { })
        ) {
            Text(mainText, fontSize = 12.sp, fontFamily = FontFamily(Font(R.font.poppins_reg)))
            Spacer(Modifier.width(16.dp))
            Icon(painterResource(R.drawable.dropdown), contentDescription = null)
        }
    }
}