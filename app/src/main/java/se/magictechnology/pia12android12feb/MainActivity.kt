package se.magictechnology.pia12android12feb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import se.magictechnology.pia12android12feb.ui.theme.Pia12android12febTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pia12android12febTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    //Fancyview()
                    Mathstuff()
                }
            }
        }
    }
}

@Composable
fun Mathstuff() {

    var thenumber by remember { mutableStateOf(0) }
    var numbertext by remember { mutableStateOf("") }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        Spacer(modifier = Modifier.height(20.dp))

        Text("$thenumber",
            modifier = Modifier.background(Color.Cyan),
            fontSize = 60.sp)

        Spacer(modifier = Modifier.height(20.dp))

        TextField(value = numbertext,
            onValueChange = { numbertext = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
        )

        Row {
            Spacer(modifier = Modifier.width(20.dp))
            Button(onClick = {
                numbertext.toIntOrNull()?.let {
                    thenumber = thenumber + it
                }
            }, modifier = Modifier.weight(1F)) {
                Text("PLUS")
            }

            Spacer(modifier = Modifier.width(20.dp))

            Button(onClick = {
                numbertext.toIntOrNull()?.let {
                    thenumber = thenumber - it
                }
            }, modifier = Modifier.weight(1F)) {
                Text("MINUS")
            }

            Spacer(modifier = Modifier.width(20.dp))

            Button(onClick = {
                numbertext.toIntOrNull()?.let {
                    thenumber = thenumber * it
                }
            }, modifier = Modifier.weight(1F)) {
                Text("MULTI")
            }
            Spacer(modifier = Modifier.width(20.dp))
        }

        Spacer(modifier = Modifier.weight(1F))

        Nicebox()

        Button(onClick = {
            thenumber = 0
        }) {
            Text("RESET")
        }

        Spacer(modifier = Modifier.height(20.dp))
    }

}




@Composable
fun Fancyview() {

    var mytext by remember { mutableStateOf("Apelsin") }
    var mynumber by remember { mutableStateOf(0) }

    var personname by remember { mutableStateOf("") }

    Column(modifier = Modifier.background(Color.Cyan)) {
        Row(modifier = Modifier
            .background(Color.Red)
            .height(200.dp)
            .fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
        ) {
            
            Spacer(modifier = Modifier.width(30.dp))
            Column(modifier = Modifier
                .background(Color.Green)
                .width(100.dp)
                .height(100.dp)
            ) {
                Text(text = "BOX")
            }

            Spacer(modifier = Modifier.width(20.dp))

            Text(text = "FANCY!!")
        }

        Row(modifier = Modifier
            .height(100.dp)
            .fillMaxWidth()
            .background(Color.LightGray)
        ) {
            Text(text = "A", modifier = Modifier
                .background(Color.Red)
                .weight(1F)
            )

            Text(text = "B", modifier = Modifier
                .background(Color.Green)
                .weight(2F)
            )

            Text(text = "C", modifier = Modifier
                .background(Color.Blue)
                .weight(1F)
            )
        }

        Spacer(modifier = Modifier.weight(1F))

        Text(text = mytext)
        Text(text = mynumber.toString())

        if(mynumber > 10) {
            Text(text = "MANY CLICKS!!")
        }

        Button(onClick = {
            mytext = "Banan"
            mynumber = mynumber + 1
        }) {
            Text(text = "Klicka här!")
        }

        Row {
            TextField(value = personname, onValueChange = { personname = it })

            Button(onClick = { /*TODO*/ }) {
                Text(text = "Add")
            }

        }
    }


}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier = Modifier.background(Color.Green)) {
        Text(
            text = "Hello $name!",
            modifier = modifier.background(Color.Cyan),
            fontSize = 30.sp
        )
        Text(text = "Mera text", modifier = Modifier.background(Color.Red))

        Row {
            Text(text = "A")
            Text(text = "B")
            Text(text = "C")
            Column {
                Text(text = "X")
                Text(text = "Y")
                Text(text = "Z")
            }
        }

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Pia12android12febTheme {
        //Greeting("banan")
        //Fancyview()
        Mathstuff()
    }
}

