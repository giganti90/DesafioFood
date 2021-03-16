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
import com.example.testrecyclerview.dataclass.DCPrato
import com.example.testrecyclerview.dataclass.DCRestaurante
import com.example.testrecyclerview.model.PratoActivity


class PratoAdapter (val pratosList: MutableList<DCPrato>, val contextPrato: Context)
    : RecyclerView.Adapter<PratoAdapter.VHPrato>() {

    val activityRestaurante = PratoActivity()

    inner class VHPrato(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val namePrato = itemView.findViewById<TextView>(R.id.tv_name_prato)
        val detalhesPrato =  itemView.findViewById<TextView>(R.id.tv_prato_details)
        val imgPrato = itemView.findViewById<ImageView>(R.id.img_prato)

        fun bindItems(pratos: DCPrato) {
            namePrato.text = pratos.namePrato
            detalhesPrato.text = pratos.detalhesPrato
            imgPrato.setImageResource(pratos.imgPrato)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PratoAdapter.VHPrato {
        val view = LayoutInflater.from(parent.context).inflate((R.layout.prato_list), parent, false)
        return VHPrato(view)
    }

    override fun getItemCount(): Int {
        return pratosList.size
    }


    override fun onBindViewHolder(holder: PratoAdapter.VHPrato, position: Int) {
        holder.bindItems(pratosList[position])

        holder.imgPrato.setOnClickListener {
            val intent = Intent(it.context, DCRestaurante::class.java)
            intent.putExtra("nomeprato", pratosList[position].namePrato)
            intent.putExtra("descrição", pratosList[position].detalhesPrato)
            intent.putExtra("imagem", pratosList[position].imgPrato)
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

