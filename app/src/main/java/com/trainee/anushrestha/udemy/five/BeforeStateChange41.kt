package com.trainee.anushrestha.udemy.five

//val namesList = arrayListOf<String>("Anu","manju","kaju","yams","semey","ayisha")
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
//
//                    NamesList(list = namesList)
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun NamesList(list:List<String>){
//    Column {
//        for(names in list){
//            Greeting(name = names)
//        }
//        Button(onClick = {
//            namesList.add("aniusha")
//        }) {
//            Text(text = "Add gara") //Button click gardaa add hudaina thyo
//        }
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