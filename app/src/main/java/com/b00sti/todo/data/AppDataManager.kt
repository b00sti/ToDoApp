package com.b00sti.todo.data

import android.content.Context
import com.b00sti.todo.di.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by b00sti on 28.11.2017
 */
@Singleton
class AppDataManager @Inject constructor(@ApplicationContext val context: Context) : DataManager {

}