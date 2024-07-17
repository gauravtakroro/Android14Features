package com.gauravtak.android14features

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.gauravtak.android14features.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    private var binding: ActivityMainBinding?=null
    companion object {
        const val TAG = "MainActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding?.apply {
            setContentView(root)
        }
    }
}