package com.tailspin.todolistkmm.di

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import com.tailspin.todolistkmm.data.database.DataBaseManager
import com.tailspin.todolistkmm.data.database.impl.AndroidDataBaseManager
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext
import org.koin.core.context.KoinContext
import org.koin.core.context.KoinContextHandler
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.module
import org.koin.mp.KoinPlatform
import org.tailspins.Database


fun initKoin(context: Context) {
    if (GlobalContext.getOrNull() == null) {
        startKoin {
            androidContext(context)
            modules(getAndroidPlatformModules())
            modules(getSharedModules())
        }
    }
}

private fun getAndroidPlatformModules(): List<Module> = listOf(dataBaseModule)

private val dataBaseModule = module {
    single<DataBaseManager> { AndroidDataBaseManager(get()) }
}