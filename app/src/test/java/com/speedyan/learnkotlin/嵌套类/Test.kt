package com.speedyan.learnkotlin.嵌套类

import org.junit.Test

class Test{
    @Test
    fun runOther(){
        Other.Nested().init()
    }

    @Test
    fun runInner(){
        Inner().InnerClass().init()
    }

    @Test
    fun testAnonymous(){
        val anonymous = Anonymous()
        anonymous.setOnClickListener(object : OnClickListener{
            override fun onItemClick(str: String) {
                println(str)
            }
        })
        anonymous.testListener()
    }
}