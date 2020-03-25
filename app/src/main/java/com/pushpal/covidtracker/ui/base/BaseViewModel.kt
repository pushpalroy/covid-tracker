package com.pushpal.covidtracker.ui.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pushpal.covidtracker.utils.SingleLiveData

abstract class BaseViewModel : ViewModel() {

  val progressLiveData = SingleLiveData<Boolean>()

  private val _exceptionLiveData = MutableLiveData<Exception>()
  val exceptionLiveData: LiveData<Exception>
    get() = _exceptionLiveData

  internal fun updateLiveDataProgress(progress: Boolean) {
    progressLiveData.call(progress)
  }

  internal fun updateLiveDataException(exception: Exception?) {
    _exceptionLiveData.postValue(exception)
  }
}