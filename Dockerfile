
FROM amazoncorretto:11-alpine-jdk
MAINTAINER NicoH
COPY target/BackEnd-0.0.1-SNAPSHOT.jar  NicoH-app.jar
ENTRYPOINT ["java","-jar","/NicoH-app.jar"]