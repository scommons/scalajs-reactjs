version in ThisBuild := sys.env.getOrElse("version", default = "0.15.0-SNAPSHOT").stripPrefix("v")
