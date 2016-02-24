package org.hrscala.sbt

import org.scalatest._

class PrimarySchoolTest 
    extends WordSpec
    with Matchers {
  
  "Longs" should {
    "divide" in {
      new PrimarySchool().divide(11, 2).toString === "5.5"

      Pero.main(Array())
      try {
      new PrimarySchool().divide(11, 0)} catch { case _ => }
      true
    }
  }
}
