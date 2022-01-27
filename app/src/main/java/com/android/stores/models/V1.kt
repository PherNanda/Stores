package com.android.stores.models

data class V1(
    val authCards: List<Any>,
    val id: Int,
    val key: String,
    val signatures: Signatures
)