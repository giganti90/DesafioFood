package com.example.testrecyclerview.model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testrecyclerview.R
import com.example.testrecyclerview.adapter.RestauranteAdapter
import com.example.testrecyclerview.dataclass.DCRestaurante

class ActivityRestaurante : AppCompatActivity() {
    private val recycler by lazy { findViewById<RecyclerView>(R.id.recycler_view_restaurantes) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.restaurante_list)

        val menuRestaurantes = getRestaurante()

        val adapter = RestauranteAdapter(menuRestaurantes, this)
        recycler.adapter = adapter

    }

    private fun getRestaurante(): MutableList<DCRestaurante> {
        val listaRestaurante = mutableListOf<DCRestaurante>()
        listaRestaurante.add(
            DCRestaurante("Philés", "Comida da grelha e acompanhamentos",
            "Aberto das 10h-17h", R.drawable.churrascaria)
        )
        listaRestaurante.add(
            DCRestaurante("Mineiro do Julio", "Comida típica de Minas Gerais",
            "11h-16h", R.drawable.bandeiraminas)
        )
        listaRestaurante.add(
            DCRestaurante("Kerr Drinks?", "Cervejas, vinhos, e outras bebidas",
            "12h-23h59", R.drawable.drinksfachada)
        )
        listaRestaurante.add(
            DCRestaurante("Mercado Paristuba", "Mercado e hortifruti",
            "07h-17h", R.drawable.mercado)
        )
        return listaRestaurante.toList() as MutableList<DCRestaurante>
    }



}
