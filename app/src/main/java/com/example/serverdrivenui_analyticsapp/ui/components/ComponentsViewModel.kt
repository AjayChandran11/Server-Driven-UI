package com.example.serverdrivenui_analyticsapp.ui.components

import android.graphics.Color
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.serverdrivenui_analyticsapp.composeConverter.data.MockBaseDAO
import com.example.serverdrivenui_analyticsapp.repo.uiAPI.UIDataFetcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

data class ComponentDataSet(val name: String, val color: Int)
class ComponentsViewModel: ViewModel() {
    private var _components = mutableStateListOf<ComponentDataSet>()
    val components: List<ComponentDataSet>
    get() = _components
    private var _structure = mutableStateOf<MockBaseDAO?>(null)
    val structure: MockBaseDAO?
    get() = _structure.value

    fun getComponents()
    {
        CoroutineScope(Dispatchers.IO).launch {
            delay(1000)
            val strings = mutableListOf<ComponentDataSet>()
            repeat((1 until 15).random())
            {
                strings.add(
                    ComponentDataSet(
                        "Component Number $it",
                        Color.argb(255 , (0 until 255).random() , (0 until 255).random(), (0 until 255).random())
                    )
                )
            }
            _components.addAll(strings)
        }
    }

    fun getViewStructure()
    {
        _structure.value = UIDataFetcher.getComponentsViewStructure()
    }
}