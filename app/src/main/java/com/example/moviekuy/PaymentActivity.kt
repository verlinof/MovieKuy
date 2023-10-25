package com.example.moviekuy

import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.TimePicker
import android.widget.Toast
import com.example.moviekuy.databinding.ActivityPaymentBinding
import java.util.Calendar
import java.util.Locale

class PaymentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPaymentBinding
    private lateinit var bioskop: Array<String>
    private lateinit var seat: Array<String>
    private lateinit var paymentmethod: Array<String>
    private lateinit var banks: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            bioskop = resources.getStringArray(R.array.bioskop)
            seat = resources.getStringArray(R.array.seat)
            paymentmethod = resources.getStringArray(R.array.paymentmethod)
            banks = resources.getStringArray(R.array.banks)

            val adapterBioskop = ArrayAdapter(this@PaymentActivity, android.R.layout.simple_spinner_item, bioskop )
            spinnerJenisBioskop.adapter = adapterBioskop

            val adapterSeat = ArrayAdapter(this@PaymentActivity, android.R.layout.simple_spinner_item, seat)
            spinnerJenisSeat.adapter = adapterSeat

            val adapterPaymentMethod = ArrayAdapter(this@PaymentActivity,android.R.layout.simple_spinner_item, paymentmethod)
            spinnerPaymentType.adapter = adapterPaymentMethod

            val adapterBank = ArrayAdapter(this@PaymentActivity, android.R.layout.simple_spinner_item, banks)
            spinnerBank.adapter = adapterBank



            btnBack.setOnClickListener(){
                val intent = Intent(this@PaymentActivity, DetailsActivity::class.java)
                startActivity(intent)

                finish()
            }

            btnOrderSummary.setOnClickListener(){
                val year = dpTanggal.year.toString()
                val month = dpTanggal.month.toString()
                val day = dpTanggal.dayOfMonth.toString()
                val selectedBioskop = spinnerJenisBioskop.selectedItem.toString()
                val selectedSeat = spinnerJenisSeat.selectedItem.toString()
                val selectedPayment = spinnerPaymentType.selectedItem.toString()
                val selectedBank = spinnerBank.selectedItem.toString()

                val intent = Intent(this@PaymentActivity, SummaryActivity::class.java)
                intent.putExtra("EXTYEAR", year)
                intent.putExtra("EXTMONTH", month)
                intent.putExtra("EXTDAY", day)
                intent.putExtra("EXTBIOSKOP", selectedBioskop)
                intent.putExtra("EXTSEAT", selectedSeat)
                intent.putExtra("EXTPAYMENT", selectedPayment)
                intent.putExtra("EXTBANK", selectedBank)

                startActivity(intent)
            }

        }


    }
}