package com.adasoraninda.dagger2example.di.component

import com.adasoraninda.dagger2example.MainActivity
import com.adasoraninda.dagger2example.di.module.PetrolEngineModule
import com.adasoraninda.dagger2example.di.module.WheelsModule
import dagger.Component

// The Injector
@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {

    fun inject(activity: MainActivity)

}