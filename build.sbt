ThisBuild / scalaVersion := "2.12.7"
ThisBuild / organization := "com.example"

lazy val hello = (project in file("."))
  .settings(
    name := "Hello",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
    libraryDependencies += "com.github.nscala-time" %% "nscala-time" % "2.24.0"

  )