FROM openjdk:8
EXPOSE 8080
ADD target/cicd-github-actions cicd-github-actions.jar
ENTRYPOINT ["java", "-jar", "/cicd-github-actions.jar"]