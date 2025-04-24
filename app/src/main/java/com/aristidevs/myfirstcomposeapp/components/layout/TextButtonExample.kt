package com.aristidevs.myfirstcomposeapp.components.layout

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


@Composable
fun TextButtonExample() {
    var counter by remember { mutableStateOf(0) }

    TextButton(onClick = { counter++ }) {
        Text("CLICS: $counter",Modifier.padding(horizontal =  24.dp,vertical = 24.dp))
    }
}