FROM eclipse-temurin:21
ADD target/sprindockkube-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 1122
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]