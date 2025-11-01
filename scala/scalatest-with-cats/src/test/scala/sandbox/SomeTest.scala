package sandbox 

import org.scalatest.*
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

abstract class UnitTest extends AnyFunSuite with Matchers

class SomeTest extends UnitTest {

  test("scalatest should work") {
    42 shouldBe 43
  }
}
