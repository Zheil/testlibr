package com.zheil.libt.mylibrary

import android.content.Context
import android.widget.Toast


class Libr {
    public fun toast(context: Context) {
        Toast.makeText(context, "HELLO LIBRARY!", Toast.LENGTH_SHORT).show()
    }
}