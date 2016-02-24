Run app by manual choice:

    sbt run

Run the app via explicit main method:

    sbt 'runMain org.hrscala.sbt.Two'

Clean everything, compile sources and package dependencies in an executable bundle:

    sbt clean packArchiveZip

Run the app without sbt:

    unzip target\root-10-sbt-pack-0.1-SNAPSHOT.zip
    cd root-10-sbt-pack-0.1-SNAPSHOT/bin
    ./one
    ./two
