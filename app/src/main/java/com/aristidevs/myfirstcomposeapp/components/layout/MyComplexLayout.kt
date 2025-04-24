package com.aristidevs.myfirstcomposeapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color



@Composable
fun MyComplexLayout(modifier: Modifier){
 Column(Modifier){
        Box(Modifier.weight(1f).fillMaxWidth().background(Color.Cyan)){}
        Row(Modifier.weight(1f).fillMaxWidth()){
           Box(Modifier.weight(1f).fillMaxHeight().background(Color.Red))
           Box(Modifier.weight(1f).fillMaxHeight().background(Color.Green))
          }
        Box(Modifier.weight(1f).fillMaxWidth().background(Color(0xFFFF6696))){}
    }
}