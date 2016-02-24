package org.hrscala.sbt

case class Dinamo(age: Option[Int])

object Pero extends App {
  val a = Dinamo(Some(18))
  println(a.age.toString + " godina")
}

class PrimarySchool {
  def divide(x: Long, y: Long): BigDecimal = 
    if (y != 0) 
      BigDecimal(x) / y 
    else 
      sys.error("Cannot divide" + x + " by zero!")
}
