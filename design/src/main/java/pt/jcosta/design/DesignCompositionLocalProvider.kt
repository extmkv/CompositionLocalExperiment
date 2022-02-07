package pt.jcosta.design

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import java.lang.Exception


lateinit var LocalColorTokens: ProvidableCompositionLocal<ColorTokens>

@Composable
fun DesignCompositionLocalProvider(designSystem: DesignSystem, content: @Composable () -> Unit) {
    LaunchedEffect(key1 = designSystem) {
        LocalColorTokens = compositionLocalOf<ColorTokens> { designSystem.colorTokens }
    }

    androidx.compose.runtime.CompositionLocalProvider(
        values = arrayOf(LocalColorTokens provides designSystem.colorTokens),
        content = content)
}
