package com.martinprice20.mymvitestapplication.dagger

import com.martinprice20.mymvitestapplication.MviTestApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val app: MviTestApp) {
    @Provides
    @Singleton
    fun provideApp() = app
}