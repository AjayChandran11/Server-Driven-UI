package com.example.serverdrivenui_analyticsapp.composeConverter.data

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
// match_parent = -1
// wrap_content = -2
// percentage value = -3
abstract class MockBaseDAO {
    abstract val comments: String
    abstract val featureID: Int
    abstract val width: Int
    abstract val height: Int
    abstract val widthPercentage: Float
    abstract val heightPercentage: Float
    abstract val padding: Padding
    abstract val margin: Margin
    abstract val backgroundColor: Color
    abstract val viewType: ViewType
}
