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
    var data: List<Model>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item, parent,
                false)
        // return itemView
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val all = data[position]
        holder.profileImage.setImageResource(all.profileImage)
        holder.name.text = all.name
        holder.level.text = all.level
        holder.score.text = all.score
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class MyViewHolder(v: View) : RecyclerView.ViewHolder(v) {

        var profileImage: AppCompatImageView = v.findViewById(R.id.img_profile)
        var name: AppCompatTextView = v.findViewById(R.id.txt_profile_name)
        var level: AppCompatTextView = v.findViewById(R.id.txt_profile_level)
        var score: AppCompatTextView = v.findViewById(R.id.txt_profile_score)

    }

    init {
        this.data = data
    }
}

