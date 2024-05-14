package com.naomi.nomikunot.navigation

import Roominfo
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.naomi.nomikunot.ui.theme.screens.home.ListColumn
import com.naomi.nomikunot.ui.theme.screens.home.MyListcustom
import com.naomi.nomikunot.ui.theme.screens.home.RoomModel
import com.naomi.nomikunot.ui.theme.screens.login.login
import com.naomi.nomikunot.ui.theme.screens.personalinfo.Personalinfo
import com.naomi.nomikunot.ui.theme.screens.splash.Splash

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController:NavHostController= rememberNavController(),
               startDestination:String= ROUTE_LOGIN) {

    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination)
     {
        composable(ROUTE_LOGIN) {
            login(navController)
        }
        composable(ROUTE_SPLASH) {
            Splash(navController)
        }

        composable(ROUTE_HOME) {
            MyListcustom(navController)
        }
        composable(ROUTE_PERSONINFO) {
            Personalinfo(navController)
        }

        composable(ROUTE_ROOMINFO) {
            Roominfo(navController)
        }
    }
}