package com.b00sti.todo.base

/**
 * Created by b00sti on 28.11.2017
 */
interface MvpPresenter<V : MvpView> {
    fun onAttach(mvpView: V)

    fun onDetach()
}