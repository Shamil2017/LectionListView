package com.example.lectionlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private val colors = arrayOf("Красны", "Оранжевый", "Желтый", "Зелёный", "Голубой", "Синий", "Фиолетовый",
        "Красны", "Оранжевый", "Желтый", "Зелёный", "Голубой", "Синий", "Фиолетовый"
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Связываемся с ListView
        val list = findViewById<ListView>(R.id.lvMain)

        // создаем адаптер
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, colors)

        // устанавливаем адаптер списку
        list.adapter = adapter
    }
}