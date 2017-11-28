package com.b00sti.todo.di.module

import android.app.Application
import android.content.Context
import com.b00sti.todo.data.AppDataManager
import com.b00sti.todo.data.DataManager
import com.b00sti.todo.di.ApplicationContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by b00sti on 28.11.2017
 */
@Module
class ApplicationModule(private val application: Application) {

    @Provides
    @ApplicationContext
    fun provideContext(): Context = application

    @Provides
    fun provideAppliation(): Application = application

    @Provides
    @Singleton
    fun provideDataManager(appDataManager: AppDataManager): DataManager = appDataManager
}