package com.example.consumoapi.service

import com.example.consumoapi.model.Endereco
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private val BASE_URL = "https://viacep.com.br/ws/s"

class RetrofitFactory {
    private val retrofitFactory = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getEnderecoService(): EnderecoService {
        return retrofitFactory.create(EnderecoService::class.java)
    }
}