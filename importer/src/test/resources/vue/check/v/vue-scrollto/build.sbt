organization := "com.olvind.scalablytyped"
name := "vue-scrollto"
version := "2.7-07ec64"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.olvind.scalablytyped" %%% "std" % "0.0-unknown-0ccee1",
  "com.olvind.scalablytyped" %%% "vue" % "2.5.13-d60248",
  "org.scala-js" %%% "scalajs-dom" % "0.9.5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
        