val scala3Version = "3.2.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "tp_funcional",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % "2.0.0",
      "dev.zio" %% "zio-json" % "0.3.0-RC10",
      "io.d11" %% "zhttp" % "2.0.0-RC10",
      "io.getquill" %% "quill-zio" % "4.2.0",
      "org.scalameta" %% "munit" % "0.7.29" % Test
    )

  )
