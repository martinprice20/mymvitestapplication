package com.martinprice20.mymvitestapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import java.util.Collections.copy

class MovieViewModel {

    private var _state = MutableLiveData<com.martinprice20.mymvitestapplication.MovieState>().apply { value = com.martinprice20.mymvitestapplication.MovieState() }
    val state: LiveData<com.martinprice20.mymvitestapplication.MovieState>
        get() = _state

    lateinit var movieList: MutableList<MovieMaker.Movie>
    val movieMaker: MovieMaker = MovieMaker()

    init {
        internalAction(Intent.setMovieList(movieMaker.getMovies() as MutableList<MovieMaker.Movie>))
    }


    fun onReduceState(intent: Intent): com.martinprice20.mymvitestapplication.MovieState =
            when (intent) {
                is Intent.setMovieList -> state.value!!.copy(movies = intent.movies, loading = false)
                is Intent.selectMovie -> state.value!!.copy(movieSelected = intent.movie)
            }

    sealed class Intent  {
        data class setMovieList(val movies: MutableList<MovieMaker.Movie>) : Intent()
        data class selectMovie(val movie: MovieMaker.Movie) : Intent()
    }

    data class MovieState (
            val loading: Boolean = true,
            val movies: List<MovieMaker.Movie>? = null,
            val movieSelected: MovieMaker.Movie? = null,
            val error: Throwable? = null
    )

    fun internalAction(intent: Intent) {
        _state.value = onReduceState(intent)

    }
}