package org.hrscala.sbt

import com.github.nscala_time.time.Imports._
import org.joda.time.Days
import org.scalacheck._
import org.specs2._

class CalendarUnitTest
    extends Specification
    with ScalaCheck {

  def is = s2"""
    Check days in year     $daysInYearTest
    Check months in year   $daysInMonthTest
"""

  def daysInYearTest: Prop = Prop.forAll(Gen.choose(-10000,10000)) { year: Int =>
    val randomDate = new LocalDate(year % 10000, 1, 1)

    val actual = Calendar.daysInYear(year)
    val expected = if (randomDate.year.isLeap) 366 else 365
    actual ==== expected
  }

  def daysInMonthTest: Prop = Prop.forAll(Gen.choose(1,12)) { month: Int =>
    val randomDate = new LocalDate(2018, month, 1) // test written by the same developer

    val actual = Calendar.daysInMonth(month)
    val expected = Days.daysBetween(randomDate, randomDate + 1.month).getDays

    actual ==== expected
  }
}
