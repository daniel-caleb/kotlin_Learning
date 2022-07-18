fun main() {
    var num=80

    if (num>0 && num<40){
        println("Fail")
        }
    else if (num>=40 && num<60){
        println("Pass")
    }
    else if (num>=60 && num<75){
        println("Distinction")
    }
    else if (num>=75 && num<=100){
        println("Excellent")
    }
    else{
        println("INVALID")
    }
}