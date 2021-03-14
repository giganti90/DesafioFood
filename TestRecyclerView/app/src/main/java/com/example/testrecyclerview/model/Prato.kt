package com.example.testrecyclerview.model

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.testrecyclerview.R

class Prato : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.prato_detalhe)

        val layout by lazy { findViewById<RecyclerView>(R.id.recyclerView_pratos) }

    }
}
