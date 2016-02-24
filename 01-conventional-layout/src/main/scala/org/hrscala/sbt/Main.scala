package org.hrscala.sbt

object Main extends App {
  println("=" * 100)
  println("Hello world via Scala " + scala.util.Properties.versionNumberString)
  println("-" * 100)
}

import scalax.io._

object Lipsum extends App {
  println("=" * 100)
  val lipsum = Resource.fromClasspath("lipsum.txt").string
  lipsum.split("""(?<=\.)\s*""") foreach println
  println("-" * 100)
}

import com.github.nscala_time.time.Imports._

object Clock extends App {
  println("=" * 100)
  println(DateTime.now)
  println(DateTime.now)
  println("-" * 100)
}
