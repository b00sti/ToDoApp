package com.b00sti.todo.ui.main.home

import com.b00sti.todo.base.BasePresenter
import com.b00sti.todo.data.DataManager
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 * Created by b00sti on 04.12.2017
 */
class HomePresenter<V : HomeMvpView>
@Inject constructor(dataManager: DataManager,
                    compositeDisposable: CompositeDisposable) :
        BasePresenter<V>(dataManager, compositeDisposable), HomeMvpPresenter<V> {

}