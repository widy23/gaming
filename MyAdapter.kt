package com.example.gamingcard

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val dataSet: Array<Int>) :RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder(view:View) :RecyclerView.ViewHolder(view){
        val textView: TextView
        private val card :CardView

        init {
            // Define click listener for the ViewHolder's View
            textView = view.findViewById(R.id.text)
            card = view.findViewById(R.id.card)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.text_row_item, parent, false)

        val color = Color.rgb(
            (Math.random() * 200).toInt() + 55,
            (Math.random() * 200).toInt() + 55,
            (Math.random() * 200).toInt() + 55)
        view.findViewById<CardView>(R.id.card).setBackgroundColor(color)
        return MyViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = dataSet[position].toString()

    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}