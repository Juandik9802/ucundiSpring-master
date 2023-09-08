# Spring Boot Project with Thymeleaf and Spring Security

![Java](https://img.shields.io/badge/Java-11-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.5.4-brightgreen)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.0.12-blue)
![Spring Security](https://img.shields.io/badge/Spring%20Security-5.5.3-yellow)

This is a sample project built with Spring Boot, Thymeleaf, and Spring Security. It demonstrates the integration of these technologies to create a web application with user authentication and basic role-based authorization.

## Features

- User registration and login functionality.
- Role-based access control using Spring Security.
- Thymeleaf templates for dynamic web page rendering.
- Secure password storage using bcrypt hashing.
- Clean project structure following best practices.
- Demo pages and sample code to get you started quickly.

## Prerequisites

- Java Development Kit (JDK) 11 or higher
- Maven for building the project
- A modern web browser

## Getting Started

1. **Clone the repository:**

   ```bash
   git clone https://github.com/afmirandad/ucundiSpring.git

    Navigate to the project directory:

    bash

cd spring-boot-thymeleaf-security

Build the application:

bash

mvn clean package

Run the application:

bash

    java -jar target/spring-boot-thymeleaf-security.jar

    Access the application:

    Open your web browser and go to http://localhost:8080

Configuration

    Database configuration: Check src/main/resources/application.properties for datasource settings.
    Security configuration: Security settings can be found in src/main/java/com/example/config/SecurityConfig.java.
    Thymeleaf templates: HTML templates using Thymeleaf can be found in the src/main/resources/templates directory.

Usage

    Access the homepage to explore the public content.
    Register a new user account.
    Log in using your registered credentials.
    Access the secured pages and observe role-based access control.

Acknowledgements

This project was inspired by the various Spring Boot, Thymeleaf, and Spring Security tutorials available online. Thanks to the open-source community for their valuable contributions.
License

This project is licensed under the MIT License.
