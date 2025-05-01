package com.aristidevs.myfirstcomposeapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout

/***************************************************************/
@Composable
fun ConstrainLayout1(modifier: Modifier = Modifier){
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxRed, boxYellow, boxGreen, boxCyan, boxMagenta) = createRefs()


        Box(Modifier.size(150.dp).background(Color.Magenta).constrainAs(boxMagenta){
            bottom.linkTo(boxYellow.top)
            end.linkTo(boxYellow.start)
        })
        Box(Modifier.size(150.dp).background(Color.Red).constrainAs(boxRed){
         top.linkTo((boxYellow.bottom))
         start.linkTo(boxYellow.end)
        })
        Box(Modifier.size(150.dp).background(Color.Yellow).constrainAs(boxYellow){
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            bottom.linkTo(parent.bottom)
        })
        Box(Modifier.size(150.dp).background(Color.Green).constrainAs(boxGreen){
            bottom.linkTo(boxYellow.top)
            start.linkTo(boxYellow.end)

        })
        Box(Modifier.size(150.dp).background(Color.Cyan).constrainAs(boxCyan){
            top.linkTo(boxYellow.bottom)
            end.linkTo(boxYellow.start)
        })

    }
}
/***************************************************************/
@Composable
fun ConstrainLayout2(modifier: Modifier = Modifier){
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxRed, boxYellow, boxGreen, boxCyan, boxMagenta) = createRefs()
        val (boxGray, boxBlue, boxBlack, boxLightGray) = createRefs()

        Box(Modifier.size(150.dp).background(Color.Blue).constrainAs(boxBlue){
            top.linkTo(boxYellow.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        })

        Box(Modifier.size(70.dp).background(Color.Yellow).constrainAs(boxYellow){
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        })
        Box(Modifier.size(70.dp).background(Color.Magenta).constrainAs(boxMagenta){
            bottom.linkTo(boxYellow.top)
            end.linkTo(boxYellow.start)
        })
        Box(Modifier.size(70.dp).background(Color.Green).constrainAs(boxGreen){
            bottom.linkTo(boxYellow.top)
            start.linkTo(boxYellow.end)
        })
        Box(Modifier.size(70.dp).background(Color.LightGray).constrainAs(boxLightGray){
            top.linkTo(boxYellow.bottom)
            end.linkTo(boxYellow.start)
        })
        Box(Modifier.size(70.dp).background(Color.Red).constrainAs(boxRed){
          top.linkTo(boxYellow.bottom)
          start.linkTo(boxYellow.end)
        })

        Box(Modifier.size(150.dp).background(Color.Cyan).constrainAs(boxCyan){
            end.linkTo(boxMagenta.end)
            bottom.linkTo((boxMagenta.top))
        })
        Box(Modifier.size(150.dp).background(Color.Gray).constrainAs(boxGray){
            start.linkTo(boxGreen.start)
            bottom.linkTo((boxGreen.top))
        })

        Box(Modifier.size(70.dp).background(Color.Black).constrainAs(boxBlack){
            start.linkTo(boxCyan.end)
            end.linkTo(boxGray.start)
            top.linkTo(boxCyan.top)
            bottom.linkTo(boxCyan.bottom)
        })
    }
}
/***************************************************************/
@Composable
fun ConstrainExampleGuide(modifier: Modifier = Modifier) {
 ConstraintLayout(Modifier.fillMaxSize()){
     val boxRed = createRef()
     val topGuide = createGuidelineFromTop(0.5f)

     Box(
         Modifier.size(150.dp).background(Red).constrainAs(boxRed){
             top.linkTo(topGuide)
         })
 }
}
/***************************************************************/
@Composable
fun ConstraintBarrier(modifier: Modifier = Modifier){
    ConstraintLayout (modifier.fillMaxSize()) {
        val (boxRed, boxYellow, boxCyan) = createRefs()
        val barrier = createEndBarrier(boxRed,boxYellow)
//barrier esta creando una barrera al final (derecha), hay otros

        Box(modifier.size(65.dp).background(Red).constrainAs(boxRed){
            top.linkTo(parent.top)
            start.linkTo(parent.start)
        })
        Box(modifier.size(150.dp).background(Yellow).constrainAs(boxYellow) {
            top.linkTo(boxRed.bottom, margin = 40.dp)
            start.linkTo(parent.start, margin=32.dp)
        })

        Box(modifier.size(100.dp).background(Cyan).constrainAs(boxCyan){
            start.linkTo(barrier)
        })
    }
}
/***************************************************************/
@Composable
fun ConstraintChain(modifier: Modifier = Modifier) {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (boxRed, boxYellow, boxCyan) = createRefs()

        Box(Modifier.size(100.dp).background(Red).constrainAs(boxRed) {
            start.linkTo(parent.start)
            top.linkTo(parent.top)
            end.linkTo(parent.end)
            bottom.linkTo(boxYellow.top)
        })
        Box(Modifier.size(100.dp).background(Yellow).constrainAs(boxYellow) {
            top.linkTo(boxRed.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        })
        Box(Modifier.size(100.dp).background(Cyan).constrainAs(boxCyan) {
            top.linkTo(boxYellow.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
         })
        //Separado
       // createVerticalChain(boxRed,boxYellow,boxCyan, chainStyle = ChainStyle.SpreadInside)
        //Menos separados, standard
        //createVerticalChain(boxRed,boxYellow,boxCyan, chainStyle = ChainStyle.Spread)
        //Junto
        createVerticalChain(boxRed,boxYellow,boxCyan, chainStyle = ChainStyle.Packed)
    }
}