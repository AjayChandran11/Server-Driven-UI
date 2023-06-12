package com.example.serverdrivenui_analyticsapp.composeConverter.uiBuilder.recycler

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.serverdrivenui_analyticsapp.composeConverter.data.MockLazyColumnDAO
import com.example.serverdrivenui_analyticsapp.composeConverter.uiBuilder.ComposeUIFactory

object LazyColumnBuilder {
    @Composable
    fun ZCRMComposeLazyColumn(lazyColumnDAO: MockLazyColumnDAO)
    {
        GetComposeLazyColumn(lazyColumnDAO)
    }

    @Composable
    private fun GetComposeLazyColumn(lazyColumnDAO: MockLazyColumnDAO) {
        val strings = mutableListOf<String>()
        repeat((10 until 200).random())
        {
            strings.add("Dashboard Number $it")
        }
        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 10.dp)) {
            items(lazyColumnDAO.itemView) {
//                Text(
//                    text = it,
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(horizontal = 10.dp, vertical = 5.dp)
//                )
                ComposeUIFactory.GetComposeUI(contentUI = it)
            }
        }
    }
}