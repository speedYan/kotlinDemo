package com.speedyan.learnkotlin.中级.嵌套类

class Inner{
    val numOuter:Int = 1

    inner class InnerClass{
        var name = "innnerClass"
        fun init(){
            println("执行了内部类的init方法")
        }
    }
}