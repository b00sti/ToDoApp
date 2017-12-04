package com.b00sti.todo.base

import android.content.Context
import android.support.v4.app.Fragment
import android.util.Log
import com.b00sti.todo.utils.KeyboardUtils
import org.jetbrains.anko.support.v4.toast

/**
 * Created by b00sti on 04.12.2017
 */
abstract class BaseFragment : Fragment(), MvpView {

    lateinit var activity: BaseActivity

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is BaseActivity) {
            activity = context
        } else {
            Log.d("BaseFragment", "fragment isn't attached to BaseActivity")
        }
    }

    override fun hideKeyboard() {
        KeyboardUtils.hideSoftInput(activity)
    }

    override fun showToast(message: String) {
        toast(message)
    }
}