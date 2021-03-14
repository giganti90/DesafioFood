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

    val recycler by lazy {findViewById<RecyclerView>(R.id.recycler_view_restaurantes)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.restaurante_list)

        val restaurantes = getRestaurante()
        val adapterRestaurante = RestauranteAdapter(restaurantes)

        val pratos = getPratos()
        val adapterPratos = PratoAdapter(pratos)

        recycler.layoutManager = LinearLayoutManager(this)
    }

    private fun getRestaurante(): MutableList<DCRestaurante> {
        val listaRestaurante = mutableListOf<DCRestaurante>()
        listaRestaurante.add(DCRestaurante("Philés", "Comida da grelha e acompanhamentos",
                "Aberto das 10h-17h", R.drawable.churrascaria))
        listaRestaurante.add(DCRestaurante("Mineiro do Julio", "Comida típica de Minas Gerais",
                "11h-16h", R.drawable.bandeiraminas))
        listaRestaurante.add(DCRestaurante("Kerr Drinks?", "Cervejas, vinhos, e outras bebidas",
                "12h-23h59", R.drawable.drinksfachada))
        listaRestaurante.add(DCRestaurante("Mercado Paristuba", "Mercado e hortifruti",
                "07h-17h", R.drawable.mercado))
        return listaRestaurante.toList() as MutableList<DCRestaurante>
    }

    private fun getPratos(): MutableList<DCPrato> {
        val listaPrato = mutableListOf<DCPrato>()
        listaPrato.add(DCPrato("Kit Churrasco","Picanha, maminha, alcatra, linguiça e asinha de frango", R.drawable.kitchurras))
        listaPrato.add(DCPrato("Mexida","Arroz, ovo, feijão, banana à milanesa, torresmo, basicamente tudo possível", R.drawable.mexidamineira))
        listaPrato.add(DCPrato("Bloody Mary","Tabasco, suco de tomate, vodka e seilaoquemais", R.drawable.bloodymary))
        listaPrato.add(DCPrato("Farofa","Farofa Yoki 500g", R.drawable.farofffa))
        return listaPrato.toList() as MutableList<DCPrato>
    }



}

