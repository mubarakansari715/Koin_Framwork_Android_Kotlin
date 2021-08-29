package com.example.koin_framwork_android.ViewModel

import androidx.lifecycle.ViewModel

class MainViewmodel(private val test: Test) : ViewModel() {
    fun getTests() {
        test.getTest()
    }
}