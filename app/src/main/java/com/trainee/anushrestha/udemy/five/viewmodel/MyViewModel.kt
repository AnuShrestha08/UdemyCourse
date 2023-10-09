package com.trainee.anushrestha.udemy.five.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel(){
    val textFieldState = MutableLiveData<String>()

    fun onTextChange(textValue:String){
        textFieldState.value = textValue

        Log.d("", "GreetingMessage:Vm $textValue")
    }
}