package com.example.testrecyclerview.adapter
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testrecyclerview.R
import com.example.testrecyclerview.adapter.viewholder.VHPrato
import com.example.testrecyclerview.dataclass.DCPrato
import com.example.testrecyclerview.model.Prato
import com.example.testrecyclerview.model.Restaurante


class PratoAdapter (private val pratosList: MutableList<DCPrato>)
    : RecyclerView.Adapter<VHPrato>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHPrato {
        val view = LayoutInflater.from(parent.context).inflate((R.layout.prato_list), parent, false)
        return VHPrato(view)
    }

    override fun getItemCount(): Int {
        return pratosList.size
    }

    override fun onBindViewHolder(holder: VHPrato, position: Int) {
        val nome = holder.namePrato
        nome.text = pratosList[position].namePrato

        val detalhes = holder.detalhesPrato
        detalhes.text = pratosList[position].detalhesPrato

        val image = holder.imgPrato
        val singleImage = pratosList[position].imgPrato
        image.setImageResource(pratosList[position].imgPrato)

        holder.itemView.setOnClickListener {
                val intent = Intent(it.context, Prato::class.java)
                it.context.startActivity(intent)
            }

        }

    }

//inner class ViewHolderPrato(view: View): RecyclerView.ViewHolder(view) {
//    val namePrato by lazy { itemView.findViewById<TextView>(R.id.tv_name_prato) }
//    val detalhesPrato by lazy { itemView.findViewById<TextView>(R.id.tv_prato_details) }
//
//    fun makePrato(dcPrato: DCPrato) {
//        namePrato.text = dcPrato.namePrato
//        detalhesPrato.text = dcPrato.detalhesPrato
//
//        //imgPrato.text = dcPrato.imgPrato
//    }

