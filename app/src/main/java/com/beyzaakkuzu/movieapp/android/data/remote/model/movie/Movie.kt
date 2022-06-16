package com.beyzaakkuzu.movieapp.android.data.remote.model.movie

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    @SerializedName("poster_path")
    val posterPath: String?,
    @SerializedName("adult")
    var adult: Boolean?=false,
    @SerializedName("overview")
    var overview: String?,
    @SerializedName("release_date")
    var release_date: String?="",
    @SerializedName("genre_ids")
    var genre_ids: List<Int>?=ArrayList(),
    var id: Int,
    @SerializedName("original_title")
    var original_title: String?,
    @SerializedName("original_language")
    var original_language: String?,
    @SerializedName("title")
    var title: String?,
    @SerializedName("backdrop_path")
    var backdrop_path: String?,
    @SerializedName("popularity")
    var popularity: Float?=0.0f,
    @SerializedName("vote_count")
    var vote_count: Int?=null,
    @SerializedName("video")
    var video: Boolean?=false,
    @SerializedName("vote_average")
    var vote_average: Double?
): Parcelable
