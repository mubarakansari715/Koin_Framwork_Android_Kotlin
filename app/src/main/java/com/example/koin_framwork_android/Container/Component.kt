package com.example.koin_framwork_android.Container

import com.example.koin_framwork_android.KoinData.Car
import com.example.koin_framwork_android.Interface.Main
import com.example.koin_framwork_android.ViewModel.MainViewmodel
import org.koin.core.component.KoinApiExtension
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

@KoinApiExtension
class Component : KoinComponent {
    //val car:Car = get() eagerly initialize

    //lazy initialize
    val car: Car by inject()

    val main: Main by inject()

    val mainViewmodel:MainViewmodel by inject()

}