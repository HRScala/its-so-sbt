package org.hrscala.sbt

import com.github.nscala_time.time.Imports._
import org.scalacheck._
import org.specs2._

class CalendarIntegrationTest
    extends Specification
    with ScalaCheck {

  def is = s2"""
    Check days in year against days in month $daysInYearViaMonthsTest
"""

  def daysInYearViaMonthsTest: Prop = Prop.forAll { millis: Long =>
    val randomTime = new DateTime(millis)
    val year = randomTime.getYear
    val expected = Calendar.daysInYear(year)

    val months = (1 to 12) map { m => new LocalDate(year, m, 1) }
    months.map { m => Calendar.daysInMonth(m.getMonthOfYear) }.sum ==== expected
  }
}
