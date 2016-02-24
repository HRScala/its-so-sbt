import java.util.concurrent.atomic.AtomicInteger

val privateHyperCounter = settingKey[AtomicInteger]("Start value of hyper counter.")
val hyperCounterStart = settingKey[Int]("Start value of hyper counter.")

val incHyperCounter = taskKey[Unit]("Increase hyper counter.")
val hyperCounter = taskKey[Int]("Get current value of hyper counter.")

scalaVersion := "2.11.7"

val commonSettings = Seq(
  privateHyperCounter := {
    new AtomicInteger(hyperCounterStart.value)
  }
, incHyperCounter := {
    privateHyperCounter.value.incrementAndGet
  }
, hyperCounter := {
    privateHyperCounter.value.get
  }
)

val first = (project
  settings(commonSettings)
  settings(
    hyperCounterStart := 1000
  )
)

val second = (project
  settings(commonSettings)
  settings(
    hyperCounterStart := 2000
  )
)
