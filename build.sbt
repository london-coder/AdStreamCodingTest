name := "AdStreamTest"

scalaVersion := "2.11.8"

scalacOptions += "-feature"

fork in (Test, run) := true

javaOptions in (Test, run) += "-Xmx8G"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.3" % "test"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.3" % "test"


