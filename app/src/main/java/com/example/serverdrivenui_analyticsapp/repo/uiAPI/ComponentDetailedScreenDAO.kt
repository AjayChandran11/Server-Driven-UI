package com.example.serverdrivenui_analyticsapp.repo.uiAPI

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.serverdrivenui_analyticsapp.composeConverter.data.*

object ComponentDetailedScreenDAO {
    fun getItemViewA(): MockScafoldDAO {
        val btn1 = MockTextDAO(
            width = -1,
            height = -2,
            textSize = 12.sp,
            title = "Button 1",
            textColor = Color.Black,
            padding = Padding(10.dp, 10.dp, 10.dp, 10.dp)
        )

        val btn2 = MockTextDAO(
            width = -1,
            height = -2,
            textSize = 12.sp,
            title = "Button 2",
            textColor = Color.Black,
            padding = Padding(10.dp, 10.dp, 10.dp, 10.dp)
        )

        val row = MockColumnDAO(
            width = -1,
            height = -2,
            backgroundColor = Color.White,
            children = listOf(btn1, btn2)
        )

        val chart = MockImageDAO(
            width = 300,
            height = 300,
            padding = Padding(10.dp, 10.dp, 10.dp, 10.dp)
        )

        val parentColumn = MockColumnDAO(
            width = -1,
            height = -1,
            backgroundColor = Color.White,
            children = listOf(chart , row)
        )
        val toolBarDAO = MockToolBarDAO(
            width = -1,
            height = -2,
            backIcon = true,
            textSize = 12.sp,
            title = "App Name",
            textColor = Color.Green
        )

        return MockScafoldDAO(
            width = -1,
            top = toolBarDAO,
            body = parentColumn
        )
    }

    fun getItemViewB(): MockScafoldDAO {
        val btn1 = MockTextDAO(
            width = -1,
            height = -2,
            textSize = 12.sp,
            title = "Button 1",
            textColor = Color.Black,
            padding = Padding(10.dp, 10.dp, 10.dp, 10.dp)
        )

        val btn2 = MockTextDAO(
            width = -1,
            height = -2,
            textSize = 12.sp,
            title = "Button 2",
            textColor = Color.Black,
            padding = Padding(10.dp, 10.dp, 10.dp, 10.dp)
        )

        val row = MockColumnDAO(
            width = -1,
            height = -2,
            backgroundColor = Color.White,
            children = listOf(btn2, btn1)
        )

        val chart = MockTextDAO(
            width = 300,
            height = 300,
            textSize = 12.sp,
            title = "",
            textColor = Color.Black,
            padding = Padding(10.dp, 10.dp, 10.dp, 10.dp)
        )

        val parentColumn = MockColumnDAO(
            width = -1,
            height = -1,
            backgroundColor = Color.White,
            children = listOf(row, chart)
        )
        val toolBarDAO = MockToolBarDAO(
            width = -1,
            height = -2,
            backIcon = true,
            textSize = 12.sp,
            title = "App Name",
            textColor = Color.Green
        )

        return MockScafoldDAO(
            width = -1,
            top = toolBarDAO,
            body = parentColumn
        )
    }
}