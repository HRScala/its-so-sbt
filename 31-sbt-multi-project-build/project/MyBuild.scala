import sbt._
import Keys._

trait Default {
  lazy val defaultSettings = Seq(
    organization := "org.hrscala.sbt"
    , version := "0.0.1"
    , scalaVersion := "2.11.7"
  )
}

object MyBuild extends Build with Default {

  lazy val api = Project(
    "api"
    , file("api")
    , settings = defaultSettings
  )

  lazy val core = Project(
    "core"
    , file("core")
    , settings = defaultSettings
  ) dependsOn api

  lazy val root = project in file(".") settings (defaultSettings: _*)
}
