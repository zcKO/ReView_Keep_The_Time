package com.jc.review_keep_the_time.activities.splash

import android.os.Handler
import android.os.Looper
import com.jc.review_keep_the_time.R
import com.jc.review_keep_the_time.activities.sign_in_sign_up.SignInActivity
import com.jc.review_keep_the_time.base.UtilityBase
import com.jc.review_keep_the_time.databinding.ActivitySplashBinding

class SplashActivity :
    UtilityBase.BaseAppCompatActivity<ActivitySplashBinding>(R.layout.activity_splash) {

    override fun ActivitySplashBinding.onCreate() {

        setupEvents()

    }

    override fun setupEvents() {

        Handler(Looper.getMainLooper()).postDelayed({
            goToActivityWithFinish(SignInActivity::class.java)
        }, 1000)


    }

    override fun setValues() {

    }
}