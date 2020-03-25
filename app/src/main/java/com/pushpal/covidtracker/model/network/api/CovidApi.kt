package com.pushpal.covidtracker.model.network.api

import com.pushpal.covidtracker.model.network.models.WorldStat
import retrofit2.Response
import retrofit2.http.GET

interface CovidApi {

  @GET("/coronavirus/worldstat.php")
  suspend fun getWorldStat(): Response<WorldStat>
}