name := "BD_SCA_XML_Processer.git"
scalaVersion := "2.10.6"
organization := "everis"

resolvers += "repository cloudera" at "https://repository.cloudera.com/artifactory/cloudera-repos/"
resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

// libraryDependencies += "org.apache.spark" %% "spark-sql" % "1.6.0"

// https://mvnrepository.com/artifact/org.scala-lang/scala-library
libraryDependencies += "org.scala-lang" % "scala-library" % "2.10.6"
// https://mvnrepository.com/artifact/org.scala-lang/scala-reflect
libraryDependencies += "org.scala-lang" % "scala-reflect" % "2.10.6"
// https://mvnrepository.com/artifact/org.scala-lang/scala-compiler
libraryDependencies += "org.scala-lang" % "scala-compiler" % "2.10.6"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.2.1"

// https://mvnrepository.com/artifact/org.scalatest/scalatest_2.10
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"
// https://mvnrepository.com/artifact/org.scala-lang.modules/scala-xml_2.11
// libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.0.5"

// https://mvnrepository.com/artifact/org.apache.spark/spark-core_2.10
libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.0-cdh5.8.2"
// https://mvnrepository.com/artifact/org.apache.spark/spark-sql_2.10
libraryDependencies += "org.apache.spark" %% "spark-sql" % "1.6.0-cdh5.8.2"
// https://mvnrepository.com/artifact/org.apache.spark/spark-hive_2.10
libraryDependencies += "org.apache.spark" %% "spark-hive" % "1.6.0-cdh5.8.2"
// https://mvnrepository.com/artifact/org.apache.hadoop/hadoop-client
// libraryDependencies += "org.apache.hadoop" %% "hadoop-client" % "2.6.0-mr1-cdh5.8.2"

// libraryDependencies += "com.datastax.spark" % "spark-cassandra-connector_2.10" % "1.6.0"

//libraryDependencies += "org.specs2" % "specs2" % "2.3.4"
//libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0"
