package com.example.testrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testrecyclerview.adapter.PratoAdapter
import com.example.testrecyclerview.adapter.RestauranteAdapter
import com.example.testrecyclerview.dataclass.DCPrato
import com.example.testrecyclerview.dataclass.DCRestaurante

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.restaurante_list)

    }

}

