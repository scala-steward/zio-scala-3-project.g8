addSbtPlugin("com.github.sbt"            % "sbt-native-packager"    % "1.10.0")
addSbtPlugin("org.typelevel"             % "sbt-tpolecat"           % "0.5.1")
addSbtPlugin("org.scalameta"             % "sbt-scalafmt"           % "2.5.2")
addSbtPlugin("org.jmotor.sbt"            % "sbt-dependency-updates" % "1.2.9")
addSbtPlugin("nl.gn0s1s"                 % "sbt-dotenv"             % "3.0.0")
addSbtPlugin("org.wartremover"           % "sbt-wartremover"        % "3.1.8")
addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8"             % "0.16.2")
libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value
