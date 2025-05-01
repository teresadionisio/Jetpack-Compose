package com.aristidevs.myfirstcomposeapp.components.layout

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Build
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.ColorFilter.Companion.tint
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import com.aristidevs.myfirstcomposeapp.R
import androidx.compose.ui.unit.dp

/*********************************************************/
@Composable
fun MyImagen(modifier: Modifier = Modifier){

  Image(painter = painterResource(R.drawable.ic_mano)
      ,modifier = modifier.padding(all = 40.dp)
      .border(BorderStroke(4.dp, colorResource(R.color.purple_200)))
      ,contentDescription = "Ejemplo"
      ,alpha = 0.8f)
}
/*********************************************************/
@Composable
fun MyImageAdvance(modifier: Modifier = Modifier){

    Column {
    Image(painter = painterResource(R.drawable.ic_launcher_background)
         ,contentDescription = "Ejemplo"
         ,modifier.clip(RoundedCornerShape(16.dp)).border(5.dp, Color.Gray, RectangleShape).padding(4.dp))

     Image(painter = painterResource(R.drawable.ic_launcher_background)
        ,contentDescription = "Ejemplo"
        ,modifier.clip(CircleShape)
            .border(4.dp, Color.Gray,CircleShape)
            .padding(4.dp))

     Image(painter = painterResource(R.drawable.ic_launcher_background)
            ,contentDescription = "Ejemplo"
            ,modifier.padding(4.dp).clip(CutCornerShape(20.dp)))

     Image(painter = painterResource(R.drawable.ic_launcher_background)
            ,contentDescription = "Ejemplo"
            ,modifier.padding(4.dp).clip(AbsoluteCutCornerShape(50.dp)))
  }
}
/*********************************************************/
@Composable
fun MyIcon(modifier: Modifier = Modifier) {
    Column(modifier.padding(40.dp)) {
        Icon(
            imageVector = Icons.Rounded.Check,
            contentDescription = "Icon",
            tint = Color.Blue)
        Icon(
            imageVector = Icons.Rounded.Check,
            contentDescription = "Icon",
            tint = Color.Red)
    }
}
/*******************************************************************/