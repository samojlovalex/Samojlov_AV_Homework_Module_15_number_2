package com.example.samojlov_av_homework_module_15_number_2.utils

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.samojlov_av_homework_module_15_number_2.models.Page
import com.example.samojlov_av_homework_module_15_number_2.fragments.StartFragment

class ViewPagerAdapter (
    fragment: FragmentActivity,
    private val viewPagerList: MutableList<Page>
): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return viewPagerList.size
    }

    override fun createFragment(position: Int): Fragment {
        val fragment = StartFragment()
        fragment.arguments = bundleOf("vp" to viewPagerList[position])
        return fragment
    }
}