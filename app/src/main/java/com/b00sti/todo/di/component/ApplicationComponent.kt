package com.b00sti.todo.di.component

import android.app.Application
import android.content.Context
import com.b00sti.todo.App
import com.b00sti.todo.data.DataManager
import com.b00sti.todo.di.ApplicationContext
import com.b00sti.todo.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by b00sti on 28.11.2017
 */
@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {
    fun inject(app: App)

    @ApplicationContext
    fun context(): Context

    fun application(): Application

    fun getDataManager(): DataManager

}