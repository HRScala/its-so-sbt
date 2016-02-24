name := "release-with-docker"
scalaVersion := "2.11.7"
version := "1.0.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.12",
  "io.spray" %% "spray-can" % "1.3.3",
  "io.spray" %% "spray-routing" % "1.3.3"
)

enablePlugins(SbtTwirl)
