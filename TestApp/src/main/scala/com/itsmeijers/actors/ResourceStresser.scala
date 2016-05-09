package com.itsmeijers.actors

import akka.actor._
import ResourceStresser._
import com.itsmeijers.utils.Stress.stress

class ResourceStresser extends Actor with ActorLogging {
  def receive = {
    case StressCpu(n, p, vm) =>
      val result = stress(n, p, vm)
      println(result)
      // analyzeResult(result) :: Boolean
      sender() ! true
    case unknown =>
      println("Something unkown!")
  }
}

object ResourceStresser {
  def props = Props(classOf[ResourceStresser])

  sealed trait ResourceStresserMessage

  case class StressCpu(
    numberOfCpu: Int,
    percentageUsageCpu: Int,
    virtualMemory: Int) extends ResourceStresserMessage

}
