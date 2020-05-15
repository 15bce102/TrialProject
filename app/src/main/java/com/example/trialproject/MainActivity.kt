package com.example.trialproject

import android.animation.ArgbEvaluator
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import java.util.*

class MainActivity : AppCompatActivity() {
    var viewPager: ViewPager? = null
    var adapter: Adapter? = null
    var models: MutableList<Model>? = null
    var colors: Array<Int>? = null
    var argbEvaluator = ArgbEvaluator()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        models = ArrayList()
        models!!.add(Model(R.drawable.b, " 1 vs 1", "Play with random players online and get a chance to win more.", "50 Coins"))
        models!!.add(Model(R.drawable.multi, "Multiplayer", "Challenge Your Friends and beat 'em all", "20 coins"))
        models!!.add(Model(R.drawable.test, "How to play?", "Test the interface by giving answers to some fixed questions", "FREE"))
        adapter = Adapter(models as ArrayList<Model>, this)
        viewPager = findViewById(R.id.viewPager)
        viewPager!!.adapter = adapter
        viewPager!!.setPadding(130, 0, 130, 0)
        viewPager!!.offscreenPageLimit = 3
        val colors_temp = arrayOf(
                resources.getColor(R.color.page1),
                resources.getColor(R.color.page2),
                resources.getColor(R.color.page3))
        colors = colors_temp
        viewPager!!.setOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
                if (position < adapter!!.count - 1 && position < colors!!.size - 1) {
                    viewPager!!.setBackgroundColor(
                            (argbEvaluator.evaluate(
                                    positionOffset,
                                    colors!![position],
                                    colors!![position + 1]
                            ) as Int)
                    )
                } else {
                    viewPager!!.setBackgroundColor(colors!![colors!!.size - 1])
                }
            }

            override fun onPageSelected(position: Int) {
            }
            override fun onPageScrollStateChanged(state: Int) {}
        })


    }
}