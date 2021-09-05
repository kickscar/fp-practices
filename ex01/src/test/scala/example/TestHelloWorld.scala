package example
import org.scalatest.funsuite._

class TestHelloWorld extends AnyFunSuite {
  test("Hello World should start with H") {
    // Hello, as opposed to hello
    assert("Hello World".startsWith("H"))
  }
}
