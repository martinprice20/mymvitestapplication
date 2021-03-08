package com.martinprice20.mymvitestapplication.dagger

import com.martinprice20.mymvitestapplication.MviTestApp
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(app: MviTestApp)
}