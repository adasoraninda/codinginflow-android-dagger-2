package com.adasoraninda.dagger2example.car

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(
    private val engine: Engine,
    private val wheels: Wheels
) {

    companion object {
        const val TAG = "CAR"
    }

    fun drive() {
        Log.d(TAG, "driving")
    }

}