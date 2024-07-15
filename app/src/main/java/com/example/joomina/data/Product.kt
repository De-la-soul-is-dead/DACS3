package com.example.joomina.data

data class Product(
    val id: Int = 0,
    val title: String = "",
    val price: Double = 0.0,
    val categoryId: Int = 0,
    val description: String = "",
    val image: String = "",

    val size: ArrayList<String> = ArrayList(),
    val rating: Double = 0.0,
    val sellerName: String = "",
    val sellerTell: Int = 0,
    val sellerPic: String = "",


)
