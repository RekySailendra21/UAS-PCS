package com.applibrary.uas_0724.api

import com.applibrary.uas_0724.data.model.DetailUserResponse
import com.applibrary.uas_0724.data.model.User
import com.applibrary.uas_0724.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET ("search/users")
    @Headers("Authorization: token 6d36af1e9d30113fc84c56d86a0854eac4646b58")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 6d36af1e9d30113fc84c56d86a0854eac4646b58")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 6d36af1e9d30113fc84c56d86a0854eac4646b58")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 6d36af1e9d30113fc84c56d86a0854eac4646b58")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}