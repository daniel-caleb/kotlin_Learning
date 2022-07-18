import java.time.Year

class students(val name: String, val gender:String, var year: Int) {
}

fun main() {
    val obj=students("Caleb", "Male", 1600)
    println("My name is ${obj.name}, a ${obj.gender} and was born in the year ${obj.year}")
}