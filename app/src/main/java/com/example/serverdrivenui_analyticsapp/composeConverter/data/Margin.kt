package com.example.serverdrivenui_analyticsapp.composeConverter.data

import com.google.gson.annotations.SerializedName

data class Margin (

    @SerializedName("left")
    val left: Int = 0,

    @SerializedName("right")
    val right: Int = 0,

    @SerializedName("top")
    val top: Int = 0,

    @SerializedName("bottom")
    val bottom: Int = 0

)