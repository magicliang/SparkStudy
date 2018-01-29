import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.magicliang",
      // 高版本的 scala 仓库里下载不到这个 spark-sql 模块
      scalaVersion := "2.11.8",
      version      := "0.1"
    )),
    name := "first-application",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.1"
  )

//name := "first-application"
//
//version := "0.1"
//
//scalaVersion := "2.11.8"
//
//libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.1"
