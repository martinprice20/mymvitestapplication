package com.martinprice20.mymvitestapplication.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class MovieSearchWrapper (

    @SerializedName("Search")
    val listOfMovieBrief: List<MovieBrief>,

    @SerializedName("totalResults")
    val numTotalResults: String,

    @SerializedName("Response")
    val response : String) : Parcelable