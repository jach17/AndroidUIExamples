package com.devsolutions.cursoandroid.Datos

import com.devsolutions.cursoandroid.Datos.Modelo.PostModel
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface API {
    @GET("posts")
    suspend fun getComents():ArrayList<PostModel>



}