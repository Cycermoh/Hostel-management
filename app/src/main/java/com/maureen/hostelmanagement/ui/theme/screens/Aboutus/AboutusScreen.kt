package com.maureen.hostelmanagement.ui.theme.screens.Aboutus

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.maureen.hostelmanagement.R
import com.maureen.hostelmanagement.navigation.ROUTE_ABOUTUS
import com.maureen.hostelmanagement.navigation.ROUTE_REGISTRATION
import com.maureen.hostelmanagement.ui.theme.screens.home.Homescreen


@Composable
fun AboutUsScreen(navController: NavHostController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.room2), contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "ABOUT US ",
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier.padding(bottom = 16.dp),
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.W900,
                color = Color.Red

            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "ABOUT ESGRAYS HOSTELS",
                modifier = Modifier.padding(vertical = 8.dp),
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.W900,
                color = Color.Magenta,
                fontSize = 25.sp
            )
            Text(
                text = "Esgrays Hostels is a welcoming accommodation option" +
                        " located in the heart of Nairobi City offering a unique experience for" +
                        " students seeking for affordability",
                modifier = Modifier.padding(bottom = 16.dp),
                fontSize = 17.sp,
                color = Color.Black,
                fontWeight = FontWeight.W500
            )

            // OUR STORY
            Text(
                text = "OUR STORY",
                modifier = Modifier.padding(vertical = 8.dp),
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.W900,
                color = Color.Magenta,
                fontSize = 25.sp
            )
            Text(
                text = "Founded in the year 2015, Esgrays Hostels has been a home away from home for thousands of students all over the country. ",

                modifier = Modifier.padding(bottom = 16.dp),
                fontSize = 17.sp,
                color = Color.Black,
                fontWeight = FontWeight.W600
            )
            Text(
                text = "SERVICES AND AMENITIES",
                modifier = Modifier.padding(vertical = 8.dp),
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.W900,
                color = Color.Magenta,
                fontSize = 25.sp
            )
            Text(
                text = "At Esgrays Hostels, we offer a range of accommodation to suit every student's needs from cozy dormitories to private rooms with modern amenities. ",
                modifier = Modifier.padding(bottom = 16.dp),
                fontSize = 17.sp,
                color = Color.Black,
                fontWeight = FontWeight.W500
            )

            Text(
                text = "CONTACT US",
                modifier = Modifier.padding(vertical = 8.dp),
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.W900,
                color = Color.Magenta,
                fontSize = 25.sp
            )
            Text(
                text = " For more information, contact us at [0703765456] or email us at esgrayshostels123@gmail.com", //style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(bottom = 16.dp),
                fontSize = 17.sp,
                color = Color.Black,
                fontWeight = FontWeight.W600
            )
            Spacer(modifier = Modifier.height(50.dp))
            Button(
                colors = ButtonDefaults.buttonColors(Color.White),
                onClick = {
                    navController.navigate(ROUTE_REGISTRATION)
                    Color.White
                },
                modifier = Modifier.fillMaxSize()
            ) {
                Text(
                    text = "Back",
                    fontSize = 20.sp,
                    color = Color.Magenta,
                )

            }
        }
    }
}
@Preview
@Composable
fun AboutPreview() {
    AboutUsScreen(rememberNavController())
}

