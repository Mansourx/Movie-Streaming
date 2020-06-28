package com.example.moviestreaming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.moviestreaming.adapter.BannerMoviesPagerAdapter
import com.example.moviestreaming.model.BannerMovies
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    var bannerMoviesPagerAdapter: BannerMoviesPagerAdapter? = null
    var tabLayout: TabLayout? = null
    var viewPager: ViewPager? = null
    var bannerMoviesList: ArrayList<BannerMovies>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bannerMoviesList = ArrayList<BannerMovies>()
        bannerMoviesList?.add(BannerMovies(1, "test", "",""))
        bannerMoviesList?.add(BannerMovies(2, "test", "",""))
        bannerMoviesList?.add(BannerMovies(3, "test", "",""))
        bannerMoviesList?.add(BannerMovies(4, "test", "",""))
        bannerMoviesList?.add(BannerMovies(5, "test", "",""))
        bannerMoviesList?.add(BannerMovies(6, "test", "",""))
    }

    private fun setBannerMoviesPagerAdapter(moviesList: ArrayList<BannerMovies>) {
        bannerMoviesPagerAdapter =
            BannerMoviesPagerAdapter(context = this, bannerMoviesList = moviesList)
        viewPager?.apply {
            this.adapter = bannerMoviesPagerAdapter
        }

    }

}
