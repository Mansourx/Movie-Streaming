package com.example.moviestreaming.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide
import com.example.moviestreaming.R
import com.example.moviestreaming.model.BannerMovies


/**
 * Created by Ahmad Mansour on 28/06/2020
 * Dubai, UAE.
 */


class BannerMoviesPagerAdapter(
    val context: Context,
    val bannerMoviesList: ArrayList<BannerMovies>
) : PagerAdapter() {


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun getCount(): Int {
       return bannerMoviesList.size
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View?)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater.from(context).inflate(R.layout.banner_movie_layout, null)

        val bannerImage = view.findViewById<ImageView>(R.id.banner_image)
        Glide.with(context).load(bannerMoviesList.get(position).imageUrl).into(bannerImage)
        container.addView(view)

        return view
    }
}

