package app.test

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.StringSpec
import app.Person

import khttp.get

class MainTest : StringSpec() {
    init {
        "should get random quotes from GitHub API" {
            get("https://api.github.com/zen").statusCode shouldBe 200
        }
    }
}
