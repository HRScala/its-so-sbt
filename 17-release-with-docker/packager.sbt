enablePlugins(JavaAppPackaging)
dockerBaseImage := "anapsix/alpine-java:jdk8"
dockerExposedPorts := Seq(8080)
dockerUpdateLatest := true
