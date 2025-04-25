
# Build stage (keep your existing)
FROM maven:3.9.6-eclipse-temurin-21 AS builder
WORKDIR /build
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn clean package -DskipTests

# Runtime stage - MODIFIED
FROM maven:3.9.6-eclipse-temurin-21
WORKDIR /app

# Install ping utility
RUN apt-get update && apt-get install -y iputils-ping && rm -rf /var/lib/apt/lists/*

COPY --from=builder /build/target/*.jar /app/app.jar
COPY --from=builder /build/src /app/src
COPY --from=builder /build/pom.xml /app/
COPY --from=builder /build/target /app/reports
