class Person(val firstName: String = "John", val lastName:String = "Smith") {
    //IMPORTANT
    //Init Blocks come before Secondary constructors
    //But Secondary Constructors arent usually needed due to primary constructor options.
    //IMPORTANT
    var nickName: String? = null
        set(value) {
            field = value
            println("The new nickname is $value")
        }
        get() {
            println("The nickname is $field")
            return field
        }
    fun printInfo(){
        val nickNameToPrint = nickName?: ""
        println("$firstName $nickNameToPrint $lastName")
    }
}