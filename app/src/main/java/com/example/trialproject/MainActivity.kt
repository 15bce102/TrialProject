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
        recyclerView = findViewById(R.id.optionsRV)
        recyclerView!!.setHasFixedSize(true)
        val data = ArrayList<Model>()
        data.add(Model(R.drawable.demo2, "Rohit", "Newbie", "+50"))
        data.add(Model(R.drawable.demo2, "Rohit", "Newbie", "+50"))
        data.add(Model(R.drawable.demo2, "Rohit", "Newbie", "+50"))
        data.add(Model(R.drawable.demo2, "Rohit", "Newbie", "+50"))

        adapter = Adapter(applicationContext, data)
        recyclerView!!.adapter = adapter
        adapter!!.notifyDataSetChanged()
        val llm = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
        recyclerView!!.layoutManager = llm
    }
}





