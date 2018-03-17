fun main(args: Array<String>) {
    val alice = Person("Alice")
    val bob = Person()
    bob.sayHello(alice)
    alice.sayHello(bob)
}
