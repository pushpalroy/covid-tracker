package com.pushpal.covidtracker.ui.dashboard

import android.os.Bundle
import com.pushpal.covidtracker.R
import com.pushpal.covidtracker.databinding.ActivityDashboardBinding
import com.pushpal.covidtracker.ui.base.BaseActivity

class DashboardActivity : BaseActivity<ActivityDashboardBinding, DashboardViewModel>() {
  override fun getViewModelClass() = DashboardViewModel::class.java
  override fun getLayoutId() = R.layout.activity_dashboard

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
  }
}