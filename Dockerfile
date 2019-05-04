FROM openjdk:12-jdk

EXPOSE 8080
EXPOSE 8180

ADD ./application/build/libs/application.jar /usr/local/inventory-service/

#VOLUME ./application/build/libs/ /usr/local/inventory-service/


CMD ["java"\
,"-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:8180"\
,"-jar" \
,"/usr/local/inventory-service/application.jar"\
]

