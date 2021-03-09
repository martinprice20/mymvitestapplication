package com.martinprice20.mymvitestapplication.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MovieSearch (
    val movieTitle: String? = null,
    val type: String? = null,
    val year: String? = null,
    val datatype: String? = null,
    val page: Int? = null,
    val callback: String? = null,
    val version: String? = null
) : Parcelable
