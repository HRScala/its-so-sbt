version := "0.0.2"

scalaVersion := "2.12.7"

libraryDependencies ++= Seq(
  "com.github.nscala-time" %% "nscala-time" % "2.20.0",

  "org.specs2" %% "specs2-scalacheck" % "4.3.4" % Test,
)
