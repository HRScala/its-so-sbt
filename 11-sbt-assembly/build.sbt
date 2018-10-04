version := "0.1.1"

scalaVersion := "2.12.7"

mainClass in assembly := Some("org.hrscala.sbt.Hello")
assemblyJarName in assembly := "hello-assembly-" + version.value + ".jar"
