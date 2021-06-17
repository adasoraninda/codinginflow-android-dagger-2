package com.adasoraninda.dagger2example.di.component

import com.adasoraninda.dagger2example.MainActivity
import com.adasoraninda.dagger2example.di.module.DieselEngineModule
import com.adasoraninda.dagger2example.di.module.PetrolEngineModule
import com.adasoraninda.dagger2example.di.module.WheelsModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

// The Injector
@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horse power") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engine capacity") engineCapacity:Int):Builder

        fun build(): CarComponent
    }

    fun inject(activity: MainActivity)

}