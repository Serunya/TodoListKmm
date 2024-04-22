package com.tailspin.todolistkmm.data.database

import app.cash.sqldelight.db.SqlDriver
import org.tailspins.Database



interface DataBaseManager {
    val driver : SqlDriver
    val database : Database
}