package com.adasoraninda.dagger2example

import android.app.Application
import com.adasoraninda.dagger2example.di.component.AppComponent
import com.adasoraninda.dagger2example.di.component.DaggerAppComponent
import com.adasoraninda.dagger2example.di.module.DriverModule

class CarApp : Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.factory()
            .create(DriverModule("Hans"))
    }

    fun getAppComponent(): AppComponent {
        return appComponent
    }

}