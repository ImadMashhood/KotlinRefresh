//Variable Declaration
val name = "Imad"
var greeting: String? = null

fun main() {
    var greetingToPrint = if(greeting != null) greeting else "Hi"
    greetingToPrint = when(greeting){
        null -> "Hi"
        else -> greetingToPrint
    }
    println(greetingToPrint)
    println(name)

}