package org.hrscala.sbt

import org.scalacheck._
import org.specs2._

class MathTest
    extends Specification
    with ScalaCheck {

  def is = s2"""
  compare test  $compareTest
"""

  def compareTest = Prop.forAll { (a: Int, b: Int) =>
    1 === 3
   // pending
  }
}
