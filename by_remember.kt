package com.example.counter

import android.app.Activity
import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.edit
import com.example.counter.ui.theme.CounterTheme
import java.time.LocalDateTime


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CounterTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    val activity = LocalContext.current as? Activity
    val sharedPref = remember {
        activity?.getPreferences(Context.MODE_PRIVATE)
    }
    var count by remember {
        val saveCount = sharedPref?.getInt("count", 0)
        mutableStateOf(saveCount ?: 0)
    }

    Column {
        Button(
            onClick = {
                count = count + 1
                sharedPref?.edit {
                    putInt(
                        "count", count
                    )
                }
            }) {
            Text(text = "count: $count")
        }
        Button(
            onClick = {
                count = count - 1
                sharedPref?.edit {
                    putInt(
                        "count", count
                    )
                }
            }) {
            Text(text = "MINUS")
        }
        Button(
            onClick = {
                count = 0
                sharedPref?.edit {
                    putInt(
                        "count", count
                    )
                }
            }) {
            Text(text = "REFRESH")
        }
        Button(
            onClick = {
                count = count * 2
                sharedPref?.edit {
                    putInt(
                        "count", count
                    )
                }
            }) {
            Text(text = "X 2")
        }
        Button(
            onClick = {
                count = count / 2
                sharedPref?.edit {
                    putInt(
                        "count", count
                    )
                }
            }) {
            Text(text = "/ 2")
        }
        var date by remember {
            mutableStateOf(LocalDateTime.now())
        }
        Button(
            onClick = {
                date = LocalDateTime.now()
                sharedPref?.edit {
                }
            }) {
            Text(text = "Date: $date")
        }
    }
}
