lazy val defaultSettings = Seq(
  organization := "org.hrscala.sbt",
  version := "0.3.0",
  scalaVersion := "2.12.7",
)

lazy val api = project settings(defaultSettings: _*)
lazy val core = project settings(defaultSettings: _*) dependsOn api

lazy val root = project in file(".") settings (defaultSettings: _*)
