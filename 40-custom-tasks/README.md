There are two projects in this build:
    sbt first/run
    sbt second/run

There is a "hyperCounter" available for our incrementing needs.
This is a per-project-setting:

    sbt
    first/incHyperCounter
    first/incHyperCounter
    show first/hyperCounter
    show second/hyperCounter
