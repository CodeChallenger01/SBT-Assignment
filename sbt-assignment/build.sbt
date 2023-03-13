ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "sbt-assignment"
  ).dependsOn(utils)

//Added the dependencies JDBC, JODA-TIME, SCALATEST, CACHED RESOLUTION FEATURE
libraryDependencies += "io.snappydata" % "snappydata-jdbc_2.11" % "1.2.0"
libraryDependencies += "joda-time" % "joda-time" % "2.12.2"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % "test"
updateOptions := updateOptions.value.withCachedResolution(true)


//Created two module with scalatest dependencies in core module
lazy val core = (project in file("core"))
  .settings(
    name := "core",
    version := "1.0.0",
    scalaVersion := "2.13.8",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % "test",
    unmanagedClasspath in Compile ++= (fullClasspath in utils in Compile).value,
//    libraryDependencies += "org.knoldus" %% "utils" % "1.0.0" % "compile"
  )
  .dependsOn(utils)

lazy val utils = (project in file("utils"))
  .settings(
    name := "utils",
    version := "1.0.0",
    scalaVersion := "2.13.8"
  )