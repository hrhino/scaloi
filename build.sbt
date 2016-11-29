enablePlugins(DERepositories)

normalizedName := "scaloi"
name := "ScaLOI"
description := "Generic Functional Data Structures from Learning Objects"

resolvers in ThisBuild += Resolver.sonatypeRepo("releases")

lazy val scaloiz = (project in file("scaloiz"))
  .enablePlugins(DECommonSettings)
  .settings(
    addCompilerPlugin("org.spire-math" % "kind-projector" % "0.9.3" cross CrossVersion.binary),
    normalizedName := "scaloiz",
    name := "ScaloiZ",
    description := "Functional bells and whistles for ScalaZ",
    libraryDependencies ++= Seq(
      ScalaZ.core,
      ScalaZ.concurrent,
      ScalaZ.stream,
      Testing.scalaTest % "test"
    )
  )
