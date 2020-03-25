package com.pushpal.covidtracker.injection.module

import com.pushpal.covidtracker.injection.scope.ActivityScope
import com.pushpal.covidtracker.ui.dashboard.DashboardActivity
import com.pushpal.covidtracker.ui.dashboard.DashboardActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

  @ActivityScope
  @ContributesAndroidInjector(modules = [DashboardActivityModule::class])
  internal abstract fun bindDashboardActivity(): DashboardActivity
}
