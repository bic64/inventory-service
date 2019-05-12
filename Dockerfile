FROM openjdk:12-jdk

ENV PORT 8080
ENV DEBUG_PORT 8180

EXPOSE $PORT
EXPOSE $DEBUG_PORT

ADD ./application/build/libs/application.jar /usr/local/inventory-service/

#VOLUME ./application/build/libs/ /usr/local/inventory-service/


CMD java\
 -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:$DEBUG_PORT\
 -Dserver.port=${PORT}\
 -jar\
 /usr/local/inventory-service/application.jar
