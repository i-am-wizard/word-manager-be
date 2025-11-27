FROM gradle:8.14.2-jdk17 as builder
COPY --chown=gradle:gradle backend /home/gradle/project
WORKDIR /home/gradle/project
RUN gradle build --no-daemon

FROM amazoncorretto:17-alpine
COPY --from=builder /home/gradle/project/build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
