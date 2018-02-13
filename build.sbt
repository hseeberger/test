val akkaVersion = "2.5-20180202-180000"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion
)

resolvers += "Akka Snapshots" at "https://repo.akka.io/snapshots/"
