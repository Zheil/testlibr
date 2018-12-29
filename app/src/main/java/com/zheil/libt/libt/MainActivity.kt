package com.zheil.libt.libt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.zheil.libt.mylibrary.Libr

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val test = Libr().toast(this)
    }
}
