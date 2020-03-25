package com.pushpal.covidtracker.injection.component

import com.pushpal.covidtracker.BaseApplication
import com.pushpal.covidtracker.injection.module.ActivityBindingModule
import com.pushpal.covidtracker.injection.module.AppModule
import com.pushpal.covidtracker.injection.module.RepositoryModule
import com.pushpal.covidtracker.injection.module.ViewModelFactoryModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
      AppModule::class,
      ViewModelFactoryModule::class,
      AndroidSupportInjectionModule::class,
      ActivityBindingModule::class,
      RepositoryModule::class
    ]
)
interface AppComponent : AndroidInjector<BaseApplication> {
  @Component.Factory
  interface Factory : AndroidInjector.Factory<BaseApplication>
}