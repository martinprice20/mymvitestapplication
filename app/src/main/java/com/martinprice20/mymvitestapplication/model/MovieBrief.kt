package com.martinprice20.mymvitestapplication.model

import android.os.Parcelable
import com.google.auto.value.AutoValue
import com.google.gson.annotations.SerializedName

@AutoValue
abstract class MovieBrief() : Parcelable {

    @SerializedName("Title")
    abstract fun getTitle(): String

    @SerializedName("Year")
    abstract fun getYear(): String

    @SerializedName("imdbID")
    abstract fun getId(): String

    @SerializedName("Poster")
    abstract fun getPosterUrl(): String

    open fun builder() : MovieBrief.Builder {
        return AutoValue_MovieBrief.Builder()
    }

    @AutoValue.Builder
    abstract class Builder {
        @SerializedName("Title")
        abstract fun setName(value: String?): Builder

        @SerializedName("imdbID")
        abstract fun setId(id: Long): Builder

        @SerializedName("Year")
        abstract fun setYear(value: String?): Builder

        @SerializedName("Poster")
        abstract fun setPosterUrl(poster: String): Builder

        abstract fun build(): MovieBrief
    }
}
