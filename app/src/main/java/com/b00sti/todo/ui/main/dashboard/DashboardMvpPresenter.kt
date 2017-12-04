package com.b00sti.todo.ui.main.dashboard

import com.b00sti.todo.base.MvpPresenter
import com.b00sti.todo.di.PerActivity

/**
 * Created by b00sti on 04.12.2017
 */
@PerActivity
interface DashboardMvpPresenter<V : DashboardMvpView> : MvpPresenter<V> {

}