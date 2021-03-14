package com.example.testrecyclerview.adapter.viewholder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testrecyclerview.R
import com.example.testrecyclerview.dataclass.DCPrato

class VHPrato(view: View): RecyclerView.ViewHolder(view) {

    val namePrato by lazy { itemView.findViewById<TextView>(R.id.tv_name_prato) }
    val detalhesPrato by lazy { itemView.findViewById<TextView>(R.id.tv_prato_details) }
    val imgPrato by lazy { itemView.findViewById<ImageView>(R.id.img_prato)}

}
