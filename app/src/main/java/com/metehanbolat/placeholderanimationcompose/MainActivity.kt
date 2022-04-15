package com.metehanbolat.placeholderanimationcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.placeholderanimationcompose.ui.theme.PlaceHolderAnimationComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlaceHolderAnimationComposeTheme {

            }
        }
    }
}