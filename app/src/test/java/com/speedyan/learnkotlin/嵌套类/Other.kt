package com.speedyan.learnkotlin.嵌套类

class Other{
    val numOuter = 1
    class Nested{ //嵌套类
        fun init(){
            println("执行了嵌套类init方法")
        }
    }
}