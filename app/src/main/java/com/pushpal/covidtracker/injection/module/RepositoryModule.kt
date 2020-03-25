package com.pushpal.covidtracker.injection.module

import android.content.SharedPreferences
import com.pushpal.covidtracker.BuildConfig
import com.pushpal.covidtracker.model.AppRepository
import com.pushpal.covidtracker.model.network.NetworkDataProvider
import com.pushpal.covidtracker.model.network.api.CovidApi
import com.pushpal.covidtracker.utils.API_KEY
import com.pushpal.covidtracker.utils.BASE_URL
import com.pushpal.covidtracker.utils.SharedPrefUtils
import dagger.Module
import dagger.Provides
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class RepositoryModule {

  @Provides
  @Singleton
  fun provideAppRepository(
    networkDataProvider: NetworkDataProvider
  ) = AppRepository(
      networkDataProvider = networkDataProvider
  )

  @Provides
  @Singleton
  fun provideNetworkDataProvider(
    covidApi: CovidApi
  ) = NetworkDataProvider(
      covidApi = covidApi
  )

  @Provides
  @Singleton
  fun provideCovidApi(okHttpClient: OkHttpClient): CovidApi {
    return getRetrofit(okHttpClient).create(CovidApi::class.java)
  }

  @Provides
  @Singleton
  fun provideSharedPrefUtils(
    sharedPreferences: SharedPreferences
  ): SharedPrefUtils {
    return SharedPrefUtils(sharedPreferences)
  }

  @Provides
  @Singleton
  fun provideOkHttpClient(headerInterceptor: Interceptor): OkHttpClient {
    val httpBuilder = OkHttpClient.Builder()
        .addInterceptor(headerInterceptor)
    when {
      BuildConfig.DEBUG -> {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        httpBuilder.interceptors()
            .add(httpLoggingInterceptor)
      }
    }
    return httpBuilder.build()
  }

  @Provides
  @Singleton
  fun getHeaderInterceptor(): Interceptor {
    return Interceptor { chain ->
      val request =
        chain.request()
            .newBuilder()
            .addHeader("x-rapidapi-host", "coronavirus-monitor.p.rapidapi.com")
            .addHeader("x-rapidapi-key", API_KEY)

      val actualRequest = request.build()
      chain.proceed(actualRequest)
    }
  }

  private fun getRetrofit(okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()
  }
}