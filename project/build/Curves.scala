import sbt._

class Curves(info: ProjectInfo) extends DefaultProject(info) {
  //Dependencies
  val scalatest = "org.scalatest" % "scalatest" % "1.2"
  val scalaSwing = "org.scala-lang" % "scala-swing" % "2.8.1"
}
