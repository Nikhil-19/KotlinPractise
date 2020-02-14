package kotlinHelloWorld

fun main(args:Array<String>)
{
   // println("Hello World")

    val data :Int=10;

    println("Data :$data")

    var a:Int
    a=10
    a=20
    //println(a)

    val emp1:Employee;

    emp1=Employee(1,"Nikhil");
    emp1.name="Vaibhav";

    var emp=Employee(2,"Timon")
    //println(emp)


   val emp3=Employee(4,"Pratik")
   val emp4=Employee(4,"Pratik")


    // Content Comparision
    println(emp3==emp4);

    // Reference Comparision
    println(emp3===emp4)
}

class Employee (val id:Int,var name:String)
{

    @Override
    override fun equals(obj: Any?): Boolean {

        if(obj is Employee)
        {
            return name==obj.name && id==obj.id
        }

        return false;
    }
}



