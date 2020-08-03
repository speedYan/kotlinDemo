package com.speedyan.learnkotlin

class KotlinClass(str:String){
    var temp:String? = null
    init {
        temp = str
        println("is $temp")
    }
    constructor(str:String,str2:String):this(str){
        println("is $temp  + is $str2")
    }
}