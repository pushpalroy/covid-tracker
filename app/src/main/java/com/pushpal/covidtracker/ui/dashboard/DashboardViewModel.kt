package com.pushpal.covidtracker.ui.dashboard

import com.pushpal.covidtracker.model.AppRepository
import com.pushpal.covidtracker.model.network.NetworkManager
import com.pushpal.covidtracker.ui.base.BaseViewModel
import javax.inject.Inject

class DashboardViewModel @Inject constructor(
  private val appRepository: AppRepository,
  private val networkManager: NetworkManager
) : BaseViewModel() {

}