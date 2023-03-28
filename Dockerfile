
FROM amazoncorretto:11-alpine-jdk
MAINTAINER NAH
COPY target/BackEnd-0.0.1-SNAPSHOT.jar  nicoh-app.jar
ENTRYPOINT ["java","-jar","/nicoh-app.jar"]
EXPOSE 8080