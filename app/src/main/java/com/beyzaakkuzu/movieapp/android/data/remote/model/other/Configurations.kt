package com.beyzaakkuzu.movieapp.android.data.remote.model.other

import android.os.Parcelable
import com.beyzaakkuzu.movieapp.android.data.remote.model.movie.Images
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Configurations(
    @SerializedName("images")
    val images: Images?,
    @SerializedName("change_keys")
    val change_keys:List<String?>?
):Parcelable