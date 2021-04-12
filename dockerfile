FROM openjdk:alpine
ARG version=0.0.1-SNAPSHOT
COPY target/subs-userservice-${version}.jar /subs-userservice.jar
ENV JAVA_OPTS ""
ENTRYPOINT java -Djava.security.egd=file:/dev/./urandom $JAVA_OPTS -jar /subs-userservice.jar