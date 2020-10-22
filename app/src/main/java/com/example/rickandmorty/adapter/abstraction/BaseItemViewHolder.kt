package com.example.rickandmorty.adapter.abstraction

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseItemViewHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView) {

    abstract fun bind(data: T)

    fun getContext(): Context = itemView.context

    open fun onAttach() {}

    open fun onDetach() {}
}