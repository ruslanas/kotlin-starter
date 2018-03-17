import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.StringSpec

import khttp.get

class MainTest : StringSpec() {
    init {
        val response = get("https://api.github.com/zen")
        "GitHub API response status code should be 200" {
            response.statusCode shouldBe 200
        }
        "Response should be a sentence" {
            response.text.takeLast(1) shouldBe "."
        }
    }
}
