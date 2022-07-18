package com.ozansoykan.handmapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ozansoykan.handmapp.databinding.CardTasarimBinding
import com.ozansoykan.handmapp.entity.Product

class ProductAdapter(var mContext: Context,var urunlerListesi:List<Product>)
    :RecyclerView.Adapter<ProductAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(tasarim: CardTasarimBinding):RecyclerView.ViewHolder(tasarim.root){
        var tasarim : CardTasarimBinding
        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = CardTasarimBinding.inflate(layoutInflater,parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val urunler = urunlerListesi.get(position)
        val t = holder.tasarim
        t.imageViewResim.setImageResource(urunler.urun_resim)
    }

    override fun getItemCount(): Int {
        return urunlerListesi.size
    }
}