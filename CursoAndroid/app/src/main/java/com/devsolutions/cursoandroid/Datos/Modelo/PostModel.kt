package com.devsolutions.cursoandroid.Datos.Modelo

import com.google.gson.annotations.SerializedName

data class PostModel(
    @SerializedName("title") val titulo:String,
    @SerializedName("body") val body:String
)




