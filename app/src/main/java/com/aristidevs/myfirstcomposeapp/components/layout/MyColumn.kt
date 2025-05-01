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
import androidx.constraintlayout.compose.HorizontalAlign
/*****************************************************************/
@Composable
fun MyColumn(modifier: Modifier = Modifier) {
 var number:Int=0
 Column(modifier.fillMaxSize()
       .verticalScroll(rememberScrollState())
       ,verticalArrangement = Arrangement.Center
       ,horizontalAlignment = Alignment.CenterHorizontally)
  {
      while (number < 100) {
          number++
          Text("$number", modifier=Modifier.background(Color.Cyan))
          number++
          Text("$number", modifier=Modifier.background(Color.Blue))
          number++
          Text("$number", modifier=Modifier.background(Color.LightGray))
          number++
          Text("$number", modifier=Modifier.background(Color.Magenta))
      }
  }
}
/*****************************************************************/