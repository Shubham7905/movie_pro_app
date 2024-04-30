package com.shubham79059.android.movieproapp.service;

import com.shubham79059.android.movieproapp.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieDataService {

    // Base URL
    // https://api.themoviedb.org/3/

    // End_Point URL
    // movie/popular?api_key=df886c7d0be83a724cf6a034352ae4d7
    @GET("movie/popular")
    Call<Result> getPopularMovies(@Query("api_key") String apiKey);


}
