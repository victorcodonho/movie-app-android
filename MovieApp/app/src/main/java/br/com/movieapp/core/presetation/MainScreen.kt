package br.com.movieapp.core.presetation

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import br.com.movieapp.core.presetation.navigation.BottomNavigationBar
import br.com.movieapp.core.presetation.navigation.NavigationGraph

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavHostController) {

    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController = navController)
        },
        content = {
            NavigationGraph(navController = navController)
        }
    )
}