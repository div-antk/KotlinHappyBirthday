package com.example.kotlinhappybirthday

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.kotlinhappybirthday.ui.theme.KotlinHappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlinHappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun BirthdayGreetingWithText(message: String, from: String) {
    Row {
        Text(
            text = message,
            fontSize = 36.sp
        )
        Text(
            text = from,
            fontSize = 24.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    KotlinHappyBirthdayTheme {
        BirthdayGreetingWithText("HPD James", "- from Emma")
    }
}