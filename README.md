# Spring Multi-Module Project

This project demonstrates how to create a multi-module project using Maven to create two Spring Boot application and one shared library.

## Project Structure

The project is structured as follows:

```
spring-multi-module
├── app-admin
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── example
│   │   │   │           └── admin
│   │   │   │               ├── ApplicationAdmin.java
│   │   │   │               └── controller
│   │   │   │                   └── HelloController.java
│   │   │   └── resources
│   │   │       └── application.properties
│   │   └── test
│   │       └── java
│   └── pom.xml
├── app-client
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── example
│   │   │   │           └── appclient
│   │   │   │               ├── ApplicationClient.java
│   │   │   │               └── controller
│   │   │   │                   └── HelloController.java
│   │   │   └── resources
│   │   │       └── application.properties
│   │   └── test
│   │       └── java
│   └── pom.xml
├── lib-shared
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── example
│   │   │   │           └── sharedlibrary
│   │   │   │               └── service
│   │   │   │                   └── xxxService.java
│   │   └── resources
│   ├── test
│   |   └── java
|   |      └── com
|   |          └── example
|   |              └── sharedlibrary
|   |                  ├── config
|   |                  │   └── TestConfig.java
|   |                  └── service
|   |                      └── xxxServiceTest.java
|   |
│   └── pom.xml
└── pom.xml
```

## Getting Started

All the commands below should be run from the root of the project.

1. Clone this repository

2. Run the following command to build the project:

```bash
mvn clean compile
```

3. Run the following command to run the `app-admin` application:

```bash
mvn -pl app-admin spring-boot:run
```

4. Run the following command to run the `app-client` application:

```bash
mvn -pl app-client spring-boot:run
```

