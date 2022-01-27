package com.android.stores.models

data class Photo(
    val _id: String,
    val format: String,
    val thumbnails: ThumbnailsX,
    val url: String
)