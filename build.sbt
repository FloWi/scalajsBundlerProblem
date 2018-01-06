enablePlugins(ScalaJSPlugin,ScalaJSBundlerPlugin)
/*enablePlugins(ScalaJSPlugin)*/

name := "Scala.js Tutorial"
scalaVersion := "2.12.2" // or any other Scala version >= 2.10.2

scalaJSUseMainModuleInitializer := true

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.1",
  "org.plotly-scala" %%% "plotly-render" % "0.3.3"
)

npmDependencies in Compile += "plotly.js" -> "1.24.1"
