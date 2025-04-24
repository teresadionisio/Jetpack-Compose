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

@Composable
fun InitialScreen(modifier: Modifier){
    Box(modifier= Modifier.fillMaxSize(), contentAlignment = Alignment.Center){

        Box(modifier = Modifier.size(100.dp).background(Color.Green).verticalScroll(
            rememberScrollState()), contentAlignment = Alignment.Center){
            Text("Box")
        }
        Box(modifier = Modifier.size(100.dp).background(Color.Green).verticalScroll(
            rememberScrollState()), contentAlignment = Alignment.Center){
            Text("Column")
        }

    }

}