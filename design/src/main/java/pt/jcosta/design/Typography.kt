package pt.jcosta.design

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit

data class Typography(
    val fontFamily: FontFamily,
    val fontSize: TextUnit,
    val fontWeight: FontWeight,
    val letterSpacing: Dp,
    val lineHeight: Dp,
    val isUppercase: Boolean,
    val paragraphSpacing: Dp
)