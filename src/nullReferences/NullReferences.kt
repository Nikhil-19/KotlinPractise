package nullReferences

fun main(args:Array<String>) {

    var s2:String?=null;
    s2="abc";
    var s1:String?="abc"
    if(s1 !=null)
    {
       println(s1.toUpperCase())
    }

    // Use Of Safe Operator

    println(s2?.toUpperCase())

   // Safe Cast Opertaor as?

    var arrayInteger = arrayOf(1,2,3);
    val myString= arrayInteger as? String;


}