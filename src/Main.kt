//Unit or no type value is similar to Null in Java
fun sayHello(greeting:String, vararg itemsToGreet:String){
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun main() {
    /*val things = arrayOf("Birds", "Keyboards", "Food")
    things.forEachIndexed{ index, thing ->
        println("$thing is at Index $index")
    }*/

    /*val things = listOf("Birds", "Keyboards", "Food")
    things.forEach{ thing ->
        println(thing)
    }*/

    /*val things = mutableListOf("Birds", "Keyboards", "Food")
    things.add("Phone")
    things.forEach { thing->
        println(thing)
    }
    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    map.put(4, "d")
    map.forEach { key, value ->  println("$key -> $value")}
    */

    /*val things = arrayOf("Birds", "Keyboards", "Food")
    sayHello("Hello", *things)

    sayHello(greeting = "Hi", itemsToGreet = *things)
    */

    val person = Person("first", "last")
    person.nickName = "firast"
    person.printInfo()

}