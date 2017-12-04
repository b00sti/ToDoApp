package com.b00sti.todo.ui.main

import com.b00sti.todo.base.MvpView

/**
 * Created by b00sti on 28.11.2017
 */
interface MainMvpView : MvpView {
    fun showHomePage()
    fun showDashboardPage()
    fun showSettingsPage()
}