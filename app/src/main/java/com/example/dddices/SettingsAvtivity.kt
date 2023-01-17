package com.example.dddices

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dddices.databinding.ActivityAboutAsBinding
import com.example.dddices.databinding.ActivitySettingsAvtivityBinding

class SettingsAvtivity : AppCompatActivity() {
    private lateinit var binding: ActivitySettingsAvtivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsAvtivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpActionBar()
    }

    //отвечает за кнопку возврата в экшн баре
    private fun setUpActionBar() {
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.title = "Settings"
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}