package com.example.serverdrivenui_analyticsapp.ui.detailed

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
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
fun ComponentDetailScreen(structure: MockBaseDAO?) {
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
fun ComponentDetailTopBar() {
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

@Composable
fun ComponentDetailBody() {
    Column(modifier = Modifier.fillMaxSize(),
    ) {
        Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Chart",
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .padding(15.dp))

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
            .weight(3f)) {
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Gray,
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .weight(1f)
                    .padding(20.dp)
            ) {
                Text(text = "A")
            }
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Gray,
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .weight(1f)
                    .padding(20.dp)
            ) {
                Text(text = "B")
            }
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Gray,
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .weight(1f)
                    .padding(20.dp)
            ) {
                Text(text = "C")
            }
        }
    }
}

@Preview
@Composable
fun ComponentDetailScreenPreview() {
    ServerDriveUiAnalyticsAppTheme {
        ComponentDetailScreen(UIDataFetcher.getComponentDetailedViewStructure())
    }
}