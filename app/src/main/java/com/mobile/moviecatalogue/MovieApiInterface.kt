package com.mobile.moviecatalogue

import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/popular?api_key=cabf36f1385a5ec87a5866bc4fbbed91")
    fun getMovieList(): Call<MovieResponse>
}

