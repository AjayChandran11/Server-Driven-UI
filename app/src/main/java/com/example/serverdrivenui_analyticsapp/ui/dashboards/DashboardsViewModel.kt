package com.example.serverdrivenui_analyticsapp.ui.dashboards

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import androidx.lifecycle.MutableLiveData
import com.example.serverdrivenui_analyticsapp.composeConverter.data.MockBaseDAO
import com.example.serverdrivenui_analyticsapp.repo.uiAPI.UIDataFetcher

class DashboardsViewModel: ViewModel() {
    private var _dashboards = mutableStateListOf<String>()
    val dashboards: List<String>
    get() = _dashboards

    private var _structure = mutableStateOf<MockBaseDAO?>(null)
    val structure: MockBaseDAO?
        get() = _structure.value

    fun getDashboards()
    {
        CoroutineScope(Dispatchers.IO).launch {
            delay(1000)
            val strings = mutableListOf<String>()
            repeat((10 until 200).random())
            {
                strings.add("Dashboard Number $it")
            }
            _dashboards.addAll(strings)
        }
    }

    fun getViewStructure()
    {
        _structure.value = UIDataFetcher.getDashboardsViewStructure()
    }
}