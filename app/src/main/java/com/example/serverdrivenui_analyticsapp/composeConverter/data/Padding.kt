package com.example.serverdrivenui_analyticsapp.composeConverter.data

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.google.gson.annotations.SerializedName

data class Padding(

    @SerializedName("left")
    val left: Dp = 0.dp,

    @SerializedName("right")
    val right:  Dp = 0.dp,

    @SerializedName("top")
    val top:  Dp = 0.dp,

    @SerializedName("bottom")
    val bottom:  Dp = 0.dp

)