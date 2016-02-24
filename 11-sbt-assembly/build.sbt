version := "0.0.1"

scalaVersion := "2.11.7"

mainClass in assembly := Some("org.hrscala.sbt.Hello")
assemblyJarName in assembly := "hello-assembly-" + version.value + ".jar"
