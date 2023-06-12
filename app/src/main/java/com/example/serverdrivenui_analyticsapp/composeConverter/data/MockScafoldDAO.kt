package com.example.serverdrivenui_analyticsapp.composeConverter.data

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.gson.annotations.SerializedName

data class MockScafoldDAO (
    @SerializedName("comments")
    override val comments: String = String(),

    @SerializedName("featureId")
    override val featureID: Int = 0,

    @SerializedName("width")
    override val width: Int = 0,

    @SerializedName("height")
    override val height: Int = 0,

    @SerializedName("widthPercentage")
    override val widthPercentage: Float = 0f,

    @SerializedName("height")
    override val heightPercentage: Float = 0f,

    @SerializedName("padding")
    override val padding: Padding = Padding(),

    @SerializedName("margin")
    override val margin: Margin = Margin(),

    @SerializedName("backgroundColor")
    override val backgroundColor: Color = Color(0xFFFFFFFF),

    @SerializedName("viewType")
    override val viewType: ViewType = ViewType.SCAFOLD,

    @SerializedName("top")
    val top: MockToolBarDAO = MockToolBarDAO(),

    @SerializedName("body")
    val body: MockColumnDAO = MockColumnDAO(),
): MockBaseDAO() {
}