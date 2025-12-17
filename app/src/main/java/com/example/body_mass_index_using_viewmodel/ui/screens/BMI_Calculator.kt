package com.example.body_mass_index_using_viewmodel.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.body_mass_index_using_viewmodel.BMI_ViewModel
import com.example.body_mass_index_using_viewmodel.R


@Composable
fun BMI_Calculator(modifier: Modifier = Modifier, BMI_ViewModel: BMI_ViewModel = viewModel()) {
    Column (
        modifier = modifier.padding(all = 8.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = stringResource(R.string.bmi_calculator),
            style=MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.primary,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = BMI_ViewModel.heightInput,
            onValueChange = {BMI_ViewModel.heightInput = it},
            label={Text(stringResource(R.string.height))},
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType =
                KeyboardType.Decimal),
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = BMI_ViewModel.weightInput,
            onValueChange = {BMI_ViewModel.weightInput = it},
            label={Text(stringResource(R.string.weight))},
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType =
                KeyboardType.Number),
            modifier = Modifier.fillMaxWidth()
        )
        Text(text =
            stringResource(R.string.bmi_is,BMI_ViewModel.bmi))
    }
}
