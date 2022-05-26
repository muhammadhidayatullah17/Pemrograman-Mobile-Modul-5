package com.example.android.marsphotos.network

import com.squareup.moshi.Json

data class MarsPhoto(
    val name: String,
    @Json(name = "img") val imgUrl: String
)
