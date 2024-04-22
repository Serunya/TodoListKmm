package com.tailspin.todolistkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform