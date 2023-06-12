package com.example.serverdrivenui_analyticsapp.composeConverter.uiBuilder.view

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.serverdrivenui_analyticsapp.updateDimensions
import com.example.serverdrivenui_analyticsapp.composeConverter.data.MockTextDAO
import com.example.serverdrivenui_analyticsapp.ui.theme.ServerDriveUiAnalyticsAppTheme

object TextViewBuilder {
    @Composable
    fun ZCRMComposeText(mockTextDAO: MockTextDAO = MockTextDAO())
    {
        GetComposeText(mockTextDAO)
    }

    @Composable
    private fun GetComposeText(mockTextDAO: MockTextDAO) {
        Text(text = mockTextDAO.title,
//            modifier = Modifier.fillMaxWidth()
//                .padding(horizontal = 10.dp, vertical = 5.dp),
            modifier = Modifier.updateDimensions(
                mockTextDAO.width,
                mockTextDAO.height,
                mockTextDAO.widthPercentage,
                mockTextDAO.heightPercentage
            ).padding(
                start = mockTextDAO.padding.left,
                end = mockTextDAO.padding.right,
                top = mockTextDAO.padding.top,
                bottom = mockTextDAO.padding.bottom),
            textAlign = TextAlign.Center,
            fontSize = mockTextDAO.textSize,
            color = mockTextDAO.textColor,
            fontFamily = FontFamily.Default
        )
    }
}

@Preview
@Composable
fun ComposeTextPreview() {
    ServerDriveUiAnalyticsAppTheme() {
        TextViewBuilder.ZCRMComposeText(mockTextDAO = MockTextDAO())
    }
}