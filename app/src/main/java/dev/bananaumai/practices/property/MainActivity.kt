package dev.bananaumai.practices.property

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(this::class.java.name, "${BuildConfig.SOME_VAR}")
        Log.d(this::class.java.name, "${BuildConfig.SOME_SECRET}")
    }
}
