package com.speedyan.learnkotlin

import android.icu.text.Edits
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    private lateinit var lA1:String
    private val lazyVal:String by lazy { "lazy val" }

    @Test
    fun varDemo(){
        var a1:Int = 1
        var a2:Int

        val val_1:Int? = 1
        var var_a2:Int? = null
        lA1 = "xxx"
        print("$a1 : $val_1 : $var_a2 : $lA1")
    }

    @Test
    fun varArray(){
        var arr3 = Array(5,{
            index->index*2
        })
        for(v in arr3){
            println(v)
        }
    }

    @Test
    fun varFor(){
        for(i in 0 until 10 step 3){
            print(" $i")
        }
        println()
        for(i in 5 downTo 0){
            print(" $i")
        }
        println()
        for(i in 5..20 step 2){
            print(" $i")
        }
    }
    @Test
    fun varForArray(){
        var arrayList = arrayOf(1,3,5,7,9,11)
        for(i in arrayList.indices){
            print("i:  $i -- ${arrayList[i]}")
        }
        println()
        for((index,value) in arrayList.withIndex()){
            print("$index:$value  ")
        }
    }
    @Test
    fun arrayInterator(){
        var arrayA = arrayOf(1,'a',5,7,9)
        var iterator:Iterator<Any> = arrayA.iterator()
        while (iterator.hasNext()){
            print(iterator.next())
        }
    }
    @Test
    fun testWhen(){
        var i = 5
        when(i){
            1->{
                print("i=1")
            }
            2,3,4->{
                print("$i")
            }
            5->{
                print("i=5")
            }
            else->{
                print(i)
            }
        }
    }
    @Test
    fun testWhen1(){
        var i = 5
        when(i>5){
            true->{
                print("i > 5")
            }
            false->{
                print("i<5")
            }
            else->{
                print(i)
            }
        }
    }
    @Test
    fun testWhen2(){
        var arrayList = arrayOf(1,2,3,4,5)
        var i = 6
        when(i){
            in arrayList->{
                print("i in arraylist")
            }
            !in arrayList->{
                print("in not in arraylist")
            }
            in 0..6->{
                print("i in 0..6")
            }
        }
    }
    @Test
    fun testWhen3(){
        when("abc"){
            is String->{
                print("abc is string")
            }
            !is String->{
                print("abc is not string")
            }
        }
    }
    @Test
    fun testLet(){
        var arr: Array<Int?> = arrayOf(1,2,null,3,4,null)
        for(i in arr){
            i?.let { println(i) }
        }
    }

    @Test
    fun testEvils(){
        var str:String? = "1234"
        str = null
        var len = str?.length ?:-1
        print(len)
    }

    @Test
    fun testAs(){
        var num1:Int? = "kotlin" as? Int
        print("num = $num1")
    }

    fun testFun() : Int {
        return 0
    }

    @Test
    fun testReturn(){
//        print(testFun())
//        defaultFun()
//        defaultFun(2)
//        defaultFun(3,"ddd")

//        argFun(1,"a","b","c")
        println(simpleFun1())
        println(simpleFun2(3))
        println(simpleFun3(3,4))
    }

    fun simpleFun1()=2;
    fun simpleFun2(numA:Int)=numA*2
    fun simpleFun3(numA: Int=2,numB: Int)=numA*numB

    fun defaultFun(numA:Int =1,strA:String ="ccc"){
        println("numA= $numA  strA= $strA")
    }

    fun argFun(numA:Int,vararg str:String){
        for(s in str){
            println(s)
        }
    }
}
