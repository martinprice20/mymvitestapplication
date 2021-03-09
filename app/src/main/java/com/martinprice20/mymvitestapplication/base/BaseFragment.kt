package com.martinprice20.mymvitestapplication.base

import androidx.fragment.app.Fragment
import io.reactivex.disposables.CompositeDisposable

open class BaseFragment : Fragment() {
    val disposable = CompositeDisposable()


    override fun onDestroy() {
        disposable.clear()
        super.onDestroy()
    }
}
