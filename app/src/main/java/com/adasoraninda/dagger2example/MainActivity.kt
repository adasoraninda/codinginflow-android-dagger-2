package com.adasoraninda.dagger2example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.adasoraninda.dagger2example.car.Car
import com.adasoraninda.dagger2example.di.module.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = (application as CarApp).getAppComponent()
            .getActivityComponent(DieselEngineModule(120))

        component.inject(this)

        car1.drive()
        car2.drive()
    }
}