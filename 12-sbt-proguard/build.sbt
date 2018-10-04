name := "profi"
version := "0.1.2"

scalaVersion := "2.12.7"

enablePlugins(SbtProguard)
proguardVersion in Proguard := "5.3"
proguardOptions in Proguard ++= Seq("-dontnote", "-dontwarn", "-ignorewarnings")
proguardOptions in Proguard += ProguardOptions.keepMain("org.hrscala.sbt.Hello")

/* TODO
proguardOptions in Proguard := {
  val programVer = version.value
  val scalaVer = scalaVersion.value
  val scalaBinVer = scalaBinaryVersion.value

  val baseDir = baseDirectory.value
  val binaryDeps = (proguardBinaryDeps in Proguard).value

  // read lib path from binary relations, failover to default Ivy cache location
  val scalaJarName = s"scala-library-${scalaVer}.jar"
  val scalaJarFile = binaryDeps find(_.name == scalaJarName) getOrElse (
    Path.userHome / s"/.ivy2/cache/org.scala-lang/scala-library/jars/${scalaJarName}"
  )

  // Try javaHome, then runtime JVM
  val jreMin = (javaHome.value).getOrElse(
    new File(sys.props("java.home"))
  )

  val runtimeCandidates = Seq("/jre/lib/rt.jar", "/lib/rt.jar") map { jreMin / }
  var runtimeJar = runtimeCandidates find { _.exists } getOrElse {
    sys.error("Could not locate runtime jar in path: " + jreMin)
  }

  val jarName = s"profi_${scalaBinVer}-${programVer}.jar"
  val inJar = s"${baseDir}/target/scala-${scalaBinVer}/${jarName}"
  val outJar = s"${baseDir}/target/scala-${scalaBinVer}/proguard/${jarName}"

  s"""
-injars '${inJar}'
-target 1.8
-libraryjars '${runtimeJar}'
-libraryjars '${scalaJarFile}'
-outjars '${outJar}'
-dontobfuscate
-optimizationpasses 32
-keep class org.hrscala.sbt.** { *; }
""".trim.split("\n")
}
*/
