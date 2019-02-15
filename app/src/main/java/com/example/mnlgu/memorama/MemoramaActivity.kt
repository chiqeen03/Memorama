package com.example.mnlgu.memorama

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_memorama.*

class MemoramaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memorama)

        var rv = recyclerView1
        rv.setHasFixedSize(true)
        var grid = GridLayoutManager(this, 4)
        rv.layoutManager = grid

        val chips = ArrayList<Chip>()
        for(i in 0..12)
            chips.add(Chip(R.mipmap.ic_launcher))

        var adapter = MemoramaAdapter(chips)
        rv.adapter = adapter
    }
}
