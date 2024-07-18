package com.gauravtak.android14features.ui

import android.app.GrammaticalInflectionManager
import android.content.Context
import android.content.res.Configuration
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.annotation.RequiresApi
import com.gauravtak.android14features.databinding.ActivityGrammaticalInflectionBinding

@RequiresApi(Build.VERSION_CODES.UPSIDE_DOWN_CAKE)
class GrammaticalInflectionActivity : ComponentActivity() {
    private var binding: ActivityGrammaticalInflectionBinding? = null
    companion object {
        const val TAG = "GrammaticalInflectionActivity"
    }
    private val grammaticalInflectionManager  by lazy {
        getSystemService(GRAMMATICAL_INFLECTION_SERVICE)
                as GrammaticalInflectionManager
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGrammaticalInflectionBinding.inflate(layoutInflater)
        binding?.apply {
            setContentView(root)
        }
        setListeners()
    }

    private fun setListeners() {
        binding?.btnFaminine?.setOnClickListener {
            setGrammaticalGender(Configuration.GRAMMATICAL_GENDER_FEMININE)
        }
        binding?.btnNueter?.setOnClickListener {
            setGrammaticalGender(Configuration.GRAMMATICAL_GENDER_NEUTRAL)
        }
        binding?.btnMasculine?.setOnClickListener {
            setGrammaticalGender(Configuration.GRAMMATICAL_GENDER_MASCULINE)
        }
    }
    private fun setGrammaticalGender(grammaticalGender:Int){
        grammaticalInflectionManager.setRequestedApplicationGrammaticalGender(
            grammaticalGender)
    }
}