FROM eclipse-temurin:21-jre-alpine
# Install curl
RUN apk add --no-cache curl
ARG JAR_FILE=target/kafka-consumer-*.jar
COPY ${JAR_FILE} kafka-consumer.jar
EXPOSE 8100
ENTRYPOINT ["java", "-jar", "kafka-consumer.jar"]