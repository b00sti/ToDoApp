package com.b00sti.todo.helpers

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import com.b00sti.todo.R
import com.b00sti.todo.ui.main.dashboard.DashboardFragment
import com.b00sti.todo.ui.main.home.HomeFragment
import com.b00sti.todo.ui.main.settings.SettingsFragment
import com.b00sti.todo.utils.inTransaction

/**
 * Created by b00sti on 28.11.2017
 */
class ScreenRouter {
    companion object {
        fun goToHomePage(fragmentManager: FragmentManager?) {
            replaceFragment(fragmentManager, HomeFragment.newInstance())
        }

        fun goToDashboardPage(fragmentManager: FragmentManager?) {
            replaceFragment(fragmentManager, DashboardFragment.newInstance())
        }

        fun goToSettingsPage(fragmentManager: FragmentManager?) {
            replaceFragment(fragmentManager, SettingsFragment.newInstance())
        }

        fun replaceFragment(fragmentManager: FragmentManager?, fragment: Fragment) {
            fragmentManager?.inTransaction { replace(R.id.fragmentPlaceholderVG, fragment) }
        }
    }
}