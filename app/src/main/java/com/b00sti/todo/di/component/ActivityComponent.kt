package com.b00sti.todo.di.component

import com.b00sti.todo.di.PerActivity
import com.b00sti.todo.di.module.ActivityModule
import com.b00sti.todo.ui.main.MainActivity
import dagger.Component

/**
 * Created by b00sti on 28.11.2017
 */
@PerActivity
@Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun inject(mainActivity: MainActivity)
}