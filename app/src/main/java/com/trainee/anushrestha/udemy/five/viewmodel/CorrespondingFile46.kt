package com.trainee.anushrestha.udemy.five.viewmodel

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MainScreen(viewmodel:MyViewModel = MyViewModel()){
    val textField = viewmodel.textFieldState.observeAsState("")

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GreetingMessage(
            textField.value,
            { words -> viewmodel.onTextChange(words)}
        )
        //logic(mainNames) { mainNames.add("aniusha")} does the same work as above
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GreetingMessage(
    textFieldValue : String,
    textFieldUpdate : (words : String) -> Unit

){
    TextField(
        value = textFieldValue,
        onValueChange = textFieldUpdate)

    Button(onClick = {  }) {
        Text(textFieldValue)
    }
}