package com.example.serverdrivenui_analyticsapp.composeConverter.data

import androidx.compose.ui.graphics.Color
import com.google.gson.annotations.SerializedName

data class MockLazyColumnDAO (
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
    override val backgroundColor: Color = Color(0x9CCC65),

    @SerializedName("viewType")
    override val viewType: ViewType = ViewType.LAZYCOLUMN,

    @SerializedName("title")
    val itemView: ArrayList<MockBaseDAO> = arrayListOf(),
): MockBaseDAO()