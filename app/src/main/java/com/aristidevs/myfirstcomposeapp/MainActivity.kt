package com.aristidevs.myfirstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aristidevs.myfirstcomposeapp.components.layout.MyBox
import com.aristidevs.myfirstcomposeapp.components.layout.MyColumn
import com.aristidevs.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstComposeAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   MyColumn()
                }
            }
        }
    }
}
/**************************************************************/
@Composable()
fun Greeting(name: String,
             modifier: Modifier = Modifier) {
    Text (text = "Hello $name! Teresita",modifier = modifier
        .padding(top = 48.dp,  start = 48.dp),
        fontSize = 24.sp, textAlign = TextAlign.Center)

}
/**************************************************************/
@Preview(
    showBackground = true)
@Composable
fun GreetingPreview() {
    MyFirstComposeAppTheme {
        Greeting("Android")
    }
}
/************************************************************/