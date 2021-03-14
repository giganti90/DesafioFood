package com.example.testrecyclerview.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.testrecyclerview.R
import com.example.testrecyclerview.adapter.viewholder.VHRestaurante
import com.example.testrecyclerview.dataclass.DCRestaurante
import com.example.testrecyclerview.model.Restaurante

class RestauranteAdapter (private val restaurantesList: MutableList<DCRestaurante>)
    : RecyclerView.Adapter<VHRestaurante>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHRestaurante {
        val view = LayoutInflater.from(parent.context).inflate((R.layout.restaurante_list), parent, false)
        return VHRestaurante(view)
    }

    override fun getItemCount(): Int {
        return restaurantesList.size
    }


    override fun onBindViewHolder(holder: VHRestaurante, position: Int) {
        val nome = holder.nameRestaurante
        nome.text = restaurantesList[position].nameRestaurante

        val endereco = holder.detalhesRestaurante
        endereco.text = restaurantesList[position].detalhesRestaurante

        val horario = holder.horarioRestaurante
        horario.text = restaurantesList[position].horarioRestaurante

        val imagem = holder.imgRestaurant
        imagem.setImageResource(restaurantesList[position].imgRestaurant)

        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, Restaurante::class.java)
            it.context.startActivity(intent)
        }
    }
}

//    override fun onBindViewHolder(holder: ViewHolderRestaurante, position: Int) {
//        holder.makeRestaurante(restaurantesList[position])
//    }
//
//    inner class ViewHolderRestaurante(view: View) : RecyclerView.ViewHolder(view) {
//        val nameRestaurante by lazy { itemView.findViewById<TextView>(R.id.tv_name_restaurant) }
//        val detalhesRestaurante by lazy { itemView.findViewById<TextView>(R.id.tv_prato_details) }
//        val horarioRestaurante by lazy { itemView.findViewById<TextView>(R.id.tv_hour_restaurant) }
//        val imgRestaurant by lazy { itemView.findViewById<TextView>(R.id.img_restaurant) }
//
//            fun makeRestaurante(dcRestaurante: DCRestaurante) {
//                nameRestaurante.text = dcRestaurante.nameRestaurante
//                detalhesRestaurante.text = dcRestaurante.detalhesRestaurante
//                horarioRestaurante.text = dcRestaurante.horarioRestaurante
//
//                //imgRestaurant.text = dcRestaurant.imgPrato
//            }
//        }


