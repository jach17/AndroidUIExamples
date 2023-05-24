package com.devsolutions.cursoandroid.Dominio

import com.devsolutions.cursoandroid.Datos.API
import com.devsolutions.cursoandroid.Datos.Modelo.PostModel
import com.devsolutions.cursoandroid.Datos.RetrofitHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Servicio {
    private val api = RetrofitHelper.getRetrofit().create(API::class.java)

    suspend fun getComents(): ArrayList<PostModel> {
        return withContext(Dispatchers.IO) {
            api.getComents()
        }
    }


/*
*
* Api api = new RetrofitHelper().
        Call<PostModel> call = api.gePosts();
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                System.out.println("Result "+response);
                User user = response.body();
                onResult.onSuccess(user);
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                onResult.onError("An error has been occurred." + t.getMessage());
            }
        });
* */
}