package com.b00sti.todo

import android.app.Application
import com.b00sti.todo.data.DataManager
import com.b00sti.todo.di.component.ApplicationComponent
import com.b00sti.todo.di.component.DaggerApplicationComponent
import com.b00sti.todo.di.module.ApplicationModule
import javax.inject.Inject

/**
 * Created by b00sti on 28.11.2017
 */
class App : Application() {

    @Inject lateinit var mDataManager: DataManager

    private val applicationComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent
                .builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()

        applicationComponent.inject(this)
    }

    fun component() = applicationComponent
}