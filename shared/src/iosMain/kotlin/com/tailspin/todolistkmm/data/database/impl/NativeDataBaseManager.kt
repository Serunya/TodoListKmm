package com.tailspin.todolistkmm.data.database.impl

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import com.tailspin.todolistkmm.data.database.DataBaseManager
import org.tailspins.Database

class NativeDataBaseManager : DataBaseManager {
    override val driver: SqlDriver = NativeSqliteDriver(Database.Schema, "todo_kmm.db")
    override val database: Database = Database(driver)
}