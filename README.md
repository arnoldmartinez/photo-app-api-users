# PHOTO APP API USERS 

## EUREKA MICROSERVICE
https://www.udemy.com/course/spring-boot-microservices-and-spring-cloud/learn/lecture/13232922#content

First, I recomend to run the eureka server, here is the project with their configuration.

Eureka discovery server (https://github.com/arnoldmartinez/photo-app-discovery-service)

## Terminal

To run the project from the terminal type hint the following commands

- mvn spring-boot:run -Dspring-boot.run.arguments=--spring.application.instance_id=sergey
- mvn spring-boot:run -Dspring-boot.run.arguments=--spring.application.instance_id=sergey2,--server.port=8999
- or mvn spring-boot:run -Dspring-boot.run.arguments="--spring.application.instance_id=sergey2 --server.port=8999"