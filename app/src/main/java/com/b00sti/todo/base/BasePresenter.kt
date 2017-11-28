package com.b00sti.todo.base

import com.b00sti.todo.data.DataManager
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 * Created by b00sti on 28.11.2017
 */
open class BasePresenter<V : MvpView>
@Inject constructor(var dataManager: DataManager,
                    var compositeDisposable: CompositeDisposable) : MvpPresenter<V> {

    var mvpView: V? = null

    override fun onAttach(mvpView: V) {
        this.mvpView = mvpView
    }

    override fun onDetach() {
        compositeDisposable.dispose()
        mvpView = null
    }

}