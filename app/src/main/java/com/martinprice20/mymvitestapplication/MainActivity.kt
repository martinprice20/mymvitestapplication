package com.martinprice20.mymvitestapplication

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), MovieAdapter.ItemListener {

    private val movieViewModel = MovieViewModel()
    private lateinit var recyclerView: RecyclerView
    private lateinit var movieList: MutableList<MovieMaker.Movie>
    private val movieAdapter = MovieAdapter(this)
    private lateinit var progress: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        progress = findViewById(R.id.progress_bar)
//        recyclerView = findViewById(R.id.movie_list_recycler)
//        movieList = mutableListOf()
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.adapter = movieAdapter
//        movieViewModel.state.observe(this, ::updateView)
    }

    private fun updateView(movieState: MovieState?) {
        movieList = movieState?.movies!!
        movieAdapter.data = movieList
        this.showProgress(movieState.loading)
    }

    override fun onItemClick(movie: MovieMaker.Movie) {
        //do something like show movie in a new fragment!
        println("Movie: " + movie.name + ", Director: " + movie.director + ", Released: " + movie.year)
    }

    private fun showProgress(show: Boolean) {
        if (show) {
            progress.visibility = View.VISIBLE
        } else {
            progress.visibility = View.GONE
        }
    }
}