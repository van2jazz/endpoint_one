FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar endpoint-1.jar
ENTRYPOINT ["java","-jar","/endpoint-1.jar"]
EXPOSE 8080