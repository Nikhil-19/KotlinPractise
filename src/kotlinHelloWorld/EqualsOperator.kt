package kotlinHelloWorld

public class Emp(var name:String,val id:Int){

}

fun main(args:Array<String>) {
    val e=Emp("Nikhil",19);
    val e2=Emp("Vaibhav",27);
    val e3=Emp("Nikhil",19);

    println(e==e2);
    println(e==e3);
    println(e.equals(e3));


    var id:String ="abc";
    println(id);
}
