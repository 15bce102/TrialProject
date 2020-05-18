package com.example.trialproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*


class MainActivity : AppCompatActivity() {
    var recyclerView: RecyclerView? = null
    var adapter: RecyclerView.Adapter<*>? = null
    private val data: List<Model>? = null
    var mb: AppCompatButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mb = findViewById(R.id.start)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView!!.setHasFixedSize(true)
        val data = ArrayList<Model>()
        data.add(Model("Ramandeep", R.color.busy, R.drawable.demo2, R.drawable.plus))
        data.add(Model("Ramandeep", R.color.online, R.drawable.demo2, R.drawable.plus))
        data.add(Model("Ramandeep", R.color.offline, R.drawable.demo2, R.drawable.plus))
        data.add(Model("Ramandeep", R.color.online, R.drawable.demo2, R.drawable.plus))
        data.add(Model("Ramandeep", R.color.online, R.drawable.demo2, R.drawable.plus))
        adapter = Adapter(applicationContext, data)
        recyclerView!!.adapter = adapter
        adapter!!.notifyDataSetChanged()
        val llm = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
        recyclerView!!.layoutManager = llm
    }
}

