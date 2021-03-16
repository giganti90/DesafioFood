package com.example.testrecyclerview.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testrecyclerview.R
import com.example.testrecyclerview.dataclass.DCRestaurante
import com.example.testrecyclerview.model.ActivityRestaurante

class RestauranteAdapter (val restauranteList: MutableList<DCRestaurante>, val context: Context)
    : RecyclerView.Adapter<RestauranteAdapter.VHRestaurante>() {

    val activityRestaurante = ActivityRestaurante()

    inner class VHRestaurante(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val nameRestaurante = itemView.findViewById<TextView>(R.id.tv_name_restaurant)
        val detalhesRestaurante =  itemView.findViewById<TextView>(R.id.tv_address_restaurant)
        val horarioRestaurante = itemView.findViewById<TextView>(R.id.tv_hour_restaurant)
        val imgRestaurant = itemView.findViewById<ImageView>(R.id.img_restaurant)

        fun bindItems(restaurants: DCRestaurante) {
            nameRestaurante.text = restaurants.nameRestaurante
            detalhesRestaurante.text = restaurants.detalhesRestaurante
            horarioRestaurante.text = restaurants.horarioRestaurante
            imgRestaurant.setImageResource(restaurants.imgRestaurant)
        }
    }


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHRestaurante {
            val view = LayoutInflater.from(parent.context).inflate((R.layout.restaurante_list), parent, false)
            return VHRestaurante(view)
        }

        override fun getItemCount(): Int {
            return restauranteList.size
        }


        override fun onBindViewHolder(holder: VHRestaurante, position: Int) {
            holder.bindItems(restauranteList[position])

            holder.imgRestaurant.setOnClickListener {
                val intent = Intent(it.context, DCRestaurante::class.java)
                intent.putExtra("nomerestaurante", restauranteList[position].nameRestaurante)
                intent.putExtra("descrição", restauranteList[position].detalhesRestaurante)
                intent.putExtra("horario", restauranteList[position].horarioRestaurante)
                intent.putExtra("imagem", restauranteList[position].imgRestaurant)
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


