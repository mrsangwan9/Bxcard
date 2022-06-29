package com.example.bxcard

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bxcard.ui.theme.BxcardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BxcardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Bcard()
                }
            }
        }
    }
}

@Composable
fun Bcard() {
     val image = painterResource(id = R.drawable.android_logo)
    Column(modifier = Modifier.fillMaxSize(),horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {


        Column(modifier = Modifier.fillMaxHeight(0.7F), horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {


            Image(
                painter = image,
                contentDescription = "android logo",
                modifier = Modifier.size(150.dp)
            )
            Text(
                text = "Arun SanGwan",
                color = Color.White,
                fontWeight = FontWeight.Light,
                fontSize = 44.sp,
            )
            Text(
                text = "Android Developer are Great!!!",
                color = Color.Green,
                modifier = Modifier.padding(top = 5.dp)
            )

        }
        Column(modifier = Modifier.fillMaxHeight(1F), verticalArrangement = Arrangement.Bottom) {


            Row() {


                val icon = painterResource(id = R.drawable.phone)
                Image(
                    painter = icon, contentDescription = "phone icon", modifier = Modifier
                        .padding(start = 27.dp)

                )
                Text(
                    text = "+11 (123) 444 555",
                    color = Color.White,
                    fontSize = 28.sp,
                    modifier = Modifier
                        .padding(start = 23.dp)

                )

            }
            Row(modifier = Modifier.padding(top = 20.dp)) {


                val icon = painterResource(id = R.drawable.share)
                Image(
                    painter = icon, contentDescription = "phone icon", modifier = Modifier
                        .padding(start = 27.dp)
                        .size(42.dp)
                )
                Text(
                    text = "@AndroidDev", color = Color.White, fontSize = 28.sp, modifier = Modifier
                        .padding(start = 23.dp)
                )

            }
            Row(modifier = Modifier.padding(top = 20.dp)) {
                val icon = painterResource(id = R.drawable.mail)
                Image(
                    painter = icon, contentDescription = "phone icon",
                    modifier = Modifier
                        .padding(start = 27.dp)
                        .size(42.dp),
                )
                Text(
                    text = "joe.kill@AndroidDev",
                    color = Color.White,
                    fontSize = 28.sp,
                    modifier = Modifier
                        .padding(start = 23.dp)
                )


            }
        }
    }
}


@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
    BxcardTheme {
    Bcard()
    }
}