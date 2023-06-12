package com.example.serverdrivenui_analyticsapp.ui.dashboards

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.serverdrivenui_analyticsapp.composeConverter.uiBuilder.ComposeUIFactory
import com.example.serverdrivenui_analyticsapp.R
import com.example.serverdrivenui_analyticsapp.composeConverter.data.MockBaseDAO
import com.example.serverdrivenui_analyticsapp.composeConverter.data.MockScafoldDAO
import com.example.serverdrivenui_analyticsapp.repo.uiAPI.UIDataFetcher
import com.example.serverdrivenui_analyticsapp.ui.theme.ServerDriveUiAnalyticsAppTheme

@Composable
fun DashboardScreen(list: List<String>, structure: MockBaseDAO?) {
    if (structure != null) {

        val scaffoldState = rememberScaffoldState()
        Scaffold(
            scaffoldState = scaffoldState,
            topBar = {
                ComposeUIFactory.GetComposeUI((structure as MockScafoldDAO).top)
            },
            content = {
                ComposeUIFactory.GetComposeUI((structure as MockScafoldDAO).body)
            },
            backgroundColor = structure.backgroundColor,
        )
    }
}

@Composable
fun DashboardTopBar() {
    TopAppBar(
        title = {
            Row(modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {
                Text(modifier = Modifier.weight(0.8f),
                    text = "Dashboards",
                    textAlign = TextAlign.Center)
                Row(modifier = Modifier.weight(0.2f),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.icon_zia),
                        contentDescription = "Profile pic",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(30.dp)
                    )
                }
            }
        },
        backgroundColor = Color.Gray,
        navigationIcon = {
            Row(modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "Profile pic",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                )
            }
        }
    )
}

@Composable
fun DashboardBody(list: List<String>) {
    val searchText = remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()) {
        TextField(value = searchText.value,
            onValueChange = { searchText.value = it },
            leadingIcon = {
                Image(painter = painterResource(id = R.drawable.icon_search),
                    contentDescription = "Search Icon")
            },
            placeholder = {
                Text(text = "Search")              
            },
            maxLines = 1, singleLine = true,
            shape = RoundedCornerShape(3.dp),
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.Gray
            ),
//            keyBoardOptions = KeyboardOptions(
//                keyboardType = KeyboardType.Text,
//                imeAction = ImeAction.Search
//            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(10.dp)
        )

        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 10.dp)) {
            items(list) {
                Text(text = it,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp, vertical = 5.dp))
            }
        }
    }
}

@Preview
@Composable
fun DashboardScreenPreview() {
    ServerDriveUiAnalyticsAppTheme {
        val strings = mutableListOf<String>()
        repeat((10 until 200).random())
        {
            strings.add("Dashboard Number $it")
        }
        DashboardScreen(strings, UIDataFetcher.getDashboardsViewStructure())
    }
}