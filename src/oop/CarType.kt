package oop

class CarType {
    var test: Int = 10


    fun getTest(){
        println(test)
    }


    fun getTest(name: String){
        println("$test and $name")
    }
}