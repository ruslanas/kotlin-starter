package app

class Person(val name: String? = null) {

    fun sayHello(person: Person?) {
        val greeting = "Hello, " + (person?.name ?: "stranger") + "!"
        println(greeting)
    }

}

fun main(args: Array<String>) {
    val alice = Person("Alice")
    val bob = Person()
    bob.sayHello(alice)
    alice.sayHello(bob)
}
