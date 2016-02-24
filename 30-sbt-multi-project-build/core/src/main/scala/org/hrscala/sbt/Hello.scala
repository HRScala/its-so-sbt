package org.hrscala.sbt

/**
  * Created by davor on 2/24/16.
  */
object Hello extends App with BaseTrait {
  override def implementMe: String = "\nHello, I have implemented method 'implementMe' from BaseTrait!\n"

  println(implementMe)
}
