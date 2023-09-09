FROM openjdk:17
COPY target/ticketapp-integration.jar ticketapp-integration.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","ticketapp-integration.jar"]