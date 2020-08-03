package com.speedyan.learnkotlin.中级.抽象类

abstract class Language{
    val TAG = this.javaClass.simpleName;
    fun test():Unit{}
    abstract var name:String
    abstract fun init();
}