val hyperCounterStart = settingKey[Int]("Start value of hyper counter.")
val incHyperCounter = taskKey[Unit]("Increate hyper counter.")
val hyperCounter = taskKey[Int]("Get current value of hyper counter.")

scalaVersion := "2.11.7"
