package lesson1.hello

import org.scalatest.{FunSpec, Matchers}

class MainTest extends FunSpec with Matchers{

  describe("Main") {
    it("can add x and y") {
      Main.add(1, 2) shouldBe 3
    }
  }
}
