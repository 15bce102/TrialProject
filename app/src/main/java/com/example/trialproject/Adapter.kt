package com.example.trialproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.viewpager.widget.PagerAdapter
import com.google.android.material.button.MaterialButton

class Adapter(private val models: List<Model>, private val context: Context) : PagerAdapter() {
    private var layoutInflater: LayoutInflater? = null
    override fun getCount(): Int {
        return models.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = LayoutInflater.from(context)
        val view =  layoutInflater!!.inflate(R.layout.item, container, false)
        val imageView: AppCompatImageView
        val title: AppCompatTextView
        val desc: AppCompatTextView
        val amount: MaterialButton
        imageView = view.findViewById(R.id.image)
        title = view.findViewById(R.id.title)
        desc = view.findViewById(R.id.desc)
        amount = view.findViewById(R.id.button)
        imageView.setImageResource(models[position].image)
        title.text = models[position].title
        desc.text = models[position].desc
        amount.text = models[position].coins
        container.addView(view, 0)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

}