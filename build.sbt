name := """empty-play-application"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

resolvers += "Spring Snapshots" at "http://maven.springframework.org/snapshot"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "com.oracle" % "ojdbc6" % "11.2.0.4.0",
  "org.hibernate" % "hibernate-entitymanager" % "5.0.1.Final",
  "org.hibernate" % "hibernate-java8" % "5.0.1.Final",
  "org.springframework.data" % "spring-data-jpa" % "1.9.0.RELEASE",
  "org.springframework" % "spring-context" % "4.2.2.RELEASE",
  "org.springframework" % "spring-context-support" % "4.2.2.RELEASE",
  "org.springframework" % "spring-expression" % "4.2.2.RELEASE",
  "org.springframework.guice" % "spring-guice" % "1.0.0.BUILD-SNAPSHOT"
)

fork in run := false