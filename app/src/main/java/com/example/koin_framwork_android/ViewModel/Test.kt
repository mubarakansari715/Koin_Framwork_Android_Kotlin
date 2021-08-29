package com.example.koin_framwork_android.ViewModel

import android.util.Log

interface Test {
    fun getTest()
}

class TestImp:Test {
    override fun getTest() {
        Log.d("mainData", "Hello ViewModel...!")
    }
}