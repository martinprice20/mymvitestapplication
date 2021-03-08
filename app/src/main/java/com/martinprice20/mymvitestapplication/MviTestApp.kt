package com.martinprice20.mymvitestapplication

import android.app.Application
import com.martinprice20.mymvitestapplication.dagger.AppComponent
import com.martinprice20.mymvitestapplication.dagger.AppModule
import com.martinprice20.mymvitestapplication.dagger.DaggerAppComponent

class MviTestApp : Application() {

    val component: AppComponent by lazy {
        DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        component.inject(this)

    }
}