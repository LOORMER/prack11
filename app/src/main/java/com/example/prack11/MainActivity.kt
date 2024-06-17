package com.example.prack11

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val text: TextView = findViewById(R.id.Text)
        val layot: ConstraintLayout = findViewById(R.id.main)
        when (item.itemId) {
            R.id.action1 ->{
                // layot.setBackgroundColor(R.color.blue)
                Toast.makeText(this ,"Вы выбрали синий цвет", Toast.LENGTH_SHORT).show();
                return true
            }
            R.id.action2 ->{
                //layot.setBackgroundColor(R.color.red)
                Toast.makeText(this ,"Вы выбрали красный цвет", Toast.LENGTH_SHORT).show();
                return true
            }
            R.id.action3 ->{
                // layot.setBackgroundColor(R.color.purple)
                Toast.makeText(this ,"Вы выбрали фиолетовый цвет", Toast.LENGTH_SHORT).show();
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}