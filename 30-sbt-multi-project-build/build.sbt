lazy val commonSettings = Seq(
  organization := "org.hrscala.sbt"
  , version := "0.0.1"
  , scalaVersion := "2.11.7"
)

lazy val api300 = (project in file("api")).
  settings(commonSettings: _*).
  settings(
    // other settings
  )

lazy val core = (project in file("core")).
  settings(commonSettings: _*).
  settings(
    // other settings
  ) dependsOn api300


lazy val root = (project in file(".")).aggregate(api300, core)
