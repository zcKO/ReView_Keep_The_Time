package com.jc.review_keep_the_time.utils.server_utils

import com.jc.review_keep_the_time.datas.BasicResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface KeepTheTimeService {

    @FormUrlEncoded
    @POST("/user")
    suspend fun postRequestSignIn(
        @Field("email") email: String,
        @Field("password") password: String
    ): Response<BasicResponse>

}