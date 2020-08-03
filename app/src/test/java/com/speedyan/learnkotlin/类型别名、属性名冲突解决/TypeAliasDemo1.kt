package com.speedyan.learnkotlin.`类型别名、属性名冲突解决`

typealias First = TypeAliasDemo1
typealias Inner = TypeAliasDemo1.InnerA

class TypeAliasDemo1{
    fun show(){
        println("TypeAliasDemo1 ${this.javaClass.simpleName}")
    }

    inner class InnerA{
        fun show(){
            println("TypeAliasDemo1 ${this.javaClass.simpleName}")
        }
    }
}