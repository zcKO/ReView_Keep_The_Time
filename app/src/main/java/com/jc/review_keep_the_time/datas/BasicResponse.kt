package com.jc.review_keep_the_time.datas

import com.google.gson.annotations.SerializedName

class BasicResponse(
    @SerializedName("code")
    val code: Int,
    @SerializedName("message")
    val message: String,
    @SerializedName("data")
    val data: DataResponse
)