package com.beyzaakkuzu.movieapp.android.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.beyzaakkuzu.movieapp.android.R
import com.beyzaakkuzu.movieapp.android.data.remote.model.movie.Movie
import com.beyzaakkuzu.movieapp.android.utils.MovieEvents

class DetailAdapter(private val movies:MutableList<Movie>, private val events: MovieEvents)
    : RecyclerView.Adapter<DetailAdapter.DetailViewHolder>(){

    override fun getItemCount(): Int = movies.size

    fun setData(data:MutableList<Movie>){
        movies.clear()
        movies.addAll(data)
        notifyDataSetChanged()

    }


    inner class DetailViewHolder(view: View):RecyclerView.ViewHolder(view) {
        fun bind(movie:Movie){

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailViewHolder {
        return DetailViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout,parent,false
            )
        )
    }

    override fun onBindViewHolder(holder: DetailViewHolder, position: Int) {
        holder.bind(movies[position])
    }
}