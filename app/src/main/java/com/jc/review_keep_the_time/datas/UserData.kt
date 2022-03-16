package com.jc.review_keep_the_time.datas

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class UserData(
    val id: Int,
    val provider: String,
    val uid: String,
    val email: String,
    @SerializedName("ready_minute")
    val readyMinute: Int,
    @SerializedName("nick_name")
    val nickname: String,
    @SerializedName("app_maker")
    val appMaker: String,
    @SerializedName("profile_img")
    val profileImg: String,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("updated_at")
    val updatedAt: String
)
