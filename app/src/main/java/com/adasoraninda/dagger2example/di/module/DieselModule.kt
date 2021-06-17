package com.adasoraninda.dagger2example.di.module

import com.adasoraninda.dagger2example.car.DieselEngine
import com.adasoraninda.dagger2example.car.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselModule { // or use interface

    @Binds
    abstract fun bindEngine(engine: DieselEngine): Engine

}