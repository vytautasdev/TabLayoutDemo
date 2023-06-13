package com.vytautasdev.tablayoutdemo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabPagerAdapter(fragmentActivity: FragmentActivity, private val tabCount: Int) :
    FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> Tab1Fragment()
            1 -> Tab2Fragment()
            2 -> Tab3Fragment()
            3 -> Tab4Fragment()
            else -> Tab1Fragment()
        }
    }

    override fun getItemCount(): Int = tabCount
}