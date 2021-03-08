package com.martinprice20.mymvitestapplication.model

import com.google.auto.value.AutoValue
import com.google.gson.annotations.SerializedName

@AutoValue
abstract class MovieDetailed {

    @SerializedName("Title")
    abstract fun getTitle():String

    @SerializedName("Year")
    abstract fun getYear():String

    @SerializedName("Rated")
    abstract fun getRating():String

    @SerializedName("Released")
    abstract fun getReleased():String

    @SerializedName("Runtime")
    abstract fun getRuntime():String

    @SerializedName("Genre")
    abstract fun getGenre():String

    @SerializedName("Director")
    abstract fun getDirector():String

    @SerializedName("Writer")
    abstract fun getWriter():String

    @SerializedName("Actors")
    abstract fun getActors():String

    @SerializedName("Plot")
    abstract fun getPlot():String

    @SerializedName("Language")
    abstract fun getLanguage():String

    @SerializedName("Country")
    abstract fun getCountry():String

    @SerializedName("Awards")
    abstract fun getAwards():String

    @SerializedName("Poster")
    abstract fun getPoster():String

    @SerializedName("Ratings")
    abstract fun getRatings():List<Rating>

    @SerializedName("Metascore")
    abstract fun getMetascore():String

    @SerializedName("imdbRating")
    abstract fun getImbdbRating():String

    @SerializedName("imdbVbotes")
    abstract fun getImdbVotes():String

    @SerializedName("imdbID")
    abstract fun getImdbID():String

    @SerializedName("Type")
    abstract fun getType():String

    @SerializedName("DVD")

    abstract fun getDVD():String
    @SerializedName("BoxOffice")

    abstract fun getBoxOffice():String

    @SerializedName("Production")
    abstract fun getProduction():String

    @SerializedName("Website")
    abstract fun getWebsite():String

    @SerializedName("Response")
    abstract fun getResponse():String


    open fun builder(): MovieDetailed.Builder {
        return AutoValue_MovieDetailed.Builder()
    }

    @AutoValue.Builder
    abstract class Builder {

        @SerializedName("Title")
        abstract fun setTitle(title: String): Builder

        @SerializedName("Year")
        abstract fun setYear(year: String): Builder

        @SerializedName("Rated")
        abstract fun setRating(rating: String): Builder

        @SerializedName("Released")
        abstract fun setReleased(released: String): Builder

        @SerializedName("Runtime")
        abstract fun setRuntime(runtime: String): Builder

        @SerializedName("Genre")
        abstract fun setGenre(genre: String): Builder

        @SerializedName("Director")
        abstract fun setDirector(director: String): Builder

        @SerializedName("Writer")
        abstract fun setWriter(writer: String): Builder

        @SerializedName("Actors")
        abstract fun setActors(actors: String): Builder

        @SerializedName("Plot")
        abstract fun setPlot(plot: String): Builder

        @SerializedName("Language")
        abstract fun setLanguage(lang: String): Builder

        @SerializedName("Country")
        abstract fun setCountry(country: String): Builder

        @SerializedName("Awards")
        abstract fun setAwards(awards: String): Builder

        @SerializedName("Poster")
        abstract fun setPoster(poster: String): Builder

        @SerializedName("Ratings")
        abstract fun setRatings(ratings: List<Rating>): Builder

        @SerializedName("Metascore")
        abstract fun setMetascore(metascore: String):Builder

        @SerializedName("imdbRating")
        abstract fun setImbdbRating(rating: String):Builder

        @SerializedName("imdbVotes")
        abstract fun setImdbVotes(votes: String): Builder

        @SerializedName("imdbID")
        abstract fun setImdbID(id: String): Builder

        @SerializedName("Type")
        abstract fun setType(type: String): Builder

        @SerializedName("DVD")
        abstract fun setDVD(dvd: String): Builder

        @SerializedName("BoxOffice")
        abstract fun setBoxOffice(box: String): Builder

        @SerializedName("Production")
        abstract fun setProduction(production: String): Builder

        @SerializedName("Website")
        abstract fun setWebsite(website: String): Builder

        @SerializedName("Response")
        abstract fun setResponse(response: String): Builder

        abstract fun build() : MovieDetailed
    }
}