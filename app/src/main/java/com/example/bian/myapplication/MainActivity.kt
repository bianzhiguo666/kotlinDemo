package com.example.bian.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.bian.myapplication.R.layout.activity_main
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)
        mText.text = "hello word"
    }
}
