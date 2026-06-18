FROM eclipse-temurin:8-jre-alpine

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app.jar

EXPOSE 8881
ENTRYPOINT ["java","-jar","/app.jar"]

