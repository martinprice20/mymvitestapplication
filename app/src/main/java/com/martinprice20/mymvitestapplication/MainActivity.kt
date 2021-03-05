package com.martinprice20.mymvitestapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), MovieAdapter.ItemListener {

    val movieViewModel = MovieViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onItemClick(movie: MovieMaker.Movie) {
        //do something like show movie in a new fragment!
        println("Movie: " + movie.name + ", Director: " + movie.director + ", Released: " + movie.year)
    }
}