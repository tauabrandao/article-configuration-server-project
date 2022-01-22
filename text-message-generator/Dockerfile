FROM openjdk
WORKDIR /application

COPY target/text-message-generator-0.0.1-SNAPSHOT.jar /application/app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]