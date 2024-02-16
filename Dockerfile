FROM openjdk:11
WORKDIR /app
COPY target/scientific-calculator-with-dependencies.jar /app/
# docker exec -it <container-id> /bin/bash    -- to run the container
# java -cp ScientificCalculator-1.0-SNAPSHOT.jar org.example.Main       -- to run the jar file