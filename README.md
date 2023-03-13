# SBT-Assignment
This repository is for SBT Assignment

# Steps To Add dependencies & to create multi module etc.
**Step 1:** Open INtellij Idea and after that click on new project enter the name of the project **sbt-assignment** and select sbt and scala.
**Step 2:** It took some time to load the project structure and after that open the **build.sbt file.**
**Step 3:** After that** add** the **dependencies in build.sbt** by using latestDependencies and assign the artifactid, groupid,version and scope of dependencies.
  # Example libraryDependencies += "joda-time" % "joda-time" % "2.12.2"
**Step 4:** Now inside the build.sbt write the code to create two module and inside id define the name of module, version etc. 
 # example 
 lazy val core = (project in file("core"))
  .settings(
    name := "core",
    version := "1.0.0",
    scalaVersion := "2.13.8",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % "test",
    unmanagedClasspath in Compile ++= (fullClasspath in utils in Compile).value
  )
  
 Step 5: Inside the **core module(above) add the scalatest dependencies **
 
 # To add plugin in scala
**Step 1:** Right click on the Project directory of your project(ex: sbt-assignment).
**Step 2:** After that click New->File and give the file name plugins.sbt and inside that sbt file add the scalastyle plugin by using addSbtPlugin and inside it define the groupid, artifactid, version etc.
**Step 3:** After that run the sbtGenerateConfig in terminal to generate the scala-style-config.xml file. It holds all the warning. 
**Step 4:** After adding the plugin add the class path of util module on core module. For that open the root built.sbt file and where you define the core module after that use .dependsOn(utils)
**Step 5:** Now manually create the **core/src/main/scala/com.knoldus/Main.scala**. Inside the Main.scala import the util module and create instance of util class.
**Step 6:** After doing all the process click on sbt compile and after that **sbt run** to view the Output.

![Screenshot from 2023-03-13 23-37-41](https://user-images.githubusercontent.com/124979629/224790383-9b44217b-9f53-4cfb-bfa7-50c9a45d987d.png)



# OUTPUT
![Screenshot from 2023-03-13 23-34-53](https://user-images.githubusercontent.com/124979629/224789925-1643f8b1-b6cf-41df-9b8e-66e295c2627a.png)
