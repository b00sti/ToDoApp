package com.b00sti.todo.ui.main

import com.b00sti.todo.base.MvpPresenter
import com.b00sti.todo.di.PerActivity

/**
 * Created by b00sti on 28.11.2017
 */
@PerActivity
interface MainMvpPresenter<V : MainMvpView> : MvpPresenter<V> {
    fun onHomeClicked()
    fun onDashboardClicked()
    fun onSettingsClicked()
}
