package com.adasoraninda.dagger2example.di.module

import com.adasoraninda.dagger2example.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class DriverModule {

    companion object{

        @Singleton
        @Provides
        @JvmStatic
        fun provideDriver():Driver{
            return Driver()
        }

    }

}