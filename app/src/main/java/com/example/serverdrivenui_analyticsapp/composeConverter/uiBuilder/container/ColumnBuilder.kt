package com.example.serverdrivenui_analyticsapp.composeConverter.uiBuilder.container

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.serverdrivenui_analyticsapp.composeConverter.data.MockColumnDAO
import com.example.serverdrivenui_analyticsapp.composeConverter.uiBuilder.ComposeUIFactory

object ColumnBuilder {
    @Composable
    fun ZCRMComposeColumn(columnDAO: MockColumnDAO)
    {
        GetComposeColumn(columnDAO)
    }

    @Composable
    private fun GetComposeColumn(columnDAO: MockColumnDAO) {
        Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
            columnDAO.children.forEach{
                ComposeUIFactory.GetComposeUI(contentUI = it)
            }
        }
    }
}