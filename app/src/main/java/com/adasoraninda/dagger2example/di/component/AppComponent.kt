package com.adasoraninda.dagger2example.di.component

import com.adasoraninda.dagger2example.di.module.DieselEngineModule
import com.adasoraninda.dagger2example.di.module.DriverModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

    fun getActivityComponent(
        dieselEngineModule: DieselEngineModule
    ): ActivityComponent

}