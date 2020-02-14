package kotlinHelloWorld

fun main(args:Array<String>){

    var myInt=10;

    // Saving A long Value //
    var myLong =22L
    myLong=myInt.toLong()



    var myByte =10;
    var myShort :Short =12;
    myShort=myByte.toShort()

    println(myShort);

    println("My Data Type is Integer  "+(myInt))


    var myDouble=65.84
    var myFloat=65.84
    println("myDouble Is Double ${myInt.toFloat()}")

    var myChar:Char
    var a=65;
    println(a.toChar())
    myChar=a.toChar();
    println(myChar)

    var doubleValue=853.569;
    var floatValue=672.589f;
    doubleValue=floatValue.toDouble();

    val mDummy=Dummy();
    var isAvailable=mDummy.areYouAvailable(false);
    println(isAvailable)





}