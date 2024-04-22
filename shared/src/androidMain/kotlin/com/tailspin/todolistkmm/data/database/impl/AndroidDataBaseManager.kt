package com.tailspin.todolistkmm.data.database.impl

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import com.tailspin.todolistkmm.data.database.DataBaseManager
import org.tailspins.Database

class AndroidDataBaseManager(context: Context) : DataBaseManager {
    override val driver: SqlDriver = AndroidSqliteDriver(Database.Schema, context, "todo_kmm.db")
    override val database: Database = Database(driver)
}