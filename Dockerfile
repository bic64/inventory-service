FROM openjdk:10-jdk-slim

EXPOSE 8080

COPY ./application/build/libs/application.jar /usr/local/inventory-service/


CMD ["java"\
,"-jar" \
,"/usr/local/inventory-service/application.jar"\
]

