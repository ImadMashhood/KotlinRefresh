//Unit or no type value is similar to Null in Java
fun sayHello(greeting:String, itemToGreet:String){
    println("$greeting $itemToGreet")
}

fun main() {
    val things = arrayOf("Birds", "Keyboards", "Food")
    things.forEachIndexed{ index, thing ->
        println("$thing is at Index $index")
    }
}