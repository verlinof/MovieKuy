package com.example.moviekuy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moviekuy.databinding.ActivityDashboardBinding

class DashboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataIntent = intent
        val username = dataIntent.getStringExtra("EXTUSERNAME")

        with(binding){
            tvUsername.text = username

            cardGreyhound.setOnClickListener(){
                startActivity(Intent(this@DashboardActivity, DetailsActivity::class.java))

            }
            cardGranTurismo.setOnClickListener(){
                startActivity(Intent(this@DashboardActivity, DetailsActivity::class.java))

            }
            cardOnepiece.setOnClickListener(){
                startActivity(Intent(this@DashboardActivity, DetailsActivity::class.java))

            }
            cardMazeRunner.setOnClickListener(){
                startActivity(Intent(this@DashboardActivity, DetailsActivity::class.java))

            }
        }
    }
}