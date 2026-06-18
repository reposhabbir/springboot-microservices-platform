FROM eclipse-temurin:8-jre-alpine

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app.jar

EXPOSE 8885
ENTRYPOINT ["java","-jar","/app.jar"]

