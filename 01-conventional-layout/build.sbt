crossScalaVersions := Seq("2.11.7", "2.10.6")
scalaVersion := crossScalaVersions.value.head

libraryDependencies ++= Seq(
  "com.github.nscala-time" %% "nscala-time" % "2.10.0"

, CrossVersion.partialVersion(scalaVersion.value) match {
    case Some((2, 11)) =>
      "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.3-1"
    case Some((2, _)) =>
      "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.3"
    case _ =>
      sys.error("Unsupported scala version: " + scalaVersion.value)
  }

, "org.specs2" %% "specs2-scalacheck" % "3.7.1" % "test"
)

