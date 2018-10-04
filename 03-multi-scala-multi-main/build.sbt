verion := "0.0.3"

crossScalaVersions := Seq(/* "2.12.7", */ "2.11.12", "2.10.7")
scalaVersion := crossScalaVersions.value.head

libraryDependencies ++= Seq(
  "com.github.nscala-time" %% "nscala-time" % "2.20.0",

  CrossVersion.partialVersion(scalaVersion.value) match {
    case Some((2, 11)) =>
      "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.3-1"
    case Some((2, 10)) =>
      "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.3"
    case _ =>
      sys.error("Unsupported scala version: " + scalaVersion.value)
  },
)
