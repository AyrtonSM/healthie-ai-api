FROM openjdk:21
MAINTAINER linkidtechnologies.io
COPY target/healthie-0.0.1-SNAPSHOT.jar healthie-server-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","healthie-server-SNAPSHOT.jar"]