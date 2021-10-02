package com.jd.cleannotes.framework.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jd.cleannotes.R

class MainActivity : AppCompatActivity() {

    private val TAG: String = "AppDebug"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}