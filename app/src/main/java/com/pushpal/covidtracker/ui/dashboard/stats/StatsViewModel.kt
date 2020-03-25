package com.pushpal.covidtracker.ui.dashboard.stats

import android.os.Bundle
import com.pushpal.covidtracker.model.AppRepository
import com.pushpal.covidtracker.ui.base.BaseViewModel
import javax.inject.Inject

class StatsViewModel @Inject constructor(
  private val appRepository: AppRepository
) : BaseViewModel() {

  fun init(arguments: Bundle?) {

  }
}