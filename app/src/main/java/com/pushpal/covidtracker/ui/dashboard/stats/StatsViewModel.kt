package com.pushpal.covidtracker.ui.dashboard.stats

import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.pushpal.covidtracker.model.AppRepository
import com.pushpal.covidtracker.model.network.NetworkManager
import com.pushpal.covidtracker.ui.base.BaseViewModel
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

class StatsViewModel @Inject constructor(
  private val appRepository: AppRepository,
  private val networkManager: NetworkManager
) : BaseViewModel() {

  fun init(arguments: Bundle?) {}

  fun getWorldStat() {
    viewModelScope.launch {
      when {
        networkManager.hasInternetAccess() -> {
          _liveDataLoaded.value = true
          val response = appRepository.getWorldStat()

          response.first.let { worldStat ->
            worldStat?.let {
              Timber.d("World Stat Response: $worldStat")
              _liveTotalCases.value = worldStat.totalCases
              _liveTotalDeaths.value = worldStat.totalDeaths
              _liveTotalRecovered.value = worldStat.totalRecovered
              _liveNewCases.value = worldStat.newCases
              _liveNewDeaths.value = worldStat.newDeaths
            }
          }
          response.second?.let {
            Timber.d("Exception: $it")
          }
        }
      }
    }
  }

  private val _liveTotalCases = MutableLiveData<String>()
  val liveTotalCases: LiveData<String>
    get() = _liveTotalCases

  private val _liveTotalDeaths = MutableLiveData<String>()
  val liveTotalDeaths: LiveData<String>
    get() = _liveTotalDeaths

  private val _liveTotalRecovered = MutableLiveData<String>()
  val liveTotalRecovered: LiveData<String>
    get() = _liveTotalRecovered

  private val _liveNewCases = MutableLiveData<String>()
  val liveNewCases: LiveData<String>
    get() = _liveNewCases

  private val _liveNewDeaths = MutableLiveData<String>()
  val liveNewDeaths: LiveData<String>
    get() = _liveNewDeaths

  private val _liveDataLoaded = MutableLiveData<Boolean>()
  val liveDataLoaded: LiveData<Boolean>
    get() = _liveDataLoaded
}