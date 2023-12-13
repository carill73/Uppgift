package se.christerlindqvist.uppgift

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import se.christerlindqvist.uppgift.ui.theme.UppgiftTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UppgiftTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Uppgift")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var number by remember { mutableStateOf(0) }
    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Start",
            fontSize = 60.sp,
            textAlign = TextAlign.Center,
            lineHeight = 120.sp
        )
        Text(
            text = number.toString(),
            fontSize = 80.sp
        )

        Row {
            Button(onClick = { number++ }, Modifier.width(160.dp)) {
                Text(text = "Plus", fontSize = 40.sp )
            }
            Button(onClick = { number-- },Modifier.width(160.dp)) {
                Text("Minus", fontSize = 40.sp )
            }
        }
        Button(onClick = { number = 0 },Modifier.width(220.dp).padding(30.dp)) {
            Text("Reset", fontSize = 40.sp )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UppgiftTheme {
        Greeting("Uppgift")
    }
}