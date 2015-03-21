name := "Minicurso Integração Java"

version := "0.1"

scalaVersion := "2.11.6"

lazy val root = (project in file(".")).aggregate(spring)

lazy val spring = ProjectRef(file("spring"),"spring")
