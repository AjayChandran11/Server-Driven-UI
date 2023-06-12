package com.example.serverdrivenui_analyticsapp.composeConverter.data

import com.google.gson.annotations.SerializedName

data class Content (

    @SerializedName("comments")
    val comments: String = String(),

    @SerializedName("featureId")
    val featureID: Int = 0,

    @SerializedName("width")
    val width: Int = 0,

    @SerializedName("height")
    val height: Int = 0,

    @SerializedName("padding")
    val padding: Padding = Padding(),

    @SerializedName("margin")
    val margin: Margin = Margin(),

    @SerializedName("backgroundColor")
    val backgroundColor: String = String(),

    @SerializedName("viewType")
    val viewType: ViewType = ViewType.ROW,

    @SerializedName("children")
    val children: ArrayList<Content> = arrayListOf(),

    @SerializedName("title")
    val title: String = String(),

    @SerializedName("itemView")
    val itemView: ArrayList<ContentUI> = arrayListOf(),

    @SerializedName("textSize")
    val textSize: Int = 0,

    @SerializedName("typeface")
    val typeFace: String = String(),

    @SerializedName("cropType")
    val cropType: String = String()

)
