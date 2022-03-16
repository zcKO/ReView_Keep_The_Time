package com.jc.review_keep_the_time.activities.sign_in

import android.widget.Toast
import com.jc.review_keep_the_time.MainActivity
import com.jc.review_keep_the_time.R
import com.jc.review_keep_the_time.base.UtilityBase
import com.jc.review_keep_the_time.databinding.ActivitySignInBinding
import com.jc.review_keep_the_time.utils.server_utils.api_service.user_repository.UserRepository
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class SignInActivity :
    UtilityBase.BaseAppCompatActivity<ActivitySignInBinding>(R.layout.activity_sign_in) {

    private val scope = MainScope()

    override fun ActivitySignInBinding.onCreate() {

        setupEvents()

    }

    override fun setupEvents() {

        binding.inputEmailEditText.setText("testGuest0311@test.com")
        binding.inputPwEditText.setText("Test!123")

        binding.loginButton.setOnClickListener {

            val email = binding.inputEmailEditText.text.toString()
            val pw = binding.inputPwEditText.text.toString()

            postRequestSignIn(email, pw)
        }

    }

    override fun setValues() {

    }

    private fun postRequestSignIn(email: String, pw: String) = scope.launch {
        try {

            UserRepository.postRequestSignIn(email, pw)?.let {

                val nickname = it.data.user.nickname
                Toast.makeText(mContext, "${nickname}님, 환영합니다.", Toast.LENGTH_SHORT).show()
                goToActivityWithFinish(MainActivity::class.java)

            }

        } catch (exception: Exception) {

        }

    }

}