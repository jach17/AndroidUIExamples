package com.devsolutions.cursoandroid.UI

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.devsolutions.cursoandroid.Datos.Modelo.PostModel
import com.devsolutions.cursoandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private  val viewmodel = MainViewModel()

    private val arrayList = arrayListOf<PostModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        initView()
        initObservables()

        viewmodel.getPosts()
    }


        private fun initObservables() {
            viewmodel.listilla.observe(this, Observer {
                if(it.isEmpty()){
                    Toast.makeText(applicationContext, "Vacia", Toast.LENGTH_SHORT).show()
                }else{
                    binding.rvLista.apply {
                        adapter = AdapterExample(it)
                    }
                    Toast.makeText(applicationContext, "Llena", Toast.LENGTH_SHORT).show()
                }
            })
        }

    private fun initView() {

        arrayList.add(PostModel("TituloEjemplo", "Cuerpo de ejemplo"))

        binding.rvLista.apply {
            adapter = AdapterExample(arrayList)
        }

    }


}