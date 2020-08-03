package com.speedyan.learnkotlin.`类型别名、属性名冲突解决`

import org.junit.Test

class Test {
    @Test
    fun testType(){
        val first = First()
        first.show()

        val inner = First().Inner()
        inner.show()
    }
}