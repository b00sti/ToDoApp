package com.b00sti.todo.base

/**
 * Created by b00sti on 28.11.2017
 */
interface MvpView {
    fun hideKeyboard()

    fun showToast(message: String)
}