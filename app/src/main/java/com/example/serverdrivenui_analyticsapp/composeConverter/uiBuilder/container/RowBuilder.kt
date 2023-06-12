package com.example.serverdrivenui_analyticsapp.composeConverter.uiBuilder.container

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.serverdrivenui_analyticsapp.R
import com.example.serverdrivenui_analyticsapp.composeConverter.data.MockRowDAO
import com.example.serverdrivenui_analyticsapp.composeConverter.uiBuilder.ComposeUIFactory
import com.example.serverdrivenui_analyticsapp.ui.theme.ServerDriveUiAnalyticsAppTheme

object RowBuilder {
    @Composable
    fun ZCRMComposeRow(rowDAO: MockRowDAO)
    {
        GetComposeRow(rowDAO)
    }

    @Composable
    private fun GetComposeRow(rowDAO: MockRowDAO) {
        Row(modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically){
            rowDAO.children.forEach{
                ComposeUIFactory.GetComposeUI(contentUI = it)
            }
        }
    }
}

@Preview
@Composable
fun ComposeRowPreview() {
    ServerDriveUiAnalyticsAppTheme() {
        RowBuilder.ZCRMComposeRow(rowDAO = MockRowDAO())
    }
}