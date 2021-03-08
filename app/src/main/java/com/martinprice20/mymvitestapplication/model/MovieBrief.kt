package com.martinprice20.mymvitestapplication.model

import android.os.Parcelable
import com.google.auto.value.AutoValue
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class MovieBrief(
    @SerializedName("Title")
    val title: String,

    @SerializedName("Year")
    val year: String,

    @SerializedName("imdbID")
    val id: String,

    @SerializedName("Poster")
    val posterUrl: String
) : Parcelable {}

