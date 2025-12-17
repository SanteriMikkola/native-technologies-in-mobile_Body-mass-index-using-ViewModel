package com.example.body_mass_index_using_viewmodel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.body_mass_index_using_viewmodel.ui.screens.BMI_Calculator
import com.example.body_mass_index_using_viewmodel.ui.theme.BodymassindexusingViewModelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BodymassindexusingViewModelTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BMI_Calculator(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}