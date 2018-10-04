version := "0.1.0"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "io.monix" %% "monix"      % "2.3.3",
  "io.kamon" %% "kamon-core" % "1.1.0",
)

enablePlugins(PackPlugin)
