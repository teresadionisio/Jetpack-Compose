package com.aristidevs.myfirstcomposeapp.components.layout

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Magenta
import androidx.compose.ui.unit.dp
/**********************************************************************/
@Composable
fun MyButtonExample(modifier: Modifier = Modifier){
    Column(modifier.fillMaxSize().padding(24.dp)){
        Button(onClick = { },
            colors = ButtonDefaults.textButtonColors(Color.DarkGray),
            elevation = ButtonDefaults.elevatedButtonElevation(10.dp),
            border = BorderStroke(1.dp, Color.Black) ){
          Text(text = "Púlsame", color = Color.White)
        }
    }
}
/**********************************************************************/
@Composable
fun MyButtonExample2(modifier: Modifier = Modifier) {
    var enabled by rememberSaveable { mutableStateOf(true) }


    Column(Modifier.fillMaxSize().padding(24.dp)){
        Button(onClick = { enabled = false},
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(Magenta),
        border = BorderStroke (5.dp, Color.Green)){
            Text("Pulsame")
        }
    }
}
/**********************************************************************/
@Composable
fun MyoutlinedButton(modifier: Modifier = Modifier){
    var enabled by rememberSaveable { mutableStateOf(true)}

    OutlinedButton(onClick = { enabled = false}
        ,enabled=enabled
        ,modifier = Modifier.padding(36.dp)
        ,colors = ButtonDefaults.buttonColors(Magenta)){
        Text("Hola", color = Color.Black)
    }
}
/*********************************************************************/
@Composable
fun MyTextButtom(modifier: Modifier = Modifier){
    TextButton(onClick = { } ,modifier = Modifier.padding(36.dp)) {
        Text("Hola", color = Color.Blue)
    }
}
/********************************************************************/