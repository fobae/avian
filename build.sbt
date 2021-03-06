import Dependencies._
import org.scoverage.coveralls.Imports.CoverallsKeys._

/* Global configuration */
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.avian",
      scalaVersion := "2.12.2",
      version      := "0.1.0"
    )),
    name := "avian",
      libraryDependencies ++= Seq(
          scalaTest % Test,
          tsConfig,
          akkaActor,
          mongoDb
      )
  )

/* Code coverage configuration */
coverageMinimum := 70
coverageFailOnMinimum := false
coverageHighlighting := true
coverallsTokenFile := Some("src/main/resources/token.txt")
