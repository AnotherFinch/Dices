package com.example.dddices

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dddices.databinding.ActivityAboutAsBinding
import com.example.dddices.databinding.ActivityMainBinding

class AboutAsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutAsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutAsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpActionBar()
    }

    //отвечает за кнопку возврата в экшн баре
    private fun setUpActionBar() {
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.title = "About us"
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}