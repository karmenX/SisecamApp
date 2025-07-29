package com.example.sisecamapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sisecamapp.ui.theme.SisecamAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SisecamAppTheme {
                Surface(
                    color= MaterialTheme.colorScheme.background,
                    modifier = Modifier.fillMaxSize()
                ) {
                    MainScreen()
                }

            }
        }
    }
}

@Composable
fun MainScreen(){

    Column(
        modifier=Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        HeaderSection()
        Spacer(modifier = Modifier.height(32.dp))
        Sections()
    }

}

@Composable
fun HeaderSection(){

    Row(
        modifier=Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        ImageOfLogo()
        Spacer(modifier = Modifier.size(18.dp))
        TextOfName()
    }

}


@Composable
fun TextOfName(){
    Text(
        text = "Şişecam Shuttle App",
        textAlign = TextAlign.Start,
        fontWeight = FontWeight.SemiBold,
        fontSize = 15.sp,
    )
}
@Composable
fun ImageOfLogo() {
    val image = painterResource(R.drawable.design)
    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.Fit,
        modifier = Modifier
            .size(85.dp)
            .clip(RectangleShape)
    )
}




@Composable
fun Sections(){

    Column(
        modifier= Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,

            ) {
            Card(
                modifier = Modifier.height(120.dp).weight(1f),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(150,232,135)),

                ) {

                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Shuttle",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center,

                        )
                }
            }


            Spacer(modifier = Modifier.size(40.dp))
            Card(
                modifier = Modifier.height(120.dp).weight(1f),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(253,239,114))
            ) {

                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Get a Taxi",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(35.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Card(
                modifier = Modifier.height(120.dp).weight(1f),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(255,112,117))
            ) {

                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Rent A Car",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Spacer(modifier = Modifier.size(40.dp))
            Card(
                modifier = Modifier.height(120.dp).weight(1f),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(134,213,233))
            ) {

                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "TEMP",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }

}




@Preview(showBackground = true)
@Composable
fun PreviewOfSisecamApp(){
    SisecamAppTheme {
        MainScreen()
    }
}