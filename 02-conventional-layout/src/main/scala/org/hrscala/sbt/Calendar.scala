package org.hrscala.sbt

import com.github.nscala_time.time.Imports._

object Calendar extends App {

  def daysInYear(year: Int): Int =
    new LocalDate(year, 1, 1).dayOfYear.getMaximumValue

  def daysInMonth(month: Int): Int =
    new LocalDate(2018, month, 1).dayOfMonth.maximumValue


  val now = LocalDate.now

  println("=" * 100)
  println(s"Today is $now")
  println(s"This year has ${daysInYear(now.getYear)} days!")
  println(s"This month has ${daysInMonth(now.getMonthOfYear)} days!")
  println("-" * 100)
}
