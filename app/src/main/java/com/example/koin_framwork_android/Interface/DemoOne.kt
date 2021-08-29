package com.example.koin_framwork_android.Interface

import android.util.Log

interface DemoOne {
    fun getDemoOne()
}
interface DemoTwo {
    fun getDemoTwo()
}
class DemoImp :DemoOne,DemoTwo {
    override fun getDemoOne() {
        Log.d("mainData", "This is DemoOne.")
    }

    override fun getDemoTwo() {
        Log.d("mainData", "This is DemoTwo.")
    }
}
class Main(private val demoOne: DemoOne,private val demoTwo: DemoTwo){
    fun getdemo(){
        demoOne.getDemoOne()
        demoTwo.getDemoTwo()
    }
}