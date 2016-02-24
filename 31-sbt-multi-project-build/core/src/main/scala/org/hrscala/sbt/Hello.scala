package org.hrscala.sbt

object Hello extends App with BaseTrait {
  override def implementMe: String = "\nHello, I have implemented method 'implementMe' from BaseTrait!\n"

  println(implementMe)
}
