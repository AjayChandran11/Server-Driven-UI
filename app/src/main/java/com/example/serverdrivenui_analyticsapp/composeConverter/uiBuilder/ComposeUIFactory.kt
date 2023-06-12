package com.example.serverdrivenui_analyticsapp.composeConverter.uiBuilder

import androidx.compose.runtime.Composable
import com.example.serverdrivenui_analyticsapp.composeConverter.data.*
import com.example.serverdrivenui_analyticsapp.composeConverter.uiBuilder.container.ColumnBuilder
import com.example.serverdrivenui_analyticsapp.composeConverter.uiBuilder.container.RowBuilder
import com.example.serverdrivenui_analyticsapp.composeConverter.uiBuilder.recycler.LazyColumnBuilder
import com.example.serverdrivenui_analyticsapp.composeConverter.uiBuilder.recycler.LazyRowBuilder
import com.example.serverdrivenui_analyticsapp.composeConverter.uiBuilder.view.CardViewBuilder
import com.example.serverdrivenui_analyticsapp.composeConverter.uiBuilder.view.ImageViewBuilder
import com.example.serverdrivenui_analyticsapp.composeConverter.uiBuilder.view.TextViewBuilder
import com.example.serverdrivenui_analyticsapp.composeConverter.uiBuilder.view.ToolBarBuilder

object ComposeUIFactory {
    @Composable
    fun GetComposeUI(contentUI: MockBaseDAO) {
       return when (contentUI.viewType) {
            ViewType.ROW -> RowBuilder.ZCRMComposeRow(contentUI as MockRowDAO)
            ViewType.COLUMN -> ColumnBuilder.ZCRMComposeColumn(contentUI as MockColumnDAO)
            ViewType.TEXT -> TextViewBuilder.ZCRMComposeText(contentUI as MockTextDAO)
            ViewType.IMAGE -> ImageViewBuilder.ZCRMComposeImage(contentUI as MockImageDAO)
            ViewType.CARD -> CardViewBuilder.ZCRMComposeCard()
            ViewType.LAZYROW -> LazyRowBuilder.ZCRMComposeLazyRow()
            ViewType.LAZYCOLUMN -> LazyColumnBuilder.ZCRMComposeLazyColumn(contentUI as MockLazyColumnDAO)
            ViewType.TOOLBAR -> ToolBarBuilder.ZCRMComposeToolBar(contentUI as MockToolBarDAO)
           else -> {}
       }
    }
}

