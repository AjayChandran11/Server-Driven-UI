package com.example.serverdrivenui_analyticsapp

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

class Utils {
}

@Composable
fun Modifier.updateDimensions(width: Int, height: Int, widthPercentage: Float, heightPercentage: Float): Modifier{
    when(width) {
        -1 -> this.fillMaxWidth()
        -3 -> this.fillMaxWidth(fraction = widthPercentage)
    }
    when(height) {
        -1 -> this.fillMaxHeight()
        -3 -> this.fillMaxHeight(fraction = heightPercentage)
    }

    return this
}