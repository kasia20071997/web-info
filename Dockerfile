FROM openjdk:17-jdk-alpine
COPY build/libs/web-info-0.0.1-SNAPSHOT.jar app/web-info-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "app/web-info-0.0.1-SNAPSHOT.jar"]