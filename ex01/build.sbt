ThisBuild / scalaVersion := "2.13.6"
ThisBuild / organization := "me.kickscar"

lazy val ex01 = (project in file("."))
  .settings(
    name := "ex01"
  )