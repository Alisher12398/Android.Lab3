package com.android.app2

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var actors = ArrayList<Actor>()
    private var i2: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var adapter = Adapter(actors)

        recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycler.adapter = adapter


        button1.setOnClickListener {
            actors.add(Actor("Actor $i2", "Stuff"))
            i2=i2.inc()
            recycler.adapter = adapter
        }

        if (savedInstanceState != null) {
            actors = savedInstanceState.getParcelableArrayList<Actor>("actors")
            i2=savedInstanceState.getInt("i2", i2)
            adapter = Adapter(actors)
            recycler.adapter = adapter
        }
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelableArrayList("actors", actors)
        outState?.putInt("i2", i2)
    }
}
