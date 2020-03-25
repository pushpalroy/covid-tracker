package com.pushpal.covidtracker.model.network

import com.pushpal.covidtracker.model.network.api.CovidApi
import com.pushpal.covidtracker.utils.networkCall

class NetworkDataProvider(
  private val covidApi: CovidApi
) {

  suspend fun getWorldStat() = networkCall {
    covidApi.getWorldStat()
  }

}