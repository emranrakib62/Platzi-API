package com.example.platziapi.network

import com.example.platziapi.data.models.product.ResponseProductItem
import retrofit2.Response
import retrofit2.http.GET

interface Platziervice {
@GET("products")
   suspend fun getAllProduct(): Response<ResponseProductItem>

}