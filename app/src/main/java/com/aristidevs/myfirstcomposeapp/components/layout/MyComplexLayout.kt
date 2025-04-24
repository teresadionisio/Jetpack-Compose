package com.aristidevs.myfirstcomposeapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import kotlinx.coroutines.NonDisposableHandle.parent

/*******************************************************************************/
@Composable
fun MyBasicConstrainLayout(modifier: Modifier){

    ConstraintLayout (Modifier.fillMaxSize()){
    val (boxRed,boxGray,boxGreen,boxMagenta, boxYellow) = createRefs()

        Box(Modifier.size(140.dp).background(Color.Red).constrainAs(boxRed){
            top.linkTo(boxYellow.bottom)
            start.linkTo(boxYellow.end)
        })

        Box(Modifier.size(150.dp).background(Color.Magenta).constrainAs(boxMagenta){
            bottom.linkTo(boxYellow.top)
            end.linkTo(boxYellow.start)
        })
        Box(Modifier.size(150.dp).background(Color.Gray).constrainAs(boxGray){
            top.linkTo(boxYellow.bottom)
            end.linkTo(boxYellow.start)
        })
        Box(Modifier.size(150.dp).background(Color.Green).constrainAs(boxGreen){
            bottom.linkTo(boxYellow.top)
            start.linkTo(boxYellow.end)
        })
        Box(Modifier.size(150.dp).background(Color.Yellow).constrainAs(boxYellow){
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            bottom.linkTo(parent.bottom)

        })
    }
}
/*******************************************************************************/
@Composable
fun MyComplexLayout(modifier: Modifier){
 Column(Modifier){
        Spacer(Modifier.height(20.dp))
        Box(Modifier.weight(1f).fillMaxWidth().background(Color.Cyan))
        {
            Text(text = "Ejemplo 1", Modifier.align(Alignment.Center))
        }
        Spacer(Modifier.height(20.dp))
        Row(Modifier.weight(1f).fillMaxWidth()){

           Box(Modifier.weight(1f).fillMaxHeight().background(Color.Red))
           {
              Text(text = "Ejemplo 2", Modifier.align(Alignment.Center))
           }
           Spacer(Modifier.width(20.dp))
           Box(Modifier.weight(1f).fillMaxHeight().background(Color.Green))
           {
               Text(text = "Ejemplo 3", Modifier.align(Alignment.Center))
           }
          }
        Spacer(Modifier.height(20.dp))
        Box(Modifier.weight(1f).fillMaxWidth().background(Color(0xFFFF6696))){}
    }
}
/********************************************************************************/
@Composable
fun ConstrainExampleGuide(modifier: Modifier)
{
    ConstraintLayout(Modifier.fillMaxSize()){
        val boxRed = createRef()
        val topGuide = createGuidelineFromTop(0.5f)

        Box(
            Modifier.size(150.dp).background(Red).constrainAs(boxRed){
                top.linkTo(topGuide)
            })
    }
}
/********************************************************************************/
@Composable
fun ConstrainBarrier(modifier: Modifier) {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxRed, boxYellow, boxCyan) = createRefs()
        val barrier = createEndBarrier(boxRed, boxYellow)

        Box(Modifier.size(65.dp).background(Red).constrainAs(boxRed) {
            top.linkTo(parent.top)
            start.linkTo(parent.start)
        })
        Box(Modifier.size(200.dp).background(Yellow).constrainAs(boxYellow) {
            top.linkTo(boxRed.bottom, margin = 40.dp)
            start.linkTo(parent.start, margin = 32.dp)
        })
        Box(Modifier.size(70.dp).background(Cyan).constrainAs(boxCyan) {
          start.linkTo(barrier)
        })
    }
}
/********************************************************************************/
@Composable
fun ConstraintChain(modifier: Modifier = Modifier){

    ConstraintLayout(Modifier.fillMaxSize()) {
        val (boxRed, boxYellow, boxCyan) = createRefs()

        Box(
            Modifier.size(100.dp).background(Red).constrainAs(boxRed){
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(parent.top)
                bottom.linkTo(boxYellow.top)
            })

        Box(
            Modifier.size(100.dp).background(Yellow).constrainAs(boxYellow){
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(boxRed.bottom)
                bottom.linkTo(boxCyan.top)
            })

        Box(
            Modifier.size(100.dp).background(Cyan).constrainAs(boxCyan){
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(boxYellow.bottom)
                bottom.linkTo(parent.bottom)
            })

        //Los 3 box apilados sin espacios
       // createVerticalChain(boxRed, boxYellow, boxCyan, chainStyle = ChainStyle.Packed)

        //Los 3 box apilados con espacios, es el que se genera por defecto
      //  createVerticalChain(boxRed, boxYellow, boxCyan, chainStyle = ChainStyle.Spread)

        //Los 3 box apilados con mucho espacio, el 1ero se pega al tope del padre
        // y el utlimo al bottom del padre
        createVerticalChain(boxRed, boxYellow, boxCyan, chainStyle = ChainStyle.SpreadInside)

    }
}