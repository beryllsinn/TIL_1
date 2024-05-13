package com.example.mbti

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.resolveDefaults
import com.example.mbti.ui.theme.MbtiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme {
                MyColumnWithBackground()
            }
        }
    }
}

@Composable
fun MyColumnWithBackground() {
    val context = LocalContext.current

    Column(
    ) {
        Button(onClick = {
            val intent = Intent(context, ABCDActivity::class.java)
            context.startActivity(intent)
        }) {
            Text(text = "ABCD 이동")
        }
        Button(onClick = {
            val intent = Intent(context, EFGHActivity::class.java)
            context.startActivity(intent)
        }) {
            Text(text = "EFGH 이동")
        }
    }
}
