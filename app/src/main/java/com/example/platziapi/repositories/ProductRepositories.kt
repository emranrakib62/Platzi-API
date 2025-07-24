package com.example.platziapi.repositories

import com.example.platziapi.network.Platziervice
import javax.inject.Inject

class ProductRepositories @Inject constructor(val platziService:Platziervice) {
   suspend fun getAllProductRepo(){
        platziService.getAllProduct()
    }

}