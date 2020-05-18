package com.example.trialproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView
import java.util.*


// The adapter class which
// extends RecyclerView Adapter
class Adapter(var context: Context, data: ArrayList<Model>) : RecyclerView.Adapter<Adapter.MyViewHolder>() {
    var data: List<Model> = data
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.item, parent,
                false)
        // return itemView
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val all = data[position]
        holder.name.text = all.name
        holder.avatar.setImageResource(all.avatar)
        holder.status.setImageResource(all.status)
        holder.send.setImageResource(all.send)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class MyViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var mCardView: MaterialCardView = v.findViewById(R.id.cardview)
        var name: AppCompatTextView = v.findViewById(R.id.Name)
        var avatar: AppCompatImageView = v.findViewById(R.id.avatar)
        var status: AppCompatImageView = v.findViewById(R.id.status)
        var send: AppCompatImageView = v.findViewById(R.id.sendRequest)

    }

}

