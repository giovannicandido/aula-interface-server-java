name := "Spring Boot Web"

version := "1.0"

scalaVersion := "2.11.6"

seq(webSettings : _*)

mainClass := Some("minicurso.AppConfig")

val tomcatVersion = "7.0.59"
val springBootVersion = "1.1.11.RELEASE"

libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot-starter-web" % springBootVersion,
  "org.springframework.boot" % "spring-boot-starter-data-jpa" % springBootVersion,
  "org.springframework" % "springloaded" % "1.2.0.RELEASE",
  "org.webjars" % "bootstrap" % "3.1.1",
  "org.webjars" % "jquery" % "2.1.0-2",
  "org.thymeleaf" % "thymeleaf-spring4" % "2.1.2.RELEASE",
  "org.hibernate" % "hibernate-validator" % "5.0.2.Final",
  "nz.net.ultraq.thymeleaf" % "thymeleaf-layout-dialect" % "1.2.1",
  "org.hsqldb" % "hsqldb" % "2.3.1",
  "org.springframework.boot" % "spring-boot-starter-tomcat" % springBootVersion % "provided",
  "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided"
)


libraryDependencies ++= Seq(
  "org.apache.tomcat.embed" % "tomcat-embed-core"         % tomcatVersion % "container",
  "org.apache.tomcat.embed" % "tomcat-embed-logging-juli" % tomcatVersion % "container",
  "org.apache.tomcat.embed" % "tomcat-embed-jasper"       % tomcatVersion % "container"
)
