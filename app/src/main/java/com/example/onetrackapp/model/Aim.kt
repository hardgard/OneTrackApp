package com.example.onetrackapp.model

class Aim (val date : Int, val aerobic : Int, val run : Int, val walk : Int, val successful : Boolean){
    override fun toString(): String {
        return aerobic.toString()
    }
}