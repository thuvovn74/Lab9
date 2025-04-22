package com.example.lab9.model

import com.google.gson.annotations.SerializedName

data class MarsPhoto(
    @SerializedName("id") val id: Long,
    @SerializedName("img_src") val imgSrc: String
)

data class MarsPhotoResponse(
    @SerializedName("photos") val photos: List<MarsPhoto>
)
