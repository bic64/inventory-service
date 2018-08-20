FROM openjdk:10-jdk-slim

EXPOSE 8081:8080

COPY ./build /usr/local/inventory-service/
COPY ./gradlew /usr/local/inventory-service/


WORKDIR /usr/local/inventory-service/
#RUN ["./gradlew", "clean", "build"]

#ENTRYPOINT ["/usr/local/inventory-service"]
CMD ["./gradlew", "application:bootrun"]
#
#CMD ["./gradlew", "application:bootrun"]

