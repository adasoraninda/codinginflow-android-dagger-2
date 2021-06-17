package com.adasoraninda.dagger2example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adasoraninda.dagger2example.car.Car
import com.adasoraninda.dagger2example.di.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car:Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerCarComponent.create()
        component.inject(this)

        car.drive()
    }
}