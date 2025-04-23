package com.aristidevs.myfirstcomposeapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp


@Composable
fun MyRow(modifier: Modifier){
    Row(modifier = modifier.fillMaxSize().horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.SpaceAround, verticalAlignment = Alignment.CenterVertically)
        {
        var contador:Int = 0

        while (contador <100) {
            Text(text = (contador+1).toString(), fontSize = 24.sp, modifier = Modifier.background(
                Color.Green))
            Text(text = (contador+2).toString(), fontSize = 24.sp, modifier = Modifier.background(
                Color.Cyan))
            Text(text = (contador+3).toString(), fontSize = 24.sp, modifier = Modifier.background(
                Color.Red))
            Text(text = (contador+4).toString(), fontSize = 24.sp, modifier = Modifier.background(
                Color.Yellow))

            contador+=4
        }
    }
}
