package com.princessleia.wandtrack.utils

import androidx.recyclerview.widget.DiffUtil

class SimpleDiffCallback<T> : DiffUtil.ItemCallback<T>() {

    override fun areItemsTheSame(oldItem: T, newItem: T): Boolean = oldItem == newItem

    override fun areContentsTheSame(oldItem: T, newItem: T): Boolean = oldItem == newItem
}