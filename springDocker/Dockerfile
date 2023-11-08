FROM openjdk:17-alpine
EXPOSE 8096
COPY target/*.jar crud.jar
ENTRYPOINT ["java","-jar","/crud.jar"]