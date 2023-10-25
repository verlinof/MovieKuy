package com.example.moviekuy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moviekuy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnLogin.setOnClickListener(){
                val intent = Intent(this@MainActivity, LayoutActivity::class.java)
                var username = "Username"

                if(etUsername.text.isNotEmpty()){
                    username = etUsername.text.toString()
                }
                intent.putExtra("EXTUSERNAME", username)

                startActivity(intent)
            }

        }
    }
}