FROM openjdk:alpine
ARG version=0.0.1-SNAPSHOT
COPY target/subs-configservice-${version}.jar /subs-configservice.jar
ENV JAVA_OPTS ""
ENTRYPOINT java -Djava.security.egd=file:/dev/./urandom $JAVA_OPTS -jar /subs-configservice.jar