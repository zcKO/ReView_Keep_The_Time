package com.jc.review_keep_the_time.utils.server_utils.api_service.user_repository

import com.jc.review_keep_the_time.datas.BasicResponse
import com.jc.review_keep_the_time.utils.server_utils.Connected

object UserRepository {

    //region * userSignIn
    suspend fun postRequestSignIn(email: String, pw: String): BasicResponse? =
        Connected.keepTheTimeService.postRequestSignIn(email, pw).body()
    //endregion
}