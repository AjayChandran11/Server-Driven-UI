package com.example.serverdrivenui_analyticsapp.composeConverter.uiBuilder.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.serverdrivenui_analyticsapp.R
import com.example.serverdrivenui_analyticsapp.composeConverter.data.MockToolBarDAO
import com.example.serverdrivenui_analyticsapp.ui.theme.ServerDriveUiAnalyticsAppTheme

object ToolBarBuilder {
    @Composable
    fun ZCRMComposeToolBar(toolBarDAO: MockToolBarDAO)
    {
        GetComposeTopBar(toolBarDAO)
    }

    @Composable
    private fun GetComposeTopBar(toolBarDAO: MockToolBarDAO) {
        TopAppBar(
            title = {
                Row(modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically) {
                    Text(modifier = Modifier.weight(0.8f),
                        text = toolBarDAO.title,
                        textAlign = TextAlign.Center,
                        fontSize = toolBarDAO.textSize,
                        color = toolBarDAO.textColor,
                        fontFamily = FontFamily.Default
                        )
                    Row(modifier = Modifier.weight(0.2f),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.icon_zia),
                            contentDescription = "Profile pic",
                            modifier = Modifier
                                .size(30.dp)
                                .clip(CircleShape)
                                .background(Color.White)

                        )
                    }
                }
            },
            backgroundColor = toolBarDAO.backgroundColor,
            navigationIcon = {
                Row(modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id =
                        if(toolBarDAO.backIcon)
                            R.drawable.icon_back
                        else
                            R.drawable.ic_launcher_foreground
                        ),
                        contentDescription = "Profile pic",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                    )
                }
            },
            elevation = toolBarDAO.elevation
        )
    }
}

@Preview
@Composable
fun ComposeTopBarPreview() {
    ServerDriveUiAnalyticsAppTheme() {
        ToolBarBuilder.ZCRMComposeToolBar(toolBarDAO = MockToolBarDAO())
    }
}
