package com.aristidevs.myfirstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.aristidevs.myfirstcomposeapp.components.layout.InitialScreen
import com.aristidevs.myfirstcomposeapp.components.layout.MyBox
import com.aristidevs.myfirstcomposeapp.components.layout.MyColumn
import com.aristidevs.myfirstcomposeapp.components.layout.MyComplexLayout
import com.aristidevs.myfirstcomposeapp.components.layout.MyRow
import com.aristidevs.myfirstcomposeapp.components.layout.TextButtonExample
import com.aristidevs.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme
import kotlinx.coroutines.delay


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstComposeAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyComplexLayout(Modifier.padding(innerPadding))
               }
            }
        }
    }
}


