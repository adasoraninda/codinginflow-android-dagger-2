package com.adasoraninda.dagger2example.di.component

import com.adasoraninda.dagger2example.MainActivity
import com.adasoraninda.dagger2example.di.module.DieselEngineModule
import com.adasoraninda.dagger2example.di.module.PetrolEngineModule
import com.adasoraninda.dagger2example.di.module.WheelsModule
import com.adasoraninda.dagger2example.di.scope.PerActivity
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

// The Injector
@PerActivity
@Subcomponent(
    modules = [WheelsModule::class, PetrolEngineModule::class]
)
interface ActivityComponent {

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horse power") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engine capacity") engineCapacity: Int): Builder

        fun build(): ActivityComponent
    }

    fun inject(activity: MainActivity)

}