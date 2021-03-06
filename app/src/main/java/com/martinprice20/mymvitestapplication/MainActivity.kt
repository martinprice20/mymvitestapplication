package com.martinprice20.mymvitestapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), MovieAdapter.ItemListener {

    val movieViewModel = MovieViewModel()
    private lateinit var recyclerView: RecyclerView
    private lateinit var movieList: MutableList<MovieMaker.Movie>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        movieViewModel.state.observe(this, ::updateView)
        recyclerView = findViewById<RecyclerView>(R.id.movie_list_recycler)
        movieList = mutableListOf<MovieMaker.Movie>()
        val adapter = MovieAdapter(movieList, this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    private fun updateView(movieState: MovieState?) {
        movieList = movieState?.movies!!

        for (movie in movieState?.movies!!) {
            println(movie.name)
        }

    }

    override fun onItemClick(movie: MovieMaker.Movie) {
        //do something like show movie in a new fragment!
        println("Movie: " + movie.name + ", Director: " + movie.director + ", Released: " + movie.year)
    }
}