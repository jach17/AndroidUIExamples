package com.devsolutions.cursoandroid.UI

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.devsolutions.cursoandroid.Datos.Modelo.PostModel
import com.devsolutions.cursoandroid.Dominio.CasoUso
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    val casoUso = CasoUso()
    val listilla = MutableLiveData<ArrayList<PostModel>>()

    fun getPosts() {
        viewModelScope.launch(Dispatchers.IO) {
            listilla.postValue(casoUso.getComents())
        }
    }
}