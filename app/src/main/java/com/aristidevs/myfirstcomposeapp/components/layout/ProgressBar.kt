package com.aristidevs.myfirstcomposeapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.unit.dp

/*******************************************************************/
@Composable
fun MyProgress(modifier: Modifier = Modifier){
    Column (modifier = Modifier.padding(24.dp).fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){
        CircularProgressIndicator(color= Color.Red,
                                  strokeWidth = 5.dp,
                                  trackColor = Color.Cyan,
                                  strokeCap = ProgressIndicatorDefaults.CircularIndeterminateStrokeCap)
        LinearProgressIndicator(modifier.padding(top = 32.dp).
                                background(Color.Blue),
                               // color = Color.Black, //HAcen lo mismo estas lineas
                                trackColor = Color.Red)
    }
}
/********************************************************************/
@Composable
fun MyProgressAvanzado(modifier: Modifier = Modifier){
    var showLoading by rememberSaveable { mutableStateOf(false) }


    Column (modifier = Modifier.padding(24.dp).fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){

        Button (onClick = {showLoading = !showLoading }){
            Text("Cargar")
        }

        if(showLoading){
        CircularProgressIndicator(color= Color.Red,
            strokeWidth = 5.dp,
            trackColor = Color.Cyan,
            strokeCap = ProgressIndicatorDefaults.CircularIndeterminateStrokeCap)
        LinearProgressIndicator(modifier.padding(top = 32.dp).
                                background(Color.Blue),
                                trackColor = Color.Red)
       }
    }
}
/********************************************************************/
@Composable
fun MyProgressAvanzado2(modifier: Modifier=Modifier){
    var progressStatus by rememberSaveable { mutableStateOf (0.0f) }

    Column(Modifier.fillMaxSize(),
           verticalArrangement = Arrangement.Center,
           horizontalAlignment = Alignment.CenterHorizontally){
        CircularProgressIndicator(
            progress = { progressStatus}
        )

        Row(modifier.fillMaxWidth(),Arrangement.Center){

            Button(onClick = { progressStatus +=0.1f }){
                Text("Incrementar")
                if(progressStatus > 1.0f)
                    progressStatus = 1.0f
            }

            Button(modifier = Modifier.padding(start = 12.dp), onClick = {progressStatus -=0.1f  }){
                Text("Reducir")
                if(progressStatus < 0.0f)
                    progressStatus = 0.0f
            }
        }
    }
}
/**********************************************************************/
@Composable
fun MyProgressAvanzado3(modifier: Modifier=Modifier){
    var progressStatus by rememberSaveable { mutableStateOf (0.0f) }

    Column(Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        LinearProgressIndicator(
            progress = { progressStatus}
        )

        Row(modifier.fillMaxWidth(),Arrangement.Center){

            Button(onClick = { progressStatus +=0.1f }){
                Text("Incrementar")
                if(progressStatus > 1.0f)
                    progressStatus = 1.0f
            }

            Button(modifier = Modifier.padding(start = 12.dp), onClick = {progressStatus -=0.1f  }){
                Text("Reducir")
                if(progressStatus < 0.0f)
                    progressStatus = 0.0f
            }
        }
    }
}