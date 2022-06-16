package com.beyzaakkuzu.movieapp.android.ui.detail

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.beyzaakkuzu.movieapp.android.R
import com.beyzaakkuzu.movieapp.android.adapter.DetailAdapter
import com.beyzaakkuzu.movieapp.android.core.BaseFragment
import com.beyzaakkuzu.movieapp.android.data.remote.model.movie.Movie
import com.beyzaakkuzu.movieapp.android.data.remote.model.trailer.Trailer
import com.beyzaakkuzu.movieapp.android.databinding.FragmentDetailBinding
import com.beyzaakkuzu.movieapp.android.utils.TrailerEvents

class DetailFragment : BaseFragment<FragmentDetailBinding>(), TrailerEvents {

    private val detailViewModel: DetailViewModel by viewModels()
    private val detailAdapter= DetailAdapter()
    private val url="https://www.youtube.com/watch?V="
    private var movie: Movie? =null

    override fun getLayoutRes(): Int {
        return R.layout.fragment_detail
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            movie = it.getSerializable("movie") as Movie?
        }
    }
    @Override
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewBinding.lifecycleOwner = viewLifecycleOwner

    }


    override fun onTrailerClick(trailer: Trailer) {
        if(trailer.site?.lowercase().equals("youtube")){
            startActivity(Intent(
                Intent.ACTION_VIEW, Uri.parse(url+trailer.key)
            ))
        }else
        {
            Toast.makeText(context, getString(R.string.only_youtube), Toast.LENGTH_SHORT).show()
        }
    }
}