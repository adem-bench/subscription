FROM openjdk:alpine
ARG version=0.0.1-SNAPSHOT
COPY target/subs-emailservice-${version}.jar /subs-emailservice.jar
ENV JAVA_OPTS ""
ENTRYPOINT java -Djava.security.egd=file:/dev/./urandom $JAVA_OPTS -jar /subs-emailservice.jar