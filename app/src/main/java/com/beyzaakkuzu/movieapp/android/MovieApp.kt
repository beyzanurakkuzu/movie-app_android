package com.beyzaakkuzu.movieapp.android

import android.app.Application
import android.content.res.Resources
import com.beyzaakkuzu.movieapp.android.data.remote.api.ApiClient
import com.beyzaakkuzu.movieapp.android.data.remote.api.ApiInterface
import com.beyzaakkuzu.movieapp.android.data.remote.model.genre.Genre
import com.beyzaakkuzu.movieapp.android.data.remote.model.movie.Images
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class MovieApp :Application(){

    companion object{
        lateinit var instance:Application
        lateinit var resource:Resources
        var images: Images?=null
        var genres:List<Genre>?= ArrayList()


        fun loadInitialConfig(){
            MainScope().launch {
                val api= ApiClient.getClient().create(ApiInterface::class.java)
                images= api.getConfiguration().images
                genres= api.getGenre().genres
            }
        }
    }
}