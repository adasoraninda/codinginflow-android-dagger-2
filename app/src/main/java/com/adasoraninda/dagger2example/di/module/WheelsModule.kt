package com.adasoraninda.dagger2example.di.module

import com.adasoraninda.dagger2example.car.Rims
import com.adasoraninda.dagger2example.car.Tires
import com.adasoraninda.dagger2example.car.Wheels
import dagger.Module
import dagger.Provides

@Module
abstract class WheelsModule {

    companion object {
        @Provides
        @JvmStatic
        fun provideRims(): Rims {
            return Rims()
        }

        @Provides
        @JvmStatic
        fun provideTires(): Tires {
            val tires = Tires()
            tires.inflate()

            return tires
        }

        @Provides
        @JvmStatic
        fun provideWheels(rims: Rims, tires: Tires): Wheels {
            return Wheels(rims, tires)
        }
    }

}