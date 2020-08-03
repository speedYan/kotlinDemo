package com.speedyan.learnkotlin

import org.junit.Test

class StringTest{

    @Test
    fun test1(){
        var str:String="hello kotlin"
        println(str?.first())
        println(str?.get(0))
        println(str[0])
        println(str.first { it=='o' })
    }
    @Test
    fun testLast(){
        var str:String = "hello kotlin"
        println(str.last())
        println(str.get(str.length-1))
        println(str.last{it=='k'})

    }

    @Test
    fun testIndex(){
        var str:String = "hello kotlin"
        println(str.indexOf('e'))
        println(str.indexOfFirst {
            it=='o'
        })

    }
}