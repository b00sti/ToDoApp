package com.b00sti.todo.di.component

import com.b00sti.todo.di.PerActivity
import com.b00sti.todo.di.module.ActivityModule
import com.b00sti.todo.ui.main.MainActivity
import com.b00sti.todo.ui.main.dashboard.DashboardFragment
import com.b00sti.todo.ui.main.home.HomeFragment
import com.b00sti.todo.ui.main.settings.SettingsFragment
import dagger.Component

/**
 * Created by b00sti on 28.11.2017
 */
@PerActivity
@Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(dashboardFragment: DashboardFragment)
    fun inject(homeFragment: HomeFragment)
    fun inject(settingsFragment: SettingsFragment)
}