package com.example.mbti

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.platform.LocalContext
import com.example.mbti.ui.theme.MbtiTheme

class ABCDActivity  : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme {
                Text(text = "From Wikipedia, the free encyclopedia\n" +
                        "\"Ipsum\" redirects here. For the car, see Toyota Ipsum.\n" +
                        "An example of the Lorem ipsum placeholder text on a green and white webpage.\n" +
                        "Using Lorem ipsum to focus attention on graphic elements in a webpage design proposal\n" +
                        "\n" +
                        "One of the earliest examples of the Lorem ipsum placeholder text on 1960s advertising\n" +
                        "In publishing and graphic design, Lorem ipsum (/ˌlɔː.rəm ˈɪp.səm/) is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before the final copy is available. It is also used to temporarily replace text in a process called greeking, which allows designers to consider the form of a webpage or publication, without the meaning of the text influencing the design.")
            }
        }
    }
}
