## Sample RabbitMq Consumer
This project presents a way to use RabbitMq as a message consumer with Spring Boot

Technologies used: Java, Spring Boot, Maven, Swagger, Lombok, RabbitMq

Producer project: ([Link](https://github.com/ronaldofjc/spring-rabbit-producer))


## Pre-Requires

- JDK 11
- Maven 3
- Docker

## RabbitMq on Docker
```shell script
  $ docker run -d --hostname localhost --name local-rabbit -p 15672:15672 -p 5672:5672 rabbitmq:3-management
```

## Swagger
- The generated swagger html page is available in the following address
```
    http://localhost:8081/swagger-ui.html
```

## Application Commands

- Compile project
```shell script
  mvn compile
```

- Clear target directory
```shell script
  mvn clean
```

- Start project
```shell script
  mvn spring-boot:run
```

- Install packages
```shell script
  mvn install
```