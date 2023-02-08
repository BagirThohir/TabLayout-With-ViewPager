package com.bagir.fragmentviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bagir.fragmentviewpager.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewPagerAdapter: ViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager, lifecycle)

        with(binding) {
            viewPager.adapter =viewPagerAdapter

            TabLayoutMediator(tabLayout,viewPager) {tab, posisiton ->
                when(posisiton) {
                    0-> tab.text = "Tab Pertama"
                    1-> tab.text = "tab Kedua"


            }
            } .attach()
        }
    }
}