package com.maureen.hostelmanagement.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.maureen.hostelmanagement.ui.theme.screens.Aboutus.AboutUsScreen
import com.maureen.hostelmanagement.ui.theme.screens.Registration.Registrationscreen
//import com.maureen.hostelmanagement.ui.theme.screens.home.HomePag
import com.maureen.hostelmanagement.ui.theme.screens.home.Homescreen
import com.maureen.hostelmanagement.ui.theme.screens.login.LoginScreen
import com.maureen.hostelmanagement.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(modifier: Modifier =Modifier, navController: NavHostController = rememberNavController(), startDestination: String = ROUTE_REGISTRATION){
    NavHost(navController = navController, modifier = Modifier, startDestination = startDestination) {
        composable(ROUTE_HOME){
            Homescreen(navController)
        }
        composable(ROUTE_ABOUTUS){
            AboutUsScreen(navController
            )
        }
        composable(ROUTE_REGISTRATION){
            Registrationscreen(navController)
        }
        composable(ROUTE_LOGIN){
            LoginScreen(navController)

        }

        composable(ROUTE_SPLASHSCREEN){
            SplashScreen(navController)
        }

    }
}