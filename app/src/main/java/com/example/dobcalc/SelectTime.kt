package com.example.dobcalc

class SelectTime(arg: String) {

    val timeSeconds:String = "SELECT SECONDS"
    val timeMinutes:String = "SELECT MINUTES"
    val timeHours:String = "SELECT HOURS"
    val timeDays:String = "SELECT DAYS"

    init {
        if (arg == timeSeconds) {
            println("SELECT SECONDS")
        } else if ( arg == timeMinutes) {
            println("SELECT MINUTES")
        } else if (arg == timeHours) {
            println("SELECT HOURS")
        } else if (arg == timeDays) {
            println("SELECT DAYS")
        }
    }
}