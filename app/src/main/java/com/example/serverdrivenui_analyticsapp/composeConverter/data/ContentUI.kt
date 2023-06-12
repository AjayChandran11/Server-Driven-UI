package com.example.serverdrivenui_analyticsapp.composeConverter.data

import com.example.serverdrivenui_analyticsapp.composeConverter.data.Content
import com.google.gson.annotations.SerializedName


data class ContentUI(

    @SerializedName("comments")
    val comments: String = String(),

    @SerializedName("typeId")
    val typeId: Int = 0,

    @SerializedName("content")
    val content: Content = Content()

)









