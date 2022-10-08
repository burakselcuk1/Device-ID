package com.example.device_id

import android.annotation.SuppressLint
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import java.security.AccessController.getContext
import java.util.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("HardwareIds")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val id: String = Settings.Secure.getString(contentResolver, Settings.Secure.ANDROID_ID)
        Log.e("burak","${id.toString()}")

    }
}