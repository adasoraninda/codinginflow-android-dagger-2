package com.adasoraninda.dagger2example.car

class Wheels(private val rims: Rims, private val tires: Tires) {
    // We don't own this class so we can't annotate it with @Inject

}