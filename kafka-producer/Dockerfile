FROM eclipse-temurin:21-jre-alpine
# Install curl
RUN apk add --no-cache curl
ARG JAR_FILE=target/kafka-producer-*.jar
COPY ${JAR_FILE} kafka-producer.jar
EXPOSE 8000
ENTRYPOINT ["java", "-jar", "kafka-producer.jar"]