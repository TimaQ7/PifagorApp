package com.example.a5556667777

import android.util.Log

class User(var name: String, var id: String, var age: Int) {
    fun printUserInfo(){
        Log.d("MyLog", "User name: $name  User id: $id  User age: $age")
    }
    fun addAge(years: Int = 15) : String {
        age = age.plus(years)
        return "User name: $name  User id: $id  User age: $age"
    }

}