# Use Java 17 base image
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copy the Spring Boot jar
COPY target/cms-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080 (Render uses $PORT)
EXPOSE 8080

# Run the jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
