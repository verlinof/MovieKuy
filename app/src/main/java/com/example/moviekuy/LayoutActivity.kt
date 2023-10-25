package com.example.moviekuy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.moviekuy.databinding.ActivityLayoutBinding

class LayoutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra("EXTUSERNAME")
        val bundle = Bundle()
        bundle.putString("EXTUSERNAME", username)

        replaceFragment(DashboardFragment())

        with(binding) {
            val dashboardFragment = DashboardFragment()
            dashboardFragment.arguments = bundle

            bottomNavbar.setOnItemSelectedListener() {
                when(it.itemId){
                    R.id.itemDashboard -> replaceFragment(dashboardFragment)
                    R.id.itemCategories -> replaceFragment(CategoriesFragment())
                    R.id.itemProfile -> replaceFragment(ProfileFragment())

                    else -> {}
                }
                true
            }
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager

        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)

        fragmentTransaction.commit()
    }
}