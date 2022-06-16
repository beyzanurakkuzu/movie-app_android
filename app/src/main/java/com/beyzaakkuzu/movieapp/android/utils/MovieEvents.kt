package com.beyzaakkuzu.movieapp.android.utils

import com.beyzaakkuzu.movieapp.android.data.remote.model.movie.Movie
import com.beyzaakkuzu.movieapp.android.data.remote.model.trailer.Trailer

interface MovieEvents {
    fun onMovieclick(movie: Movie)
}

interface TrailerEvents{
    fun onTrailerClick(trailer: Trailer)
}