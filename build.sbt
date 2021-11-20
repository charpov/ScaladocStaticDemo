ThisBuild / version      := "0.1.0"
ThisBuild / scalaVersion := "3.1.0"

// format: off
lazy val hello = (project in file("."))
   .settings(
     Compile / doc / scalacOptions := Seq(
       "-project", "The Name of My Project",
       "-project-version", version.value,
       "-project-footer", "text that appears in the footer",
       "-siteroot", "./site",
       "-doc-root-content", "./api.md",
       "-author",
       "-groups",
        "-external-mappings:.*scala.*::scaladoc3::https://scala-lang.org/api/3.x/," +
           ".*java.*::javadoc::https://docs.oracle.com/en/java/javase/11/docs/api/java.base/",
        "-source-links:github://charpov/ScaladocStaticDemo/main",
     )
   )
