package com.example.platziapi.viewmodel

import androidx.compose.ui.geometry.MutableRect
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.platziapi.data.models.product.ResponseProductItem
import com.example.platziapi.repositories.ProductRepositories
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class ProductViewModel @Inject constructor(val repositories: ProductRepositories) {
    private val _allproducts:MutableLiveData<ResponseProductItem> = MutableLiveData()
    val  allproducts:LiveData<ResponseProductItem> = _allproducts
}