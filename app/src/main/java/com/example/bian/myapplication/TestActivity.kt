package com.example.bian.myapplication

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Toast

import com.example.bian.myapplication.R.layout.activity_main
import kotlinx.android.synthetic.main.activity_main.*

class TestActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)
        mText.text = "hah"
        mText.setOnClickListener{
            Toast.makeText(this,"测试",Toast.LENGTH_LONG).show()
        }
        getAccess(null,null);
        getItem(1,2,3,4,5)
    }

    public fun getAccess(a:Int?,b:Int?){
        print("aas")
        println("aaa")
    }

    fun getItem(vararg a:Int){
        for (item in a){
            print("${item}")
        }
    }
}