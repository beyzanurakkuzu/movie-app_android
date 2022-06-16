package com.beyzaakkuzu.movieapp.android.core

import android.os.Bundle
import android.os.PersistableBundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<DB:ViewDataBinding> :AppCompatActivity() {
    private lateinit var viewBinding:DB

    @LayoutRes
    abstract fun getLayoutRes():Int

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        viewBinding= DataBindingUtil.setContentView(this,getLayoutRes())
    }
}