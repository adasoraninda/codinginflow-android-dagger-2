package com.adasoraninda.dagger2example.di.module

import com.adasoraninda.dagger2example.car.Engine
import com.adasoraninda.dagger2example.car.PetrolEngine
import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule  {

    @Provides
    fun provideEngine(engine: PetrolEngine): Engine {
        return engine
    }

}