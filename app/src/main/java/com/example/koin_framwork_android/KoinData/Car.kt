package com.example.koin_framwork_android.KoinData

import android.util.Log

class Car(private val engine: Engine, private val wheel: Wheel) {
    fun getCar() {
        engine.getEngine()
        wheel.getWheel()
        Log.d("mainData", "Car Running...")
    }
}

class Engine {
    fun getEngine() {
        Log.d("mainData", "Engine Started...")
    }
}

class Wheel {
    fun getWheel() {
        Log.d("mainData", "Wheel Started...")
    }
}