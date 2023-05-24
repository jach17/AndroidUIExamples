package com.devsolutions.cursoandroid.Dominio

import com.devsolutions.cursoandroid.Datos.Modelo.PostModel

class CasoUso {
    val servicio = Servicio()

    suspend fun getComents(): ArrayList<PostModel> {
        val lista = servicio.getComents()
        println("lista: $lista")
        return lista
    }
}