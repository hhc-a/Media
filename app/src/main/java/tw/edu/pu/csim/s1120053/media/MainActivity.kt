package tw.edu.pu.csim.s1120053.media

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import tw.edu.pu.csim.s1120053.media.ui.theme.MediaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MediaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        LazyRow {
            item {
                Image(
                    painter = painterResource(id = R.drawable.animal0),
                    contentDescription = "動物0"
                )
            }
            item {
                Image(
                    painter = painterResource(id = R.drawable.animal1),
                    contentDescription = "動物0"
                )
            }
            item {
                Image(
                    painter = painterResource(id = R.drawable.animal2),
                    contentDescription = "動物0"
                )
            }
        }
        LazyColumn {
            item {
                Text(
                    text = "Hello $name!",
                    modifier = modifier
                )
            }
            item {
                Text(text = "hi")
            }
            items(50) { index ->
                Text(index.toString())
            }
//        item{
//            for (i in 0..50)
//                Text(i.toString())
//        }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MediaTheme {
        Greeting("Android")
    }
}