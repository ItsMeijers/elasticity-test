name := """TestApp"""
organization := "ItsMeijers"
version := "0.1"

scalaVersion := "2.11.8"

val akkaVersion = "2.4.3"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor"        % akkaVersion,
  "com.typesafe.akka" %% "akka-http-core"    % akkaVersion,
  "com.typesafe.akka" %% "akka-http-testkit" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit"      % akkaVersion % "test",
  "org.scalatest"     %% "scalatest"         % "2.2.6"     % "test",
  "org.typelevel"     %% "cats"              % "0.4.1")
