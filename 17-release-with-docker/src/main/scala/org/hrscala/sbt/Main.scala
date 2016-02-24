package org.hrscala.sbt

import akka.actor.ActorSystem
import spray.httpx.PlayTwirlSupport
import spray.routing.SimpleRoutingApp

object Main extends App with SimpleRoutingApp with PlayTwirlSupport {
  implicit val system = ActorSystem("release-with-docker")

  startServer(interface = "0.0.0.0", port = 8080) {
    get {
      path("hello") {
        complete {
          html.MainTemplate("Ivan" :: "Marko" :: Nil)
        }
      }
    }
  }
}
