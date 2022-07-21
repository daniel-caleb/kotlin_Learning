open class Parent(var me:String,var age:Int){
//    var marks=45
//    var marks2=77
}
class child1:Parent("Caleb", 55){
    fun hesabu(){
//        println("I have been able to get $marks marks in Chemistry")
        println("My name is $me and am $age years old")
    }
}
class child2:Parent("Lorato", 24){
    fun kiswahili(){
//        println("I scored $marks2 marks in Kiswahili")
        println("My name is $me and am $age years old")
    }
}

fun main() {
    val obj1=child1()
    val obj2=child2()
    println(obj2.kiswahili())
}