sbtPlugin := true

organization := "org.hrscala.sbt"
version := "0.0.3"

lazy val project = Project("youll-never-catch-me-alive", file("."))

libraryDependencies += "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.3"
