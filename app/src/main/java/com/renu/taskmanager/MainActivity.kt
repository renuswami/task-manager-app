package com.renu.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.renu.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingPreview()
                }
            }
        }
    }
}

@Composable
fun Greeting(massage1: String, massages2: String, modifier: Modifier = Modifier) {

    val image = painterResource(R.drawable.ic_task_completed)
    Box {
        Image(
            painter = image,
            contentDescription = null
        )
        Column {

            Text(
                text = massage1,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = modifier
                    .padding(
                        top = 24.dp,
                        bottom = 8.dp
                    )
            )
            Text(
                text = massages2,
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskManagerTheme {
        Greeting("All tasks completed", "Nice work!")
    }
}