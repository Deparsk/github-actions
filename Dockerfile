FROM openjdk:17

COPY target/cicd-github.jar .

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "cicd-github.jar"]