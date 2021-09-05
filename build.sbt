ThisBuild / scalaVersion := "2.13.6"
ThisBuild / organization := "com.example"

lazy val ex01 = (project in file("./ex01"))
  .settings(
    name := "ex01",
    libraryDependencies += "com.typesafe.play" %% "play-json" % "2.9.2",
    libraryDependencies += "com.eed3si9n" %% "gigahorse-okhttp" % "0.5.0",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % Test
  )