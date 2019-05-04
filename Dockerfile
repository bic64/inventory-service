FROM openjdk:12-jdk

EXPOSE 8080

ADD ./application/build/libs/application.jar /usr/local/inventory-service/


CMD ["java"\
,"-jar" \
,"/usr/local/inventory-service/application.jar"\
]

