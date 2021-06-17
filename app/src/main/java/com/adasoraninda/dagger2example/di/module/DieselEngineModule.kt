package com.adasoraninda.dagger2example.di.module

import com.adasoraninda.dagger2example.car.DieselEngine
import com.adasoraninda.dagger2example.car.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(private val horsePower: Int) {

    @Provides
    fun provideEngine(): Engine {
        return DieselEngine(horsePower)
    }

}