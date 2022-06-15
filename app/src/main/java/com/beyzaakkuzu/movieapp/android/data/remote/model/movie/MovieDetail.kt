package com.beyzaakkuzu.movieapp.android.data.remote.model.movie

import android.os.Parcelable
import com.beyzaakkuzu.movieapp.android.data.remote.model.genre.Genre
import com.beyzaakkuzu.movieapp.android.data.remote.model.trailer.Trailer
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieDetail(
    @SerializedName("adult")
    var adult:Boolean,
    @SerializedName("backdrop_path")
    val backdrop_path:String,
    @SerializedName("belongs_to_collection")
    val belongs_to_collection:Any?=null,
    @SerializedName("budget")
    val budget:Long,
    @SerializedName("genres")
    val genres:List<Genre>,
    @SerializedName("homepage")
    val homepage:String,
    @SerializedName("id")
    val id:Long,
    @SerializedName("imdb_id")
    val imdb_id:String,
    @SerializedName("original_language")
    val original_language:String,
    @SerializedName("original_title")
    val original_title:String,
    @SerializedName("overview")
    val overview:String,
    @SerializedName("popularity")
    val popularity: Double,
    @SerializedName("poster_path")
    val poster_path: Any? = null,
    @SerializedName("production_companies")
    val production_companies: List<ProductionCompany>,
    @SerializedName("production_countries")
    val production_countries: List<ProductionCountry>,
    @SerializedName("release_date")
    val release_date: String,
    @SerializedName("revenue")
    val revenue: Long,
    @SerializedName("runtime")
    val runtime: Long,
    @SerializedName("spoken_languages")
    val spoken_languages: List<SpokenLanguage>,
    @SerializedName("status")
    val status: String,
    @SerializedName("tagline")
    val tagline: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("video")
    val video: Boolean,
    @SerializedName("adult")
    val vote_average: Double,
    @SerializedName("vote_count")
    val vote_count: Long,
    @SerializedName("trailers")
    var trailers: List<Trailer>
):Parcelable{
    @Parcelize
    data class ProductionCompany (
        @SerializedName("id")
        val id: Long,
        @SerializedName("logo_path")
        val logo_path: String? = null,
        @SerializedName("name")
        val name: String,
        @SerializedName("origin_country")
        val origin_country: String
    ):Parcelable

    @Parcelize
    data class ProductionCountry (
        @SerializedName("iso_3166_1")
        val iso_3166_1: String,
        @SerializedName("name")
        val name: String
    ):Parcelable

    @Parcelize
    data class SpokenLanguage(
    @SerializedName("iso_639_1")
        val iso_639_1: String,
        @SerializedName("name")
        val name: String
    ):Parcelable

}
