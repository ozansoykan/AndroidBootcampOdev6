package com.ozansoykan.handmapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.ozansoykan.handmapp.adapter.ProductAdapter
import com.ozansoykan.handmapp.databinding.FragmentHomeBinding
import com.ozansoykan.handmapp.entity.Product

class HomeFragment : Fragment() {

    private lateinit var tasarim : FragmentHomeBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentHomeBinding.inflate(inflater, container, false)
        tasarim.rv.layoutManager = LinearLayoutManager(requireContext())
        val urunlerListesi = ArrayList<Product>()
        val u1 = Product(1,R.drawable.images)
        val u2 = Product(1,R.drawable.images1)
        val u3 = Product(1,R.drawable.images2)
        val u4 = Product(1,R.drawable.images3)
        urunlerListesi.add(u1)
        urunlerListesi.add(u2)
        urunlerListesi.add(u3)
        urunlerListesi.add(u4)

        val adapter = ProductAdapter(requireContext(),urunlerListesi)
        tasarim.rv.adapter = adapter

        return tasarim.root
    }


}