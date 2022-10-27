# PHOTO APP API USERS 

## EUREKA MICROSERVICE
https://www.udemy.com/course/spring-boot-microservices-and-spring-cloud/learn/lecture/13232922#content

First, I recomend to run the eureka server, here is the project with their configuration.

Eureka discovery server (https://github.com/arnoldmartinez/photo-app-discovery-service)

## Terminal

To run the project from the terminal type hint the following commands

>     mvn spring-boot:run -Dspring-boot.run.arguments=--spring.application.instance_id=sergey

>.    mvn spring-boot:run -Dspring-boot.run.arguments=--spring.application.instance_id=sergey2,--server.port=8999
- or mvn spring-boot:run -Dspring-boot.run.arguments="--spring.application.instance_id=sergey2 --server.port=8999"

If you use h2 database you can come into the interface from your browser at the following URL http://localhost:{{PORT}}/users-ws/h2-console, 
the port on the URL is the API gateway (https://github.com/arnoldmartinez/photo-app-api-zuul-api)

In the h2 database login put:

- "Saved Settings": "Generic H2 (Embeded)"
- "Setting Name":   "Generic H2 (Embeded)"
- "Driver Class":   "org.h2.Driver"
- "JDBC URL":       "jdbc:h2:mem:testdb"
- "User Name":      "sa"
- "Password":




