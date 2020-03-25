package com.pushpal.covidtracker.utils

import android.view.View

data class SnackBarAction(
  val listener: View.OnClickListener,
  val title: String
)