package com.b00sti.todo.ui.main

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import com.b00sti.todo.R
import com.b00sti.todo.base.BaseActivity
import com.b00sti.todo.base.OnFragmentInteractionListener
import com.b00sti.todo.helpers.ScreenRouter
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity(), MainMvpView, OnFragmentInteractionListener {

    @Inject lateinit var presenter: MainMvpPresenter<MainMvpView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        activityComponent.inject(this)
        presenter.onAttach(this)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                presenter.onHomeClicked()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                presenter.onDashboardClicked()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                presenter.onSettingsClicked()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun showHomePage() {
        ScreenRouter.goToHomePage(supportFragmentManager)
    }

    override fun showDashboardPage() {
        ScreenRouter.goToDashboardPage(supportFragmentManager)
    }

    override fun showSettingsPage() {
        ScreenRouter.goToSettingsPage(supportFragmentManager)
    }

    override fun onFragmentInteraction() {

    }
}
