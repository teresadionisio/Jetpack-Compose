package com.aristidevs.myfirstcomposeapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.produceState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun MyBasicConstraintLayout(modifier: Modifier)
{
 ConstraintLayout(Modifier.fillMaxSize()){
   val (boxRed,boxGray,boxGreen,boxMagenta, boxYellow,boxDarkGray, boxCyan,boxBlack,boxBlue,boxWhite) = createRefs()

     Box(Modifier.size(150.dp).background(Color.Blue).constrainAs(boxBlue){
         top.linkTo(boxYellow.bottom)
         start.linkTo(parent.start)
         end.linkTo(parent.end)
     })
     Box(Modifier.size(70.dp).background(Color.Red).constrainAs(boxRed){
      top.linkTo(boxYellow.bottom)
      start.linkTo(boxYellow.end)
     })
     Box(Modifier.size(70.dp).background(Color.Gray).constrainAs(boxGray){
         top.linkTo(boxYellow.bottom)
         end.linkTo(boxYellow.start)
     })
     Box(Modifier.size(70.dp).background(Color.Green).constrainAs(boxGreen){
         bottom.linkTo(boxYellow.top)
         start.linkTo(boxYellow.end)
     })
     Box(Modifier.size(70.dp).background(Color.Magenta).constrainAs(boxMagenta){
         bottom.linkTo(boxYellow.top)
         end.linkTo(boxYellow.start)
     })
     Box(Modifier.size(70.dp).background(Color.Yellow).constrainAs(boxYellow){
         bottom.linkTo(parent.bottom)
         end.linkTo(parent.end)
         top.linkTo(parent.top)
         start.linkTo(parent.start)
     })
     Box(Modifier.size(150.dp).background(Color.Cyan).constrainAs(boxCyan){
         bottom.linkTo(boxMagenta.top)
         end.linkTo(boxMagenta.end)
     })
     Box(Modifier.size(70.dp).background(Color.Black).constrainAs(boxBlack){
         bottom.linkTo(boxWhite.top)
         start.linkTo(boxCyan.end)
         end.linkTo(boxDarkGray.start)
     })
     Box(Modifier.size(150.dp).background(Color.DarkGray).constrainAs(boxDarkGray){
         bottom.linkTo(boxGreen.top)
         start.linkTo(boxGreen.start)
     })
     Box(Modifier.height(105.dp).width(70.dp).background(Color.White).constrainAs(boxWhite){
         start.linkTo(boxCyan.end)
         end.linkTo(boxDarkGray.start)
         bottom.linkTo(boxYellow.top)
     })

 }
}