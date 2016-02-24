import com.github.nscala_time.time.Imports._

version := "1.2.3"

scalaVersion := "2.11.7"

onLoad := {
  val body = "version=%s\nbuild-date=%s" format (version.value, LocalDate.now)

  val propertiesPath = (
    baseDirectory.value
    / "src" / "main" / "resources"
    / "org" / "hrscala" / "sbt"
    / "project.properties"
  )

  IO.write(propertiesPath, body)
  onLoad.value
}
