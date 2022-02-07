package pt.jcosta.compositionlocal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import pt.jcosta.design.DesignCompositionLocalProvider
import pt.jcosta.design.LocalColorTokens
import pt.jcosta.design.a.ExampleADesignSystem
import pt.jcosta.design.b.ExampleBDesignSystem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            DesignCompositionLocalProvider(ExampleADesignSystem()) {
                MyScreen()
            }
        }
    }
}

@Composable
private fun MyScreen() {
    Column{
        Text(
            text ="Text",
            color = LocalColorTokens.current.body
        )

        DesignCompositionLocalProvider(ExampleBDesignSystem()) {
            Text(
                text ="Text",
                color = LocalColorTokens.current.body
            )
        }

        Text(
            text ="Text",
            color = LocalColorTokens.current.body
        )
    }
}

