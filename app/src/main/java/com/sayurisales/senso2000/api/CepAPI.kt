package com.sayurisales.senso2000.api

import com.sayurisales.senso2000.model.Endereco
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface  CepAPI {

    @GET ("/ws/{cep}/json")
    fun pesquisar(@Path("cep") cep: String) : Call<Endereco>

}