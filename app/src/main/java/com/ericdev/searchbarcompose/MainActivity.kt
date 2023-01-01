package com.ericdev.searchbarcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ericdev.searchbarcompose.ui.theme.SearchBarComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SearchBarComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    SearchBarCompose(
                        hint = "Fucking search...",
                        onSearchParamChange = {

                        },
                        onSearchClick = {

                        }
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SearchBarComposeTheme {
        Greeting("Android")
    }
}