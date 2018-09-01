package com.sayurisales.senso2000.model

import com.google.gson.annotations.SerializedName

data class Endereco (
        val cep:String,
        val logradouro: String,
        val complemento: String,
        val bairro: String,
        @SerializedName ("localidade") val cidade:String,
        val uf: String
)