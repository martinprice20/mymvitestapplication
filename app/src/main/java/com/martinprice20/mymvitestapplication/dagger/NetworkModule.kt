package com.martinprice20.mymvitestapplication.dagger

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.martinprice20.mymvitestapplication.networking.MovieApiService
import com.martinprice20.mymvitestapplication.repo.MovieRepo
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule() {
    var baseUrl = "http://www.omdbapi.com/?S=gladiator&apikey=d0819c9e"
    var apiKey ="d0819c9e"

    @Singleton
    @Provides
    fun provideGson(): Gson {
        return GsonBuilder().setPrettyPrinting().create()
    }

    @Provides
    @Singleton
    fun provideRetrofit(gson: Gson): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .baseUrl(baseUrl)
            .build()
    }

    @Provides
    @Singleton
    fun ProvideMovieApiService(retrofit: Retrofit): MovieApiService {
        return retrofit.create(MovieApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideMovieRepo(service: MovieApiService): MovieRepo {
        return MovieRepo(service)
    }

}