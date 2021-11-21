package com.princessleia.wandtrack.ui.main

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.android.material.tabs.TabLayoutMediator
import com.princessleia.wandtrack.R
import com.princessleia.wandtrack.databinding.FragmentMainBinding
import com.princessleia.wandtrack.ui.about.AboutFragment
import com.princessleia.wandtrack.ui.spells.SpellsFragment

class MainFragment : Fragment(R.layout.fragment_main) {

    private val viewBinding by viewBinding(FragmentMainBinding::bind)

    private var tabLayoutMediator: TabLayoutMediator? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as? AppCompatActivity)?.setSupportActionBar(viewBinding.toolbar)
        initMainTabs()
    }

    private fun initMainTabs() {
        val headers = resources.getStringArray(R.array.main_tabs)
        val tabs = listOf(SpellsFragment(), AboutFragment())

        viewBinding.mainViewPager.adapter = object : FragmentStateAdapter(this@MainFragment) {
            override fun createFragment(position: Int): Fragment {
                return tabs[position]
            }

            override fun getItemCount(): Int {
                return tabs.size
            }
        }
        tabLayoutMediator = TabLayoutMediator(
            viewBinding.mainTabLayout,
            viewBinding.mainViewPager
        ) { tab, position ->
            tab.text = headers[position]
        }
        tabLayoutMediator?.attach()
    }

    override fun onDestroyView() {
        tabLayoutMediator?.detach()
        tabLayoutMediator = null
        super.onDestroyView()
    }
}