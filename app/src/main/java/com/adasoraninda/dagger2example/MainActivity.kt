package com.adasoraninda.dagger2example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.adasoraninda.dagger2example.car.Car
import com.adasoraninda.dagger2example.di.component.DaggerCarComponent
import com.adasoraninda.dagger2example.di.module.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerCarComponent.builder()
            .dieselEngineModule(DieselEngineModule(100))
            .build()

        component.inject(this)

        car.drive()
    }
}