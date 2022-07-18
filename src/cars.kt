class cars {
    var car1:String="Mercedes Benz"
    var car2:String="BMW"
    var car3:String="VolksWagen GTI"

    fun mycars():String{
        return mycars()
    }
}

fun main() {
    val myobj=cars()
    println("Lorato drives "+myobj.car3)
    println("Michelle loves a "+myobj.car1)
    println("Caleb bought a "+myobj.car2)
}