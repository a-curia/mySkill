FROM openjdk:8-jre-alpine
MAINTAINER dbbyte.com
ADD target/app-myskill.jar myskill.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar","/myskill.jar"]