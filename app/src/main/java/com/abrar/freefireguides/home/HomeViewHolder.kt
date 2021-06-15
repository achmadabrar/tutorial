package com.abrar.freefireguides.home

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.abrar.freefireguides.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class HomeViewHolder (view: View): RecyclerView.ViewHolder(view) {

    val textMenu: TextView
    val imageMenu: ImageView

    init {
        textMenu = view.findViewById(R.id.tv_title_menu)
        imageMenu = view.findViewById(R.id.iv_icon_menu)
    }
    fun bindHero(home: HomeModel, listener: Listener) {
        textMenu.text = home.name
        Glide.with(itemView.context)
            .load(home.icon)
            .apply(RequestOptions().override(100, 100))
            .into(imageMenu)

        itemView.setOnClickListener {
            listener.onClickMenu(home.name)
        }
    }

    interface Listener {
        fun onClickMenu(title: String)
    }
}