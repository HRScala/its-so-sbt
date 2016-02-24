Run app by manual choice:

    sbt run

Run the app via explicit main method, for cross Scala versions:

    sbt '+runMain org.hrscala.sbt.Main'

Run the test on every change:

    sbt ~test

Combine continuous testing with cross versions:

    sbt '~+testOnly org.hrscala.sbt.MathTest'

"Complex" sequence on source change:

    sbt '~; clean; compile; test'

Inspect dependencies:

    sbt dependencyGraph
    sbt dependencyBrowseGraph
