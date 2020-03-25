package com.pushpal.covidtracker.ui.dashboard.stats

import android.os.Bundle
import android.view.View
import com.pushpal.covidtracker.R
import com.pushpal.covidtracker.databinding.FragmentStatsBinding
import com.pushpal.covidtracker.ui.base.BaseFragment

class StatsFragment : BaseFragment<FragmentStatsBinding, StatsViewModel>() {

  override fun getViewModelClass(): Class<StatsViewModel> = StatsViewModel::class.java
  override fun getLayoutId() = R.layout.fragment_stats

  override fun onViewCreated(
    view: View,
    savedInstanceState: Bundle?
  ) {
    super.onViewCreated(view, savedInstanceState)
    viewModel.init(arguments)
    initUi()
    observeLiveData()
  }

  private fun initUi() {
  }

  private fun observeLiveData() {

  }

}