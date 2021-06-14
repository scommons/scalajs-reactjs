version in ThisBuild := sys.env.getOrElse("version", default = "0.16.0-SNAPSHOT").stripPrefix("v")
