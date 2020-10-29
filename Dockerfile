FROM openjdk:11

#ARG JAR_FILE=target/*.jar
COPY target/spring-cloud-kubernetes-poc-0.0.1-SNAPSHOT.jar  app/app.jar



ENTRYPOINT ["java","-jar","/app/app.jar"]