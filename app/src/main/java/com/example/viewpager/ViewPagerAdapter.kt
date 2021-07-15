package com.example.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class ViewPagerAdapter(supportFragmentManager: FragmentManager) : FragmentPagerAdapter(supportFragmentManager) {

    private var fragmentList: ArrayList<Fragment> = ArrayList()


    override fun getItem(position: Int): Fragment {
        return fragmentList.get(position)

    }

    override fun getCount(): Int {
        return fragmentList.size
}

    fun addFragment(fragment: Fragment) {
        fragmentList.add(fragment)

    }
}