package com.b00sti.todo.ui.main

import com.b00sti.todo.base.BasePresenter
import com.b00sti.todo.data.DataManager
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 * Created by b00sti on 28.11.2017
 */
class MainPresenter<V : MainMvpView>
@Inject constructor(dataManager: DataManager,
                    compositeDisposable: CompositeDisposable) :
        BasePresenter<V>(dataManager, compositeDisposable), MainMvpPresenter<V> {

    override fun onHomeClicked() {
        mvpView?.showToast("Welcome Home")
    }

    override fun onDashboardClicked() {
        mvpView?.showToast("Welcome Dash")
    }

    override fun onSettingsClicked() {
        mvpView?.showToast("Welcome Settings")
    }
}