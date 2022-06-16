package com.beyzaakkuzu.movieapp.android.ui.detail

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.RecyclerView
import com.beyzaakkuzu.movieapp.android.adapter.TrailerAdapter
import com.beyzaakkuzu.movieapp.android.data.remote.model.movie.Movie
import com.beyzaakkuzu.movieapp.android.data.remote.model.trailer.Trailer
import com.beyzaakkuzu.movieapp.android.utils.networkHandling.Resource
import com.squareup.picasso.Picasso
import kotlinx.coroutines.launch

class DetailViewModel:ViewModel() {

    private val moviesListLiveData = MutableLiveData<Resource<Movie>>()
    val movieList: LiveData<Resource<Movie>> get() = moviesListLiveData

    init {
        getMovieList(1)
    }

    private fun getMovieList(page:Int){
        viewModelScope.launch {
            moviesListLiveData.postValue(Resource.loading(null))
            if () //?
        }
    }
}

@BindingAdapter
fun setImageUrl(view: ImageView, posterPath:String){
    Picasso.get().load(posterPath).into(view)
}

@BindingAdapter
fun setTrailerRVProperties(rv:RecyclerView?, data:MutableList<Trailer>?){
    val adapter= rv?.adapter
    if (adapter is TrailerAdapter && data !){

    }
}