package com.example.gamingcard

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper

class MainActivity : AppCompatActivity() {
    var isLoading = false
    private val dataset = arrayOf(1, 2, 3,4,5,6,7)
    var layoutManager: LoopingLayoutManager? = null
    var position = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val recyclerView: RecyclerView = findViewById(R.id.recycler)
        layoutManager = LoopingLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = layoutManager

        setList(recyclerView)
      //  initScrollListener(recyclerView)
      //  position = Int.MAX_VALUE / 2
       // recyclerView.scrollToPosition(position)
    }

//    private fun initScrollListener(recyclerView: RecyclerView) {
//        val snapHelper: SnapHelper = LinearSnapHelper()
//        snapHelper.attachToRecyclerView(recyclerView)
//        recyclerView.smoothScrollBy(1, 0)
//
//        recyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
//            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
//                super.onScrollStateChanged(recyclerView, newState)
//                if (newState == 1) {
//                  //  stopAutoScrollBanner()
//                } else if (newState == 0) {
//                    position = layoutManager!!.findFirstCompletelyVisibleItemPosition()
//                  //  runAutoScrollBanner()
//                }
//            }
//        })
//    }

    private fun loadMore() {

    }

    private fun setList(recyclerView: RecyclerView) {

        val customAdapter = MyAdapter(dataset)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager =layoutManager
        recyclerView.adapter = customAdapter

    }



}