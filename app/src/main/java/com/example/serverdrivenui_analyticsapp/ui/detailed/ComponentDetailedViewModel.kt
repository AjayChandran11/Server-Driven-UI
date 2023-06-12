package com.example.serverdrivenui_analyticsapp.ui.detailed

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.serverdrivenui_analyticsapp.composeConverter.data.MockBaseDAO
import com.example.serverdrivenui_analyticsapp.repo.uiAPI.UIDataFetcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ComponentDetailedViewModel: ViewModel() {
    private var _structure = mutableStateOf<MockBaseDAO?>(null)
    val structure: MockBaseDAO?
    get() = _structure.value

    fun getViewStructure()
    {
        _structure.value = UIDataFetcher.getComponentDetailedViewStructure()
    }
}