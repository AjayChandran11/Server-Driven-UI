package com.example.serverdrivenui_analyticsapp.composeConverter.data

import com.google.gson.annotations.SerializedName

enum class ViewType {

    @SerializedName("row")
    ROW,

    @SerializedName("column")
    COLUMN,

    @SerializedName("text")
    TEXT,

    @SerializedName("image")
    IMAGE,

    @SerializedName("card")
    CARD,

    @SerializedName("lazyrow")
    LAZYROW,

    @SerializedName("lazycolumn")
    LAZYCOLUMN,

    @SerializedName("toolbar")
    TOOLBAR,

    @SerializedName("scafold")
    SCAFOLD
}

enum class CropType {
    @SerializedName("default")
    DEFAULT,

    @SerializedName("circle")
    CIRCLE
}