package com.example.newsapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModelProvider
import com.example.newsapplication.ui.theme.NewsApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val newsViewModel = ViewModelProvider(this)[NewsViewModel::class.java]
        setContent {
            NewsApplicationTheme {
                Scaffold( modifier = Modifier.fillMaxSize()) {
                    innerPadding ->
                    Column (
                        modifier = Modifier.padding(innerPadding)
                            .fillMaxSize()
                    ){
                        Text(text ="NewsNow",
                            modifier = Modifier.align(Alignment.CenterHorizontally),
                            color = Color.Gray,
                            fontWeight = FontWeight.Bold,
                            fontSize = 30.sp,
                        )
                        HomePage(newsViewModel)
                    }
                }
            }

        }
    }
}

