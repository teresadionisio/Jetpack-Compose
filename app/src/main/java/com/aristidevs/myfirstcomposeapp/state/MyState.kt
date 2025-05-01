package com.aristidevs.myfirstcomposeapp.state

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/*****************************************************************************/
//Se borra al rotar la pantalla
@Composable
fun MyState(modifier: Modifier){
    var number = remember { mutableIntStateOf(0) }

    Text("Púlsame: ${number.value}", modifier.padding(20.dp).clickable { number.value ++ })
}
/*****************************************************************************/
//Se mantiene al rotar la pantalla
@Composable
fun MyState2(modifier: Modifier){
    var number by rememberSaveable  { mutableIntStateOf(0) }
    Text("Púlsame: $number", modifier.padding(40.dp).clickable { number ++ })
}
/*****************************************************************************/
@Composable
fun MyStateGlobal(modifier: Modifier){
    var number by rememberSaveable { mutableIntStateOf(0) }

    Column(modifier = modifier){
      StateExample1(number) {number++}
      StateExample2(number)
    }
}
/******************************************************************************/
@Composable
fun StateExample1(number: Int, onClick: () -> Unit)
{
 Text("Púlsame: $number", modifier = Modifier.clickable { onClick() })
}
/******************************************************************************/
@Composable
fun StateExample2(number: Int) {
    Text("Púlsame: $number", modifier = Modifier.clickable { })
}
/******************************************************************************/
