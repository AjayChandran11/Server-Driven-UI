package com.example.serverdrivenui_analyticsapp.repo.uiAPI

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.serverdrivenui_analyticsapp.composeConverter.data.*

// inputStream from JSONResponse file and create DAO objects
object UIDataFetcher {
    fun getDashboardsViewStructure(): MockBaseDAO
    {
        return DashboardsScreenDAO.getItemViewA()
//        return DashboardsScreenDAO.getItemViewB()
    }

    fun getComponentsViewStructure(): MockBaseDAO
    {
        return ComponentsScreenDAO.getItemViewA()
//        return ComponentsScreenDAO.getItemViewB()
    }

    fun getComponentDetailedViewStructure(): MockBaseDAO
    {
        return ComponentDetailedScreenDAO.getItemViewA()
//        return ComponentDetailedScreenDAO.getItemViewB()
    }
}
