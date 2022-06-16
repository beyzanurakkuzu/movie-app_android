package com.beyzaakkuzu.movieapp.android.data.remote.api

import com.beyzaakkuzu.movieapp.android.MovieApp
import com.beyzaakkuzu.movieapp.android.R
import com.google.gson.GsonBuilder
import okhttp3.ConnectionPool
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class ApiClient {

    companion object{
        private var retrofit : Retrofit? = null

        fun getClient():Retrofit{
            val gson= GsonBuilder()
                .setLenient()
                .create()
            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(AuthInterceptor())
                .readTimeout(30,TimeUnit.SECONDS)
                .connectTimeout(30,TimeUnit.SECONDS)
                .writeTimeout(30,TimeUnit.SECONDS)
                .connectionPool(ConnectionPool(0, 5, TimeUnit.MINUTES))
                .build()
            if (retrofit==null){
                retrofit= Retrofit.Builder()
                    .baseUrl(MovieApp.resource.getString(R.string.baseurl))
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()
            } else{
                OkHttpClient
                    .Builder()
                    .build()
            }
            return retrofit!!
        }
    }
}

