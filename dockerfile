FROM openjdk:alpine
ARG version=0.0.1-SNAPSHOT
COPY target/subs-eurekaserver-${version}.jar /subs-eurekaserver.jar
ENV JAVA_OPTS ""
ENTRYPOINT java -Djava.security.egd=file:/dev/./urandom $JAVA_OPTS -jar /subs-eurekaserver.jar