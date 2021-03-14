package com.example.testrecyclerview.adapter.viewholder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testrecyclerview.R
import com.example.testrecyclerview.dataclass.DCRestaurante

class VHRestaurante(view: View) : RecyclerView.ViewHolder(view) {

    val nameRestaurante by lazy { itemView.findViewById<TextView>(R.id.tv_name_restaurant) }
    val detalhesRestaurante by lazy { itemView.findViewById<TextView>(R.id.tv_prato_details) }
    val horarioRestaurante by lazy { itemView.findViewById<TextView>(R.id.tv_hour_restaurant) }
    val imgRestaurant by lazy { itemView.findViewById<ImageView>(R.id.img_restaurant) }


}
