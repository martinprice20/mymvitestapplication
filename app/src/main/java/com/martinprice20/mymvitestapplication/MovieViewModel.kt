package com.martinprice20.mymvitestapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MovieViewModel {

    private var _state = MutableLiveData<MovieState>().apply { value = MovieState() }
    val state: LiveData<MovieState>
        get() = _state

    private val movieMaker: MovieMaker = MovieMaker()

    init {
        internalAction(Intent.SetMovieList(movieMaker.getMovies() as MutableList<MovieMaker.Movie>))
    }


    private fun onReduceState(intent: Intent): MovieState =
            when (intent) {
                is Intent.SetMovieList -> state.value!!.copy(movies = intent.movies, loading = false)
                is Intent.SelectMovie -> state.value!!.copy(movieSelected = intent.movie)
            }

    sealed class Intent  {
        data class SetMovieList(val movies: MutableList<MovieMaker.Movie>) : Intent()
        data class SelectMovie(val movie: MovieMaker.Movie) : Intent()
    }

    private fun internalAction(intent: Intent) {
        _state.value = onReduceState(intent)

    }
}