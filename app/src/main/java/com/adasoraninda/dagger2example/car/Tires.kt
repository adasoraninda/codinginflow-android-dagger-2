package com.adasoraninda.dagger2example.car

import android.util.Log

class Tires {
    // We don't own this class so we can't annotate it with @Inject
    companion object {
        private const val TAG = "Car"
    }

    fun inflate() {
        Log.d(TAG, "Tires inflated")
    }

}