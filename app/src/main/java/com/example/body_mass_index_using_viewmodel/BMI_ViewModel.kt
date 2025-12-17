package com.example.body_mass_index_using_viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class BMI_ViewModel: ViewModel() {
    var heightInput by mutableStateOf("")
    var weightInput by mutableStateOf("")
    private val height: Float
        get() = heightInput.toFloatOrNull() ?: 0f
    private val weight: Float
        get() = weightInput.toFloatOrNull() ?: 0f

    val bmi: Float
        get () {
            return if (weight > 0 && height > 0) weight / (height * height)
            else 0f
        }
}
