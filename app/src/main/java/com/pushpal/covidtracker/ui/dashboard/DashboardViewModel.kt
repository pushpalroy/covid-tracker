package com.pushpal.covidtracker.ui.dashboard

import androidx.lifecycle.viewModelScope
import com.pushpal.covidtracker.model.AppRepository
import com.pushpal.covidtracker.model.network.NetworkManager
import com.pushpal.covidtracker.ui.base.BaseViewModel
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

class DashboardViewModel @Inject constructor(
  private val appRepository: AppRepository,
  private val networkManager: NetworkManager
) : BaseViewModel() {

  fun getWorldStat() {
    viewModelScope.launch {
      when {
        networkManager.hasInternetAccess() -> {
          val response = appRepository.getWorldStat()

          response.first.let { worldStat ->
            Timber.d("WorldStat Response: $worldStat")
          }

          response.second?.let {
            Timber.d("Exception: $it")
          }
        }
      }
    }
  }
}