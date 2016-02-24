package org.hrscala.sbt

class PrimarySchool {
  def divide(x: Long, y: Long): BigDecimal = 
    if (y != 0) 
      BigDecimal(x) / y 
    else 
      sys.error("Cannot divide" + x + " by zero!")
}
