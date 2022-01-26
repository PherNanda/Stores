package com.android.stores.api.store

interface StoreApi {

    /**@GET("/app/user/{user_id}/info")
    suspend fun fetchUserInfo(
        @Header("Authorization") authHeader: String,
        @Header("x-request-domain") requestDomain: String = "www.miscota.es",
        @Path("user_id") userId: Int,
    ): LoginResponse**/
}