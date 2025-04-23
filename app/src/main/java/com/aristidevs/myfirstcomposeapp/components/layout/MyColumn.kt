package com.aristidevs.myfirstcomposeapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview (showBackground = true)
@Composable
fun MyColumn(modifier: Modifier = Modifier){
 Column(modifier = modifier.fillMaxSize().verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
         horizontalAlignment = Alignment.CenterHorizontally){

    var contador = 0

    while (contador <100) {
        Text(text = (contador+1).toString(), fontSize = 24.sp, modifier = Modifier.background(Color.Green))
        Text(text = (contador+2).toString(), fontSize = 24.sp, modifier = Modifier.background(Color.Cyan))
        Text(text = (contador+3).toString(), fontSize = 24.sp, modifier = Modifier.background(Color.Red))
        Text(text = (contador+4).toString(), fontSize = 24.sp, modifier = Modifier.background(Color.Yellow))

       contador+=4
    //Text("Hola 1", fontSize = 24.sp, modifier = Modifier.background(Color.Red))
     }
    }
}
