FROM maven:3.8.4-openjdk-11-slim AS builder
WORKDIR /app
COPY . .
RUN mvn clean package -Dmaven.test.skip

FROM amazoncorretto:11
COPY --from=builder /app/target/soap-cxf-example-1.0-SNAPSHOT-shaded.jar app.jar
EXPOSE 8000
ENTRYPOINT ["java", "-jar", "app.jar"]