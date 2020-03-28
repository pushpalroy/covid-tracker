package com.pushpal.covidtracker.ui.dashboard.stats

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.pushpal.covidtracker.R
import com.pushpal.covidtracker.databinding.FragmentStatsBinding
import com.pushpal.covidtracker.ui.base.BaseFragment

class StatsFragment : BaseFragment<FragmentStatsBinding, StatsViewModel>(),
    SwipeRefreshLayout.OnRefreshListener {

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
    binding.refreshLoader.setOnRefreshListener(this)
    showRefreshLoader()
    getWorldStats()
  }

  private fun observeLiveData() {
    viewModel.liveDataLoaded.observe(viewLifecycleOwner, Observer { isLoaded ->
      run {
        if (isLoaded) {
          hideRefreshLoader()
        }
      }
    })
  }

  override fun onRefresh() {
    getWorldStats()
  }

  private fun getWorldStats() {
    viewModel.getWorldStat()
  }

  private fun showRefreshLoader() {
    binding.refreshLoader.isRefreshing = true
  }

  private fun hideRefreshLoader() {
    binding.refreshLoader.isRefreshing = false
  }
}