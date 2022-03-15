package com.jc.review_keep_the_time.activities.sign_in

import com.jc.review_keep_the_time.R
import com.jc.review_keep_the_time.base.UtilityBase
import com.jc.review_keep_the_time.databinding.ActivitySignInBinding

class SignInActivity : UtilityBase.BaseAppCompatActivity<ActivitySignInBinding>(R.layout.activity_sign_in) {
    override fun ActivitySignInBinding.onCreate() {

        setupEvents()

    }

    override fun setupEvents() {

        binding.loginButton.setOnClickListener {

        }

    }

    override fun setValues() {

    }

}