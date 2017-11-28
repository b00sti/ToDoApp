package com.b00sti.todo.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.b00sti.todo.di.component.ActivityComponent
import com.b00sti.todo.di.component.DaggerActivityComponent
import com.b00sti.todo.di.module.ActivityModule
import com.b00sti.todo.utils.KeyboardUtils
import com.b00sti.todo.utils.app
import org.jetbrains.anko.toast

/**
 * Created by b00sti on 28.11.2017
 */
abstract class BaseActivity : AppCompatActivity(), MvpView {

    val activityComponent: ActivityComponent by lazy {
        DaggerActivityComponent.builder()
                .activityModule(ActivityModule(this))
                .applicationComponent(app.component())
                .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hideKeyboard()
    }

    override fun showToast(message: String) {
        toast(message)
    }

    override fun hideKeyboard() {
        KeyboardUtils.hideSoftInput(this)
    }
}