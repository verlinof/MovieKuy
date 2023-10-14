package com.example.moviekuy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moviekuy.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            btnTiket.setOnClickListener(){
                try{
                    val intent = Intent(this@DetailsActivity, PaymentActivity::class.java)

                    startActivity(intent)
                    finish()
                }catch (e: Exception){
                    e.printStackTrace()
                }
            }
            btnBack.setOnClickListener(){
                val intent = Intent(this@DetailsActivity, DashboardActivity::class.java)
                startActivity(intent)
            }
        }
    }
}