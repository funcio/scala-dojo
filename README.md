scala-dojo
==========

Scala base project for coding dojos.

It is configured to use:

sbt version 0.11.2
scala 2.9.1
scalaTest 1.7.1

It is configured with eclipse and idea plugins so that you can generate a project for your favorite IDE:

	sbt gen-idea ; Generates an idea project

	sbt eclipse	; Generates an eclipse project


In order to run the tests continuously you must execute:

	sbt ~test