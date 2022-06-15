package com.beyzaakkuzu.movieapp.android.data.remote.model.movie

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Images(
    @SerializedName("base_url")
    var base_url: String? ,
    @SerializedName("secure_base_url")
    var secure_base_url: String?,
    @SerializedName("backdrop_sizes")
    var backdrop_sizes: List<String>?,
    @SerializedName("logo_sizes")
    var logo_sizes: List<String>? ,
    @SerializedName("poster_sizes")
    var poster_sizes: List<String>? ,
    @SerializedName("profile_sizes")
    var profile_sizes: List<String>?,
    @SerializedName("still_sizes")
    var still_sizes: List<String>?

):Parcelable