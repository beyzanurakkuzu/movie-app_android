package com.beyzaakkuzu.movieapp.android.data.remote.api

import com.beyzaakkuzu.movieapp.android.data.remote.model.genre.GenresResponse
import com.beyzaakkuzu.movieapp.android.data.remote.model.movie.MovieDetail
import com.beyzaakkuzu.movieapp.android.data.remote.model.movie.Movies
import com.beyzaakkuzu.movieapp.android.data.remote.model.other.Configurations
import com.beyzaakkuzu.movieapp.android.data.remote.model.trailer.Trailers
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiInterface {

    @GET("movie/popular")
    suspend fun getMoviesPopular(@Query("page") page: Int): Movies

    @GET("movie/now_playing")
    suspend fun getMoviesNowPlaying(@Query("page") page: Int): Movies

    @GET("movie/{movie_id}")
    suspend fun getMovieDetail(@Path("movie_id") movie_id: Int): MovieDetail

    @GET("movie/{movie_id}/videos")
    suspend fun getMovieTrailers(@Path("movie_id") movie_id: Int): Trailers

    @Headers("Cache-Control: public, max-stale=2419200")
    @GET("configuration")
    suspend fun getConfiguration(): Configurations

    @GET("genre/movie/list")
    suspend fun getGenre(): GenresResponse

}