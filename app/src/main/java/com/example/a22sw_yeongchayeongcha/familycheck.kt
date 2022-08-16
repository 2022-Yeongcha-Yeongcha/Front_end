package com.example.a22sw_yeongchayeongcha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.a22sw_yeongchayeongcha.databinding.ActivityFamilycheckBinding


class Familycheck: AppCompatActivity() {
    lateinit var binding: ActivityFamilycheckBinding
    lateinit var intent1: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFamilycheckBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.familyback.setOnClickListener{
            val intent=Intent(this,Family3::class.java)
        }

        binding.familysos.setOnClickListener{
            val intent=Intent(this,Sos::class.java)
        }


    }
}