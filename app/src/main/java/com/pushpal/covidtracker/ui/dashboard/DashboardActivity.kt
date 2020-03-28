package com.pushpal.covidtracker.ui.dashboard

import android.os.Bundle
import android.view.MenuItem
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
import com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener
import com.pushpal.covidtracker.R
import com.pushpal.covidtracker.databinding.ActivityDashboardBinding
import com.pushpal.covidtracker.ui.base.BaseActivity
import com.pushpal.covidtracker.ui.dashboard.stats.StatsFragment
import com.pushpal.covidtracker.utils.AppNavigator
import com.pushpal.covidtracker.utils.BottomNavigationBehavior

class DashboardActivity : BaseActivity<ActivityDashboardBinding, DashboardViewModel>(),
    OnNavigationItemSelectedListener {
  override fun getViewModelClass() = DashboardViewModel::class.java
  override fun getLayoutId() = R.layout.activity_dashboard

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    initUi()
  }

  private fun initUi() {
    binding.bottomNav.setOnNavigationItemSelectedListener(this)
    val layoutParams: LayoutParams = binding.bottomNav.layoutParams as LayoutParams
    layoutParams.behavior = BottomNavigationBehavior()
    binding.bottomNav.selectedItemId = R.id.nav_stats
  }

  override fun onNavigationItemSelected(item: MenuItem): Boolean {
    when (item.itemId) {
      R.id.nav_stats -> {
        loadStatsFragment()
        return true
      }
    }
    return false
  }

  private fun loadStatsFragment() {
    AppNavigator.replaceFragment(
        R.id.fragment_container,
        StatsFragment(),
        this,
        null
    )
  }
}