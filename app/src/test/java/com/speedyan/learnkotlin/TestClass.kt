package com.speedyan.learnkotlin

import org.junit.Test

class TestClass{
    @Test
    fun testClass1(){
//        var temp = KotlinClass("kotlin","cc");
        var user = User("yh",1,"123455")
        println(user.toString())
        user = user.copy(name = "lh")
        println(user.toString())
    }
}