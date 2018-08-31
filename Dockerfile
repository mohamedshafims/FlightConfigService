FROM openjdk:8-jre-alpine
COPY ./target/ConfigFlightService-0.0.1-SNAPSHOT.jar /usr/src/configservice/
WORKDIR /usr/src/configservice/
EXPOSE 9002
CMD ["java","-jar","ConfigFlightService-0.0.1-SNAPSHOT.jar"]