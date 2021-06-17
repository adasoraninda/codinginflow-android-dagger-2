package com.adasoraninda.dagger2example.car

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor() : Engine {
    companion object {
        private const val TAG = "Car"
    }

    override fun start() {
        Log.d(TAG, "Petrol engine started")
    }
}