package com.b00sti.todo.utils

import android.app.Activity
import com.b00sti.todo.App

/**
 * Created by b00sti on 28.11.2017
 */
val Activity.app: App
    get() = application as App