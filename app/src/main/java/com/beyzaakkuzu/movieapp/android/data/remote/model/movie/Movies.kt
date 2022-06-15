package com.beyzaakkuzu.movieapp.android.data.remote.model.movie

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movies(
    @SerializedName("page")
    val page:Int?,
    @SerializedName("results")
    val results:MutableList<Movie>?,
    @SerializedName("total_results")
    var total_results:Int?,
    @SerializedName("total_pages")
    val total_pages:Int?
):Parcelable