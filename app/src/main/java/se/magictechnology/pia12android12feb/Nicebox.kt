package se.magictechnology.pia12android12feb

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import se.magictechnology.pia12android12feb.ui.theme.Pia12android12febTheme

@Composable
fun Nicebox() {
    Text("NICE BOX", modifier = Modifier
        .width(100.dp)
        .height(100.dp)
        .background(Color.Magenta)
    )
}


@Preview(showBackground = true)
@Composable
fun NicePreview() {
    Pia12android12febTheme {
        Nicebox()
    }
}