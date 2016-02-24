package org.hrscala.sbt

import java.util.Properties

object ProjectInformation {
  lazy val properties = {
    val tmp = new Properties()
    tmp.load(getClass.getResourceAsStream("project.properties"))
    tmp
  }

  lazy val version = properties.getProperty("version")
  lazy val buildDate = properties.getProperty("build-date")
}
