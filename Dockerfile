# Use a base image with Java 11
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot JAR file into the container
COPY target/hello-world-0.0.1-SNAPSHOT.jar /app/hello-world-0.0.1-SNAPSHOT.jar

# Expose port 7000 for the application
EXPOSE 7000

# Command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "hello-world-0.0.1-SNAPSHOT.jar"]
