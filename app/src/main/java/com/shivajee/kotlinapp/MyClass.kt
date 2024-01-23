package com.shivajee.kotlinapp

class MyClass {
    companion object{
        @JvmStatic
        fun main(args: Array<String>)
        {
            println("Hello World! \n ${sum(34,3434)}")
            var num = 0
            var name = Pair("Shivajee", 19)
            println("Output: ${name.first} and age ${name.second}")
            

            for (i in 10 downTo 0 step 2)   {
                println("Number is ${num++}")
            }
        }

        
        fun sum(a : Int, b : Int )  : Any
        {
            return a + b
        }
    }
}