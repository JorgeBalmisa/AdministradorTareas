package com.example.administradortareas

import android.os.Bundle
import androidx.compose.*
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.administradortareas.ui.theme.AdministradorTareasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdministradorTareasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
private fun AdminTareas (tasks : String, niceWork : String, modifier : Modifier = Modifier) {

    val image = painterResource(R.drawable.ic_task_completed)
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Image(

            painter = image,
            contentDescription = null

        )

        Text(
            text = tasks,
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(24.dp)
                .align(Alignment.CenterHorizontally),
            )
        Text(
            text = niceWork,
            modifier = modifier.padding(8.dp)
                .align(Alignment.CenterHorizontally)

        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AdministradorTareasTheme {

        AdminTareas(tasks = stringResource(R.string.all_tasks_completed), niceWork =stringResource(R.string.nicework) )


    }
}