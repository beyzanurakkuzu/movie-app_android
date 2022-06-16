package com.beyzaakkuzu.movieapp.android.data.repository

import com.beyzaakkuzu.movieapp.android.data.remote.api.ApiInterface
import javax.inject.Inject

class Repository @Inject constructor(private val apiInterface:ApiInterface)
{
    suspend fun getNowPlayingMovies(page:Int)=  apiInterface.getMoviesNowPlaying(page)

    suspend fun getMostPopularMovies(page:Int)=apiInterface.getMoviesPopular(page)

    suspend fun getMovieDetails(movieId: Int) = apiInterface.getMovieDetail(movieId)
}