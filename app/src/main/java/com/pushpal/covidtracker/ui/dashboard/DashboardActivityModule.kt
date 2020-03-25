package com.pushpal.covidtracker.ui.dashboard

import com.pushpal.covidtracker.ui.dashboard.stats.StatsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class DashboardActivityModule {
  @ContributesAndroidInjector
  abstract fun bindStatsFragment(): StatsFragment
}

