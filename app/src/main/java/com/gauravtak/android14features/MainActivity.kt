package com.gauravtak.android14features

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.gauravtak.android14features.databinding.ActivityMainBinding
import com.gauravtak.android14features.ui.GrammaticalInflectionActivity

class MainActivity : ComponentActivity() {
    private var binding: ActivityMainBinding? = null
    companion object {
        const val TAG = "MainActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding?.apply {
            setContentView(root)
        }
        setListeners()
    }

    private fun setListeners() {
        binding?.tvScreenShotDetectionApi?.setOnClickListener {

        }
        binding?.tvCustomShareIntent?.setOnClickListener {

        }
        binding?.tvGrammaticalInflection?.setOnClickListener {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {
                val starter = Intent(this, GrammaticalInflectionActivity::class.java)
                startActivity(starter)
            } else {
                showToast("Grammatical Inflection API is not supported below Android 14")
            }
        }
        binding?.tvGesturePreview?.setOnClickListener {

        }
        binding?.tvRegionalPreference?.setOnClickListener {

        }
        binding?.tvPermissionFlow?.setOnClickListener {

        }
    }
}