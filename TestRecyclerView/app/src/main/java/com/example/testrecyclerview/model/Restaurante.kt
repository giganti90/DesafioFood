package com.example.testrecyclerview.model

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.testrecyclerview.R

class Restaurante : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.restaurante_detalhe)

        val layout by lazy { findViewById<RecyclerView>(R.id.recycler_view_restaurantes) }

    }
}
