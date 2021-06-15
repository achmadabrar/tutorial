package com.abrar.freefireguides.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abrar.freefireguides.R

class HomeAdapter(private val menus: List<HomeModel>, val listener: HomeViewHolder.Listener): RecyclerView.Adapter<HomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        return HomeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false))
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.bindHero(menus[position], listener)
    }

    override fun getItemCount(): Int = menus.size
}