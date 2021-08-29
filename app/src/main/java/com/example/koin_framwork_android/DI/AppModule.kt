package com.example.koin_framwork_android.DI

import com.example.koin_framwork_android.KoinData.Car
import com.example.koin_framwork_android.KoinData.Engine
import com.example.koin_framwork_android.Interface.DemoImp
import com.example.koin_framwork_android.Interface.DemoOne
import com.example.koin_framwork_android.Interface.DemoTwo
import com.example.koin_framwork_android.Interface.Main
import com.example.koin_framwork_android.ViewModel.MainViewmodel
import com.example.koin_framwork_android.ViewModel.Test
import com.example.koin_framwork_android.ViewModel.TestImp
import com.example.koin_framwork_android.KoinData.Wheel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.binds
import org.koin.dsl.module

val AppModule = module {

    /* singleton obk=ject
    single { Car() } */

    factory { Engine() }
    factory { Wheel() }
    factory { Car(get(), get()) }

    //factory { DemoImp() as DemoOne } first way
    // factory<DemoOne> { DemoImp() } second way
    //third way
    factory { DemoImp() } binds arrayOf(DemoOne::class, DemoTwo::class) //if we have multiple
    factory { Main(get(), get()) }

    //viewModel
    factory { TestImp() } bind Test::class
    viewModel { MainViewmodel(get()) }

}