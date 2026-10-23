package com.example.ap2.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val LightColorScheme = lightColorScheme(
    primary = AoTGreenPrimary,
    onPrimary = AoTGreenOnPrimary,
    primaryContainer = AoTGreenContainer,
    onPrimaryContainer = AoTGreenOnContainer,
    secondary = AoTGoldSecondary,
    onSecondary = AoTGoldOnSecondary,
    secondaryContainer = AoTGoldContainer,
    onSecondaryContainer = AoTGoldOnContainer,
    tertiary = AoTBrownTertiary,
    onTertiary = AoTBrownOnTertiary,
    tertiaryContainer = AoTBrownContainer,
    onTertiaryContainer = AoTBrownOnContainer,
    surface = AoTSurfaceLight,
    onSurface = AoTOnSurfaceLight,
    background = AoTBackgroundLight,
    onBackground = AoTOnSurfaceLight
)

private val DarkColorScheme = darkColorScheme(
    primary = AoTGreenPrimaryDark,
    onPrimary = AoTGreenOnPrimaryDark,
    primaryContainer = AoTGreenContainerDark,
    onPrimaryContainer = AoTGreenOnContainerDark,
    secondary = AoTGoldSecondaryDark,
    onSecondary = AoTGoldOnSecondaryDark,
    secondaryContainer = AoTGoldContainerDark,
    onSecondaryContainer = AoTGoldOnContainerDark,
    tertiary = AoTBrownTertiaryDark,
    onTertiary = AoTBrownOnTertiaryDark,
    tertiaryContainer = AoTBrownContainerDark,
    onTertiaryContainer = AoTBrownOnContainerDark,
    surface = AoTSurfaceDark,
    onSurface = AoTOnSurfaceDark,
    background = AoTBackgroundDark,
    onBackground = AoTOnSurfaceDark
)

@Composable
fun Ap2Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as? Activity)?.window
            if (window != null) {
                window.statusBarColor = colorScheme.primary.toArgb()
                WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
            }
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
