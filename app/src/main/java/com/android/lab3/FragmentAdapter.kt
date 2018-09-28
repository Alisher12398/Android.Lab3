package com.android.lab3

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class FragmentAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    /*override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return FragmentFirst.newInstance("First Title")
            else -> return FragmentSecond.newInstance()
        }
    }*/
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                return FragmentFirst()
            }
            1 -> {
                return FragmentSecond()
            }
        }
         return FragmentFirst()
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return "Tab $position"
    }

}
