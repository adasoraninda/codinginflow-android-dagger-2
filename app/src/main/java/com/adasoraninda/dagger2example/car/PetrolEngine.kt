package com.adasoraninda.dagger2example.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(
    @Named("horse power") private val horsePower: Int,
    @Named("engine capacity") private val engineCapacity: Int
) : Engine {
    companion object {
        private const val TAG = "Car"
    }

    override fun start() {
        Log.d(
            TAG, "Petrol engine started.\n" +
                    "Horsepower: $horsePower\n" +
                    "Engine Capacity: $engineCapacity"
        )
    }
}