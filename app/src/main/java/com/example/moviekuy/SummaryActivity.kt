package com.example.moviekuy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moviekuy.databinding.ActivitySummaryBinding

class SummaryActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySummaryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySummaryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataIntent = intent

        with(binding){
            tvBioskop.text = dataIntent.getStringExtra("EXTBIOSKOP")
            tvSeatData.text = dataIntent.getStringExtra("EXTSEAT")
            tvSeatData2.text = dataIntent.getStringExtra("EXTSEAT")

            val date = dataIntent.getStringExtra("EXTDAY") + "/" + dataIntent.getStringExtra("EXTMONTH") + "/" + dataIntent.getStringExtra("EXTYEAR")

            tvDate.text = date
            val payment = dataIntent.getStringExtra("EXTPAYMENT") + "(" + dataIntent.getStringExtra("EXTBANK") + ")"
            tvPaymentData.text = payment
        }
    }
}