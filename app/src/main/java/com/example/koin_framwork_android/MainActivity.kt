package com.example.koin_framwork_android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.koin_framwork_android.Container.Component
import com.example.koin_framwork_android.KoinData.Car
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val component = Component()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        component.car.getCar()
        component.main.getdemo()
        component.mainViewmodel.getTests()
    }
}