package com.adasoraninda.dagger2example.di.module

import com.adasoraninda.dagger2example.car.DieselEngine
import com.adasoraninda.dagger2example.car.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(private val horsePower: Int) {

    @Provides
    fun provideHorsePower():Int{
        return horsePower
    }

    @Provides
    fun provideEngine(engine:DieselEngine): Engine {
        return engine
    }

}