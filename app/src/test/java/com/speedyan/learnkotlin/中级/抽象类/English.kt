package com.speedyan.learnkotlin.中级.抽象类

class English : Language(){
    override var name: String
        get() = "english"
        set(value) {}

    override fun init() {
        println("init")
    }
}