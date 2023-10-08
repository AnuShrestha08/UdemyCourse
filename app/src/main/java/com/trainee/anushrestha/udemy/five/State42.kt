package com.trainee.anushrestha.udemy.five

//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.wrapContentSize
//import androidx.compose.material3.Button
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.mutableStateListOf
//import androidx.compose.runtime.remember
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import com.trainee.anushrestha.udemy.ui.theme.UdemyTheme
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            UdemyTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    MainScreen()
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun MainScreen(){
//    Column {
//        logic()
//    }
//}
//
//@Composable
//fun logic(){
//    val namesList = remember{ mutableStateListOf<String>("Aanu","Manzu") }
//    for(names in namesList){
//        Greeting(name = names)
//    }
//    Button(onClick = {
//        namesList.add("aniusha") //now this is added
//    }) {
//        Text(text = "Add gara")
//    }
//
//}
//
//
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier.wrapContentSize(Alignment.TopStart)
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    UdemyTheme {
//        Greeting("Android")
//    }
//}