package com.martinprice20.mymvitestapplication

data class MovieState (
    val loading: Boolean = false,
    val movies: MutableList<MovieMaker.Movie>? = null,
    val movieSelected: MovieMaker.Movie? = null,
    val error: Throwable? = null
)
