package com.pushpal.covidtracker.model.network.models

import com.google.gson.annotations.SerializedName

data class WorldStat(
  @SerializedName("total_cases") val totalCases: String?,
  @SerializedName("total_deaths") val totalDeaths: String?,
  @SerializedName("total_recovered") val totalRecovered: String?,
  @SerializedName("new_cases") val newCases: String?,
  @SerializedName("new_deaths") val newDeaths: String?
)