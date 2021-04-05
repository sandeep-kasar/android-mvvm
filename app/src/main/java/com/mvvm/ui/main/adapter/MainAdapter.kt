package com.mvvm.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.mvvm.R
import com.mvvm.data.model.User
import com.mvvm.databinding.ItemLayoutBinding

class MainAdapter(
    private val users: ArrayList<User>
) : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    inner class MainViewHolder(
        val itemLayoutBinding: ItemLayoutBinding
    ): RecyclerView.ViewHolder(itemLayoutBinding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MainViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_layout,
                parent,
                false
            )
        )

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.itemLayoutBinding.users = users[position]
        holder.itemLayoutBinding.root.setOnClickListener {
            Toast.makeText(holder.itemLayoutBinding.root.context,"Click !!!", Toast.LENGTH_LONG).show()
        }
    }

    fun addUsers(users: List<User>) {
        this.users.apply {
            clear()
            addAll(users)
        }

    }
}