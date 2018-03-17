package app.test

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.StringSpec
import app.Person

class MainTest : StringSpec() {
    init {
        "sould set name" {
            Person("bob").name shouldBe "bob"
        }
    }
}
