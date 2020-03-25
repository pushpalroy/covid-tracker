package com.pushpal.covidtracker.model

import com.pushpal.covidtracker.model.network.NetworkDataProvider

class AppRepository(
  private val networkDataProvider: NetworkDataProvider
) {
  suspend fun getWorldStat() = networkDataProvider.getWorldStat()

}