package com.b00sti.todo.ui.main

import android.net.Uri
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import com.b00sti.todo.R
import com.b00sti.todo.base.BaseActivity
import com.b00sti.todo.base.OnFragmentInteractionListener
import com.b00sti.todo.helpers.ScreenRouter
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity(), MainMvpView, OnFragmentInteractionListener {

    override fun onFragmentInteraction(uri: Uri) {

    }

    @Inject lateinit var presenter: MainMvpPresenter<MainMvpView>

    override fun doSomething() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                presenter.onHomeClicked()
                ScreenRouter.goToHomePage(supportFragmentManager)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                presenter.onDashboardClicked()
                ScreenRouter.goToDashboardPage(supportFragmentManager)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                presenter.onSettingsClicked()
                ScreenRouter.goToSettingsPage(supportFragmentManager)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        activityComponent.inject(this)
        presenter.onAttach(this)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
