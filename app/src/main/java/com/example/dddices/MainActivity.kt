package com.example.dddices

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem

import com.example.dddices.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.textView.text = rollDice().toString()
        }
    }

    //отвечает за меню с 3 точками в верхнем левом углу
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    //отвечает за функциональность кнопок из 3-х точек
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.exit) {
            Log.d("MyLog", "кнопка EXIT работает")
            finish()
        }
        if (item.itemId == R.id.about_as) {
            val i = Intent(this, AboutAsActivity::class.java)
            startActivity(i)
        }
        if (item.itemId == R.id.settings) {
            val i = Intent(this, SettingsAvtivity::class.java)
            startActivity(i)
        }
        return super.onOptionsItemSelected(item)
    }


    //todo убрать и сделать под каждый dice отдельный
    fun rollDice(): Int {
        return (1..6).random()
    }
}