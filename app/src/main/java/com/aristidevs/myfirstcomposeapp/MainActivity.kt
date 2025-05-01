package com.aristidevs.myfirstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.aristidevs.myfirstcomposeapp.components.layout.ConstrainExampleGuide
import com.aristidevs.myfirstcomposeapp.components.layout.ConstrainLayout1
import com.aristidevs.myfirstcomposeapp.components.layout.ConstrainLayout2
import com.aristidevs.myfirstcomposeapp.components.layout.ConstraintBarrier
import com.aristidevs.myfirstcomposeapp.components.layout.ConstraintChain
import com.aristidevs.myfirstcomposeapp.components.layout.Exercise1
import com.aristidevs.myfirstcomposeapp.components.layout.Exercise2
import com.aristidevs.myfirstcomposeapp.components.layout.MiPrimerLayout
import com.aristidevs.myfirstcomposeapp.components.layout.MiSegundoLayout
import com.aristidevs.myfirstcomposeapp.components.layout.MyBox
import com.aristidevs.myfirstcomposeapp.components.layout.MyButtonExample
import com.aristidevs.myfirstcomposeapp.components.layout.MyButtonExample2
import com.aristidevs.myfirstcomposeapp.components.layout.MyColumn
import com.aristidevs.myfirstcomposeapp.components.layout.MyIcon
import com.aristidevs.myfirstcomposeapp.components.layout.MyImageAdvance
import com.aristidevs.myfirstcomposeapp.components.layout.MyImagen
import com.aristidevs.myfirstcomposeapp.components.layout.MyProgress
import com.aristidevs.myfirstcomposeapp.components.layout.MyProgressAvanzado
import com.aristidevs.myfirstcomposeapp.components.layout.MyProgressAvanzado2
import com.aristidevs.myfirstcomposeapp.components.layout.MyProgressAvanzado3
import com.aristidevs.myfirstcomposeapp.components.layout.MyRow
import com.aristidevs.myfirstcomposeapp.components.layout.MyTextButtom
import com.aristidevs.myfirstcomposeapp.components.layout.MyoutlinedButton
import com.aristidevs.myfirstcomposeapp.state.MyState
import com.aristidevs.myfirstcomposeapp.state.MyState2
import com.aristidevs.myfirstcomposeapp.state.MyStateGlobal
import com.aristidevs.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme

/************************************************************************/
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstComposeAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()){innerPadding ->
                    MyProgressAvanzado3(Modifier.padding(innerPadding))
                }
            }
        }
    }
}
/************************************************************************/

