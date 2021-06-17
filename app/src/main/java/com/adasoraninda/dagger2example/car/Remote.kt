package com.adasoraninda.dagger2example.car

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {

    companion object {
        const val TAG = "CAR"
    }

    fun setListener(car: Car) {
        Log.d(TAG, "Remote connected")
    }

}
