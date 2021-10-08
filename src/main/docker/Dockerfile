FROM maven:3.6.3-openjdk-11-slim as builder

RUN apt-get update && apt-get install -y iputils-ping

ARG JAR_FILE=*.jar
ADD ${JAR_FILE} app.jar

#ENV JAVA_OPTS=""
#ENV RABBITMQ_URL=""
#ENV RABBITMQ_PORT=""
#ENV RABBITMQ_USER=""
#ENV RABBITMQ_PASS=""
#ENV SPRING_PROFILES_ACTIVE=""

ENV SPRING_PROFILES_ACTIVE=""

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar","--spring.profiles.active=${SPRING_PROFILES_ACTIVE}"]
