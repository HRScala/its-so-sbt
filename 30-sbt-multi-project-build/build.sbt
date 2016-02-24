lazy val commonSettings = Seq(
  organization := "org.hrscala.sbt"
  , version := "0.0.1"
  , scalaVersion := "2.11.7"
)

lazy val api = (project in file("api")).
  settings(commonSettings: _*).
  settings(
    // other settings
  )

lazy val core = (project in file("core")).
  settings(commonSettings: _*).
  settings(
    // other settings
  ) dependsOn api


lazy val root = (project in file(".")).aggregate(api, core)