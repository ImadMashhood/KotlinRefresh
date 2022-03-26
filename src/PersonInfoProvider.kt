interface PersonInfoProvider {
    val providerInfo : String
    fun printInfo(person: Person){
        println(providerInfo)
        person.printInfo()
    }
}

interface  SessionInfoProvider{
    fun getSessionId():String
}

class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider{
    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional statmetns")
    }

    override fun getSessionId(): String {
        return "ID 223931q23"
    }
}

fun main (){
    val provider = BasicInfoProvider()

    provider.printInfo(Person())
    provider.getSessionId()

    checkTypes(provider)
}

fun checkTypes(infoProvider: PersonInfoProvider){
    if(infoProvider !is SessionInfoProvider){
        println("Not a session info provider")
    }
    else
        println("Is a session info provider")
        //Regular Casting Example
        (infoProvider as SessionInfoProvider).getSessionId()
        //Smart cast example(it seems to work based on documentation, but im having trouble getting it to work)
        //infoProvider.getSessionId()
}