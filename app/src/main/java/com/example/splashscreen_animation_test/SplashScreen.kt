package com.example.splashscreen_animation_test

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        val topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animaion)

    }
}
