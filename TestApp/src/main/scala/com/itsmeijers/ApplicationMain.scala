package com.itsmeijers

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.http.scaladsl.server.Directives._
import akka.stream.ActorMaterializer
import scala.concurrent.duration._
import akka.util.Timeout
import akka.pattern.ask
import com.itsmeijers.actors.ResourceStresser

object ApplicationMain extends App {
  implicit val system = ActorSystem("TestAppSystem")
  implicit val actorMaterializer = ActorMaterializer()
  implicit val executionContext = system.dispatcher

  val stressActor = system.actorOf(ResourceStresser.props, "stressActor")

  val route = path("cpu") {
    get {
      implicit val timeout = Timeout(5 seconds)
      complete {
        (stressActor ? ResourceStresser.StressCpu(1, 25, 256)).mapTo[Boolean].map { b =>
          if(b)
            HttpResponse(StatusCodes.OK) // NoContent
          else
            HttpResponse(StatusCodes.BadRequest) // BadRequest
        } recover {
          case te: Exception =>
            HttpResponse(StatusCodes.BadRequest) // BadRequest
        }
      }
    }
  }

  val binding = Http().bindAndHandle(handler = route, "localhost", port = 8080)
  binding onFailure {
    case ex: Exception ⇒
      println("Could not bind!")
  }
  sys.addShutdownHook(system.terminate())

}
