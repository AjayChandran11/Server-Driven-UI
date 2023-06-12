package com.example.serverdrivenui_analyticsapp.repo.uiAPI

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.serverdrivenui_analyticsapp.composeConverter.data.*

object ComponentsScreenDAO {
    fun getItemViewA(): MockScafoldDAO {
        val rows = arrayListOf<MockBaseDAO>()
        repeat(10) {
            rows.add(
                MockColumnDAO(
                    width = -1,
                    height = -2,
                    backgroundColor = Color.White,
                    children = listOf(
                        MockImageDAO(
                            width = 200,
                            height = 200,
                            backgroundColor = Color.Green,
                            padding = Padding(10.dp, 10.dp, 10.dp, 10.dp)
                        ),
                        MockTextDAO(
                            width = -1,
                            height = -2,
                            textSize = 16.sp,
                            title = "Component Number $it",
                            textColor = Color.Black,
                            padding = Padding(10.dp, 10.dp, 10.dp, 10.dp)
                        )
                    )
                )
            )
        }
        val dashboardLazyColumn = MockLazyColumnDAO(
            width = -1,
            height = -1,
            itemView = rows
        )
        val toolBarDAO = MockToolBarDAO(
            width = -1,
            height = -2,
            backIcon = true,
            textSize = 12.sp,
            title = "App Name",
            textColor = Color.Green
        )

        val contentRow = MockColumnDAO(
            width = -1,
            height = -1,
            backgroundColor = Color.White,
            children = listOf(dashboardLazyColumn)
        )
        return MockScafoldDAO(
            width = -1,
            top = toolBarDAO,
            body = contentRow
        )
    }

    fun getItemViewB(): MockScafoldDAO {
        val rows = arrayListOf<MockBaseDAO>()
        repeat(10) {
            rows.add(
                MockRowDAO(
                    elevation = 1.dp,
                    roundEdge = 4.dp,
                    width = -1,
                    height = -2,
                    backgroundColor = Color.White,
                    children = listOf(
                        MockTextDAO(
                            width = -1,
                            height = -2,
                            textSize = 12.sp,
                            title = "Dummy title $it",
                            textColor = Color.Black,
                            padding = Padding(10.dp, 10.dp, 10.dp, 10.dp)
                        ),
                        MockTextDAO(
                            width = 200,
                            height = 200,
                            backgroundColor = Color.Green,
                            padding = Padding(10.dp, 10.dp, 10.dp, 10.dp)
                        )
                    )
                )
            )
        }
        val dashboardLazyColumn = MockLazyColumnDAO(
            width = -1,
            height = -1,
            itemView = rows
        )
        val toolBarDAO = MockToolBarDAO(
            width = -1,
            height = -2,
            backIcon = true,
            textSize = 16.sp,
            title = "App Name",
            textColor = Color(0xFFFFFFFF),
            backgroundColor = Color(0xFF2196F3)
        )

        val contentRow = MockColumnDAO(
            width = -1,
            height = -1,
            backgroundColor = Color.White,
            children = listOf(dashboardLazyColumn)
        )
        return MockScafoldDAO(
            width = -1,
            top = toolBarDAO,
            body = contentRow
        )
    }


}