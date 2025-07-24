package com.example.platziapi.viewmodel

import androidx.compose.ui.geometry.MutableRect
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.platziapi.data.models.product.ResponseProductItem
import com.example.platziapi.repositories.ProductRepositories
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltAndroidApp
class ProductViewModel @Inject constructor(val repositories: ProductRepositories) :ViewModel(){
    private val _allproducts:MutableLiveData<ResponseProductItem> = MutableLiveData()
    val  allproducts:LiveData<ResponseProductItem> = _allproducts


    fun getAllproductvm(){

        viewModelScope.launch {

            val response =repositories.getAllProductRepo()
            if(response.isSuccessful){
                _allproducts.postValue(response.body())
            }

        }

    }

}