name := "examples"

version := "0.1"

scalaVersion := "2.10.4"

resolvers ++= Seq(
  "snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "releases"  at "http://oss.sonatype.org/content/repositories/releases",
  "bintray/non" at "http://dl.bintray.com/non/maven"
)

libraryDependencies ++= Seq(
  // Main
  "org.scalaz"    %% "scalaz-core"            % "7.1.0",
  "org.scalaz"    %% "scalaz-effect"          % "7.1.0",
  "org.scalaz"    %% "scalaz-concurrent"      % "7.1.0",
  "io.argonaut"   %% "argonaut"               % "6.0-M3",
  "org.scala-stm" %% "scala-stm"              % "0.7",
  // Test
  "org.scalacheck" %% "scalacheck" % "1.10.0" % "test",
  "org.specs2"     %% "specs2"     % "1.13"   % "test"
)

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.5.2")


