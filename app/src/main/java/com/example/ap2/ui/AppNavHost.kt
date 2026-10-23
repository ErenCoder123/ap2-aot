package com.example.ap2.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Lista,
        modifier = modifier
    ) {
        composable<Lista> {
            CatalogoScreen(
                onPersonagemClick = { id ->
                    navController.navigate(Detalhe(personagemId = id))
                }
            )
        }

        composable<Detalhe> { backStackEntry ->
            val rota = backStackEntry.toRoute<Detalhe>()
            DetalheScreen(
                personagemId = rota.personagemId,
                onVoltar = {
                    navController.popBackStack()
                }
            )
        }
    }
}
