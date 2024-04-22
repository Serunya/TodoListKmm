package com.tailspin.todolistkmm.di

import org.koin.core.module.Module
import org.koin.dsl.module

fun getSharedModules() : List<Module> = listOf(dataBaseModule)
val dataBaseModule = module {

}
