import sbt._

object Dependencies {
    /* Versions
     */
    lazy val akkaVersion = "2.5.0"
    lazy val testVersion = "3.0.1"
    lazy val configVersion = "1.3.1"
    lazy val mongoVersion = "3.1.1"

    /* Libraries
     */
    lazy val scalaTest = "org.scalatest" %% "scalatest" % testVersion
    lazy val akkaActor = "com.typesafe.akka" %% "akka-actor" % akkaVersion
    lazy val tsConfig = "com.typesafe" % "config" % configVersion
    lazy val mongoDb = "org.mongodb" %% "casbah" % mongoVersion
}
