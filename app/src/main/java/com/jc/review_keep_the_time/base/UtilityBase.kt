package com.jc.review_keep_the_time.base

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import kotlin.jvm.internal.ClassBasedDeclarationContainer
import kotlin.reflect.KClass

sealed class UtilityBase {

    // open class BaseAppCompatActivity<T: ViewDataBinding>(@LayoutRes val layoutRes: Int) : AppCompatActivity() {
    //      open fun T.onCreate() = Unit
    // }

    abstract class BaseAppCompatActivity<T: ViewDataBinding>(@LayoutRes val layoutRes: Int) : AppCompatActivity() {

        lateinit var binding: T
        lateinit var mContext: Context

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = DataBindingUtil.setContentView(this, layoutRes)
            mContext = this
            binding.onCreate()
        }

        abstract fun T.onCreate()

        abstract fun setupEvents()
        abstract fun setValues()

        // https://stackoverflow.com/questions/62144286/how-to-pass-a-class-to-a-function-in-kotlin
        fun goToActivityWithFinish(cls: Class<*>?) {
            startActivity(Intent(mContext, cls))
            finish()
        }

    }

}
