package com.b00sti.todo.utils

import android.app.Activity
import com.b00sti.todo.App
import timber.log.Timber

/**
 * Created by b00sti on 28.11.2017
 */
val Activity.app: App
    get() = application as App

fun dLog(message: String) {
    Timber.d(message)
}