package it.devday.scalaplayground.examples

import org.scalatest.WordSpec
import org.scalatest.Matchers._

class ClassUnderTestSpec  extends WordSpec{

  "class under test" should {
    "have a method hello world" in {
      val cls = new ClassUnderTest
      val result = cls.helloWorld

      result should startWith("Hello")

      result should have size 11

    }
  }

}
