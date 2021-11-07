FROM openjdk:11
ADD target/spring-boot-sql-docker.jar spring-boot-sql-docker.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "spring-boot-sql-docker.jar"]
