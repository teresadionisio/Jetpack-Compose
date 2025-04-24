package com.aristidevs.myfirstcomposeapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun MyComplexLayout(modifier: Modifier){
 Column(Modifier){
        Spacer(Modifier.height(20.dp))
        Box(Modifier.weight(1f).fillMaxWidth().background(Color.Cyan))
        {
            Text(text = "Ejemplo 1", Modifier.align(Alignment.Center))
        }
        Spacer(Modifier.height(20.dp))
        Row(Modifier.weight(1f).fillMaxWidth()){

           Box(Modifier.weight(1f).fillMaxHeight().background(Color.Red))
           {
              Text(text = "Ejemplo 2", Modifier.align(Alignment.Center))
           }
           Spacer(Modifier.width(20.dp))
           Box(Modifier.weight(1f).fillMaxHeight().background(Color.Green))
           {
               Text(text = "Ejemplo 3", Modifier.align(Alignment.Center))
           }
          }
        Spacer(Modifier.height(20.dp))
        Box(Modifier.weight(1f).fillMaxWidth().background(Color(0xFFFF6696))){}
    }
}