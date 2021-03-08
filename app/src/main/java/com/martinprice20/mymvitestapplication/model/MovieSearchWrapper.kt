package com.martinprice20.mymvitestapplication.model

import android.os.Parcelable
import com.google.auto.value.AutoValue
import com.google.gson.annotations.SerializedName

@AutoValue
abstract class MovieSearchWrapper: Parcelable {

    @SerializedName("Search")
    abstract fun getMovies() : List<MovieBrief>

    @SerializedName("totalResults")
    abstract fun getTotalResults() : String

    @SerializedName("Response")
    abstract fun getResponse() : String

    open fun builder() : MovieSearchWrapper.Builder {
        return AutoValue_MovieSearchWrapper.Builder()
    }

    @AutoValue.Builder
    abstract class Builder {
        @SerializedName("Search")
        abstract fun setName(movieList: List<MovieBrief>): Builder

        @SerializedName("totalResults")
        abstract fun setId(totalResults: String): Builder

        @SerializedName("Response")
        abstract fun setYear(response: String): Builder

        abstract fun build(): MovieSearchWrapper
    }
}