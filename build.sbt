name := "play_scalikejdbc_handson"
 
version := "1.0" 
      
lazy val `play_scalikejdbc_handson` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
      
scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  jdbc,
  ehcache,
  ws,
  specs2 % Test,
  guice,
  "org.scalikejdbc" % "scalikejdbc_2.12" % "3.1.0",
  "org.scalikejdbc" % "scalikejdbc-config_2.12" % "3.1.0",
  "org.scalikejdbc" % "scalikejdbc-play-initializer_2.12" % "2.6.0",
  "mysql" % "mysql-connector-java" % "6.0.6")

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

      