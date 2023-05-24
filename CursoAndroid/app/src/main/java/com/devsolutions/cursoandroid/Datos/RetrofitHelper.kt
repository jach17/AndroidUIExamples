package com.devsolutions.cursoandroid.Datos

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    val BASE_URL = "https://jsonplaceholder.typicode.com/"
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}

/*
*
* private static final String BASE_URL = "https://jsonplaceholder.typicode.com/";
    private retrofit2.Retrofit retrofit = new retrofit2.Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public retrofit2.Retrofit getRetrofit(){
        return  this.retrofit;
    }
*/