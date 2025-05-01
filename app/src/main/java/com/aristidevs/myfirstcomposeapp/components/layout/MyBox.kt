package com.aristidevs.myfirstcomposeapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
/********************************************************************/
@Composable
fun MyBox(modifier: Modifier){
    Box(modifier.fillMaxSize(),contentAlignment= Alignment.Center){
        Box(modifier.size(200.dp)
            .background(Color.Cyan)
            .verticalScroll(rememberScrollState())
            ,contentAlignment = Alignment.Center){
           Text("Hola")
        }
    }
}
/********************************************************************/
