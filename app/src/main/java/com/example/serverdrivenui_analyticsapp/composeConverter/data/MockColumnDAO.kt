package com.example.serverdrivenui_analyticsapp.composeConverter.data

import androidx.compose.ui.graphics.Color
import com.google.gson.annotations.SerializedName

data class MockColumnDAO (
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
    override val viewType: ViewType = ViewType.COLUMN,

    @SerializedName("children")
    val children: List<MockBaseDAO> = arrayListOf()

): MockBaseDAO()