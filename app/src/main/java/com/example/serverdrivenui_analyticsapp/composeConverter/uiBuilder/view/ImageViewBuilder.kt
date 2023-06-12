package com.example.serverdrivenui_analyticsapp.composeConverter.uiBuilder.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import com.example.serverdrivenui_analyticsapp.R
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.serverdrivenui_analyticsapp.composeConverter.data.MockImageDAO
import com.example.serverdrivenui_analyticsapp.ui.theme.ServerDriveUiAnalyticsAppTheme

object ImageViewBuilder {
    @Composable
    fun ZCRMComposeImage(mockImageDAO: MockImageDAO)
    {
        GetComposeImageView(mockImageDAO)
    }
    
    @Composable
    private fun GetComposeImageView(mockImageDAO: MockImageDAO) {
        Card(modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            elevation = 5.dp) {
            Box(modifier = Modifier.height(200.dp)) {
                Image(modifier = Modifier.fillMaxSize(),
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "Image",
                    contentScale = ContentScale.Crop
                )
                Box(modifier = Modifier.fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            listOf(
                                Color.Transparent,
                                Color.Black
                            )
                        )
                    )
                )
            }
        }
    }
}

@Preview
@Composable
fun ComposeImageViewPreview() {
    ServerDriveUiAnalyticsAppTheme() {
        ImageViewBuilder.ZCRMComposeImage(mockImageDAO = MockImageDAO())
    }
}