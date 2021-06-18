package com.adasoraninda.dagger2example.di.component

import com.adasoraninda.dagger2example.MainActivity
import com.adasoraninda.dagger2example.di.module.PetrolEngineModule
import com.adasoraninda.dagger2example.di.module.WheelsModule
import com.adasoraninda.dagger2example.di.scope.PerActivity
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

// The Injector
@PerActivity
@Subcomponent(
    modules = [WheelsModule::class, PetrolEngineModule::class]
)
interface ActivityComponent {

    @Subcomponent.Factory
    interface Factory {

        fun create(
            @BindsInstance @Named("horse power") horsePower: Int,
            @BindsInstance @Named("engine capacity") engineCapacity: Int
        ): ActivityComponent

    }

    fun inject(activity: MainActivity)

}