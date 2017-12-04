package com.b00sti.todo.ui.main.dashboard

import com.b00sti.todo.base.BasePresenter
import com.b00sti.todo.data.DataManager
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 * Created by b00sti on 04.12.2017
 */
class DashboardPresenter<V : DashboardMvpView>
@Inject constructor(dataManager: DataManager,
                    compositeDisposable: CompositeDisposable) :
        BasePresenter<V>(dataManager, compositeDisposable), DashboardMvpPresenter<V> {

}