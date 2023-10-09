package com.trainee.anushrestha.udemy.five.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel(){
    val textFieldState = MutableLiveData("")

    fun onTextChange(textValue:String){
        textFieldState.value = textValue
    }

}