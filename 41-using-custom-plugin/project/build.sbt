lazy val root = project in file(".") dependsOn(ProjectRef(file("../../40-custom-plugin"), "root-40-custom-plugin"))
