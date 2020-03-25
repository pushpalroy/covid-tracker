package com.pushpal.covidtracker.injection.module

import android.content.Context
import android.content.SharedPreferences
import android.net.ConnectivityManager
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.pushpal.covidtracker.BaseApplication
import com.pushpal.covidtracker.injection.factory.ViewModelFactory
import com.pushpal.covidtracker.injection.qualifiers.ApplicationContext
import com.pushpal.covidtracker.model.network.NetworkManager
import com.pushpal.covidtracker.utils.PREF_DATA
import dagger.Module
import dagger.Provides
import javax.inject.Provider
import javax.inject.Singleton

@Module
class AppModule {

  @Provides
  @Singleton
  fun provideViewModelFactory(creators: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>): ViewModelProvider.Factory {
    return ViewModelFactory(creators = creators)
  }

  @Provides
  @Singleton
  @ApplicationContext
  fun provideAppContext(baseApplication: BaseApplication): Context {
    return baseApplication
  }

  @Provides
  @Singleton
  fun provideConnectivityManager(@ApplicationContext context: Context): ConnectivityManager {
    return context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
  }

  @Provides
  @Singleton
  fun provideNetworkManager(connectivityManager: ConnectivityManager): NetworkManager {
    return NetworkManager(connectivityManager = connectivityManager)
  }

  @Provides
  @Singleton
  fun provideSharePrefs(context: BaseApplication): SharedPreferences {
    return context.getSharedPreferences(PREF_DATA, Context.MODE_PRIVATE)
  }
}