package com.example.serverdrivenui_analyticsapp.composeConverter.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.gson.annotations.SerializedName

data class MockTextDAO (
    @SerializedName("comments")
    override val comments: String = String(),

    @SerializedName("featureId")
    override val featureID: Int = 0,

    @SerializedName("width")
    override val width: Int = -1,

    @SerializedName("height")
    override val height: Int = -1,

    @SerializedName("widthPercentage")
    override val widthPercentage: Float = 0f,

    @SerializedName("height")
    override val heightPercentage: Float = 0f,

    @SerializedName("padding")
    override val padding: Padding = Padding(),

    @SerializedName("margin")
    override val margin: Margin = Margin(),

    @SerializedName("backgroundColor")
    override val backgroundColor: Color = Color(0x9CCC65),

    @SerializedName("viewType")
    override val viewType: ViewType = ViewType.TEXT,

    @SerializedName("title")
    val title: String = String(),

    @SerializedName("textSize")
    val textSize: TextUnit = 12.sp,

    @SerializedName("typeface")
    val typeFace: String = String(),

    @SerializedName("textColor")
    val textColor: Color = Color.Black,
): MockBaseDAO()