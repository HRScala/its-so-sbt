Run app by manual choice:

    sbt run

Run the app via explicit main method:

    sbt 'runMain org.hrscala.sbt.Calendar'

Run the test on every change:

    sbt ~test

Run only single test:

    sbt 'testOnly org.hrscala.sbt.CalendarUnitTest'

Run only unit tests:

    sbt 'testOnly *UnitTest'

Run only failed tests:

    sbt 'testQuick'

"Complex" sequence on source change:

    sbt '~; clean; compile; test'

Inspect dependencies:

    sbt dependencyTree
    sbt test:dependencyBrowseGraph
