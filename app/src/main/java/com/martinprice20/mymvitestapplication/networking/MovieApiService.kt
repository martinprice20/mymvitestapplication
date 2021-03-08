package com.martinprice20.mymvitestapplication.networking

import com.martinprice20.mymvitestapplication.MovieMaker
import com.martinprice20.mymvitestapplication.model.MovieSearchWrapper
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApiService {

    @GET
    fun getMovieByTitle(@Query("t") title: String) : Single<MovieMaker.Movie>

    @GET
    fun getMovieById(@Query("i") id: String) : Single<MovieMaker.Movie>

    


}