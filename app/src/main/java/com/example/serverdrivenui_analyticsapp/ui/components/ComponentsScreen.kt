package com.example.serverdrivenui_analyticsapp.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
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
import com.example.serverdrivenui_analyticsapp.composeConverter.data.MockBaseDAO
import com.example.serverdrivenui_analyticsapp.composeConverter.data.MockScafoldDAO
import com.example.serverdrivenui_analyticsapp.composeConverter.uiBuilder.ComposeUIFactory
import com.example.serverdrivenui_analyticsapp.repo.uiAPI.UIDataFetcher
import com.example.serverdrivenui_analyticsapp.ui.theme.ServerDriveUiAnalyticsAppTheme

@Composable
fun ComponentsScreen(components: List<ComponentDataSet>, structure: MockBaseDAO?) {
    if(structure != null) {
        val scaffoldState = rememberScaffoldState()
        Scaffold(
            scaffoldState = scaffoldState,
            topBar = {
                ComposeUIFactory.GetComposeUI((structure as MockScafoldDAO).top)
            },
            content = {
                ComposeUIFactory.GetComposeUI((structure as MockScafoldDAO).body)
            },
            backgroundColor = Color.White,
        )
    }
}

@Composable
fun ComponentsTopBar() {
    TopAppBar(
        title = {
            Row(modifier = Modifier.fillMaxWidth(fraction = 0.8f),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically) {
                Text(text = "Dashboards",
                    textAlign = TextAlign.Center)
            }
        },
        backgroundColor = Color.Gray,
        navigationIcon = {
            Row(modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = { /*TODO*/ }) {
                    Image(
                        painter = painterResource(id = R.drawable.icon_back),
                        contentDescription = "Profile pic",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(25.dp)
                            .clip(CircleShape)
                    )
                }
            }
        }
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ComponentsBody() {
    LazyVerticalGrid(cells = GridCells.Fixed(1),
        modifier = Modifier.fillMaxSize().padding(15.dp)){
    }
}

@Preview
@Composable
fun ComponentsScreenPreview() {
    ServerDriveUiAnalyticsAppTheme {
        val strings = mutableListOf<ComponentDataSet>()
        repeat((1 until 15).random())
        {
            strings.add(
                ComponentDataSet(
                    "Component Number $it",
                    android.graphics.Color.argb(255 , (0 until 255).random() , (0 until 255).random(), (0 until 255).random())
                )
            )
        }
        ComponentsScreen(strings, UIDataFetcher.getComponentsViewStructure())
    }
}
