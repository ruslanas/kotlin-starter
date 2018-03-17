package app

class Person(val name: String? = null) {

    fun sayHello(person: Person?) {
        val greeting = "Hello, " + (person?.name ?: "stranger") + "!"
        println(greeting)
    }

}
