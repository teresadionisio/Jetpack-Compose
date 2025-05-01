package com.aristidevs.myfirstcomposeapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/********************************************************************/
@Composable
fun MiPrimerLayout(modifier: Modifier = Modifier) {
 Column(modifier.fillMaxSize()){
     Box(modifier=Modifier.weight(1f).fillMaxWidth().background(Color.Magenta))
     Box(modifier=Modifier.weight(1f).fillMaxWidth().background(Color.DarkGray))
     Box(modifier=Modifier.weight(1f).fillMaxWidth().background(Color.Cyan))
 }
}
/********************************************************************/
@Composable
fun MiSegundoLayout(modifier: Modifier = Modifier) {
    Column(modifier.fillMaxSize()){
        Box(modifier=Modifier.weight(1f).fillMaxWidth().background(Color.Magenta))
        Box(modifier=Modifier.weight(1f).fillMaxWidth().background(Color.DarkGray)){
          Row{
              Box(modifier=Modifier.weight(1f).height(30.dp).background(Color.Black))
              Box(modifier=Modifier.weight(1f).height(100.dp).background(Color.Green)
                  ,contentAlignment = Alignment.Center)
              {
                  Text("Number One")
              }
          }
        }
        Box(modifier=Modifier.weight(1f).fillMaxWidth().background(Color.Cyan))
    }
}
/********************************************************************/
@Composable
fun Exercise1(modifier: Modifier = Modifier) {
    Column(Modifier.fillMaxSize()) {
        Box(Modifier.weight(1f).fillMaxWidth().background(Color.Cyan)
            ,contentAlignment = Alignment.Center)
        {
            Text("Ejemplo 1")
        }

        Box(Modifier.weight(1f).fillMaxWidth()) {
            Row(Modifier.fillMaxSize()) {
                Box(Modifier.weight(1f).fillMaxHeight().background(Color.Red)
                    ,contentAlignment = Alignment.Center)
                {
                    Text("Ejemplo 2")
                }
                Box(Modifier.weight(1f).fillMaxHeight().background(Color.Green)
                    ,contentAlignment = Alignment.Center)
                {
                    Text("Ejemplo 3")
                }
            }
        }
        Box(Modifier.weight(1f).fillMaxWidth().background(Color.Magenta)
            ,contentAlignment = Alignment.Center){
            Text("Ejemplo 4")
        }
    }
}
/********************************************************************/
@Composable
fun Exercise2(modifier: Modifier = Modifier) {
    Column(Modifier.fillMaxSize()) {
        Box(Modifier.weight(1f).fillMaxWidth().background(Color.Cyan)
            ,contentAlignment = Alignment.Center)
        {
            Text("Ejemplo 1")
        }
        Spacer(Modifier.height(20.dp))
        Box(Modifier.weight(1f).fillMaxWidth()) {
            Row(Modifier.fillMaxSize()) {
                Box(Modifier.weight(1f).fillMaxHeight().background(Color.Red)
                    ,contentAlignment = Alignment.Center)
                {
                    Text("Ejemplo 2")
                }
                Spacer(Modifier.width(20.dp))
                Box(Modifier.weight(1f).fillMaxHeight().background(Color.Green)
                    ,contentAlignment = Alignment.Center)
                {
                    Text("Ejemplo 3")
                }
            }
        }
        Spacer(Modifier.height(20.dp))
        Box(Modifier.weight(1f).fillMaxWidth().background(Color.Magenta)
            ,contentAlignment = Alignment.Center){
            Text("Ejemplo 4")
        }
    }
}
/********************************************************************/
