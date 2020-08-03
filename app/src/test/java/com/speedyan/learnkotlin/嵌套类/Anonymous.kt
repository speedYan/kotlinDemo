package com.speedyan.learnkotlin.嵌套类

class Anonymous{//匿名内部类
    lateinit var listener: OnClickListener

    fun setOnClickListener(listener: OnClickListener){
        this.listener = listener
    }

    fun testListener(){
        listener.onItemClick("匿名内部类的测试方法")
    }


}