package com.b00sti.todo.di.module

import android.content.Context
import android.support.v7.app.AppCompatActivity
import com.b00sti.todo.di.ActivityContext
import com.b00sti.todo.di.PerActivity
import com.b00sti.todo.ui.main.MainMvpPresenter
import com.b00sti.todo.ui.main.MainMvpView
import com.b00sti.todo.ui.main.MainPresenter
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by b00sti on 28.11.2017
 */
@Module
class ActivityModule(private val activity: AppCompatActivity) {

    @Provides
    @ActivityContext
    fun provideContext(): Context = activity

    @Provides
    fun provideActivity(): AppCompatActivity = activity

    @Provides
    fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()

    @Provides
    @PerActivity
    fun provideMainPresenter(presenter: MainPresenter<MainMvpView>): MainMvpPresenter<MainMvpView> = presenter
}