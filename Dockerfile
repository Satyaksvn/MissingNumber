# Use the OpenJDK 17 base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY Untitled.jar /app/Untitled.jar

# Define the entry point to run the JAR file
CMD ["java", "-jar", "/app/Untitled.jar"]
