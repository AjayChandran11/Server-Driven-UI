package com.example.serverdrivenui_analyticsapp.composeConverter.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.google.gson.annotations.SerializedName

data class MockRowDAO(
    @SerializedName("comments")
    override val comments: String = String(),

    @SerializedName("featureId")
    override val featureID: Int = 0,

    @SerializedName("width")
    override val width: Int = 0,

    @SerializedName("height")
    override val height: Int = 0,

    @SerializedName("width")
    override val widthPercentage: Float = 0F,

    @SerializedName("height")
    override val heightPercentage: Float = 0F,

    @SerializedName("padding")
    override val padding: Padding = Padding(),

    @SerializedName("margin")
    override val margin: Margin = Margin(),

    @SerializedName("backgroundColor")
    override val backgroundColor: Color = Color.Cyan,

    @SerializedName("viewType")
    override val viewType: ViewType = ViewType.ROW,

    @SerializedName("children")
    val children: List<MockBaseDAO> = arrayListOf(),

    @SerializedName("roundedEdge")
    val roundEdge: Dp = 0.dp,

    @SerializedName("elevation")
    val elevation: Dp = 0.dp,

    ) : MockBaseDAO()