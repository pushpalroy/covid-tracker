package com.pushpal.covidtracker.model.network.api

import retrofit2.Response
import retrofit2.http.GET
import java.util.Objects

interface CovidApi {

  @GET("/covid")
  suspend fun getUserInformation(): Response<Objects>
}