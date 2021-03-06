package com.pushpal.covidtracker.injection.module

import androidx.lifecycle.ViewModel
import com.pushpal.covidtracker.injection.scope.ViewModelKey
import com.pushpal.covidtracker.ui.dashboard.DashboardViewModel
import com.pushpal.covidtracker.ui.dashboard.stats.StatsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelFactoryModule {

  @Binds
  @IntoMap
  @ViewModelKey(DashboardViewModel::class)
  abstract fun bindDashboardViewModel(dashboardViewModel: DashboardViewModel): ViewModel

  @Binds
  @IntoMap
  @ViewModelKey(StatsViewModel::class)
  abstract fun bindStatsViewModel(statsViewModel: StatsViewModel): ViewModel
}