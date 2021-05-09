FROM amazoncorretto:11.0.10-alpine
VOLUME /tmp
WORKDIR .
COPY build/libs/*.jar service-registry.jar
RUN rm -rf /var/lib/apt/lists/*
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=prod", "service-registry.jar"]