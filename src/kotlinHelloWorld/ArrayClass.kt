package kotlinHelloWorld

import java.math.BigDecimal

fun main() {

    var StringArray= arrayOf("Abc","Efg")

    var longs= arrayOf(1L,2L,3L)

    var longArray= arrayOf<Long>(1,2,3)


    //println(StringArray is Array<String>)

    //println(longs is Array<Long>)

    // Print Element Of An Array //
    println(longs[0])

    //Initailizing An array using constructor and lambda expression //

    val arrayValues=Array(16) { i -> (i*2)+1 }

    println("Array Values : ")
    for (number in arrayValues)
    {
        print(" $number")
    }

    println()

    // Declare An Array and initalize later //

    var dynamicArray :Array<Int>
    dynamicArray= arrayOf(1,2,3,4,5);
    println("Dynamic Array : ")

    for (num in dynamicArray)
    {
        print(" $num");
    }
    println()

    println("Dynamic Array Re Initalized: ")
    dynamicArray= Array(15) { i->i*10}

    for (num in dynamicArray)
    {
        print(" $num");
    }


    val mixedArray= arrayOf(1,"10",BigDecimal(10),'a')
    println(mixedArray is Array)

    println()
    var myArray= intArrayOf(1,2,3,4)
    Dummy().printArray(myArray);


    var myString :String?="nksfjnsfnk";
    //println(myString?.length)

    myString?.let{
        println(it.length)
    }

}