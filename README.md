# API Gateway with Spring Cloud Gateway

## Overview
This project sets up an API Gateway using Spring Cloud Gateway to route requests to multiple microservices.

## Services
- **Service A**: Accessible at `http://localhost:8080/service-a`
- **Service B**: Accessible at `http://localhost:8080/service-b`

## Setup
1. Start the Eureka Server.
2. Start Service A and Service B.
3. Start the API Gateway.

## Expected Behavior
- Navigating to `http://localhost:8080/service-a` will return: `Hello from Service A!`
- Navigating to `http://localhost:8080/service-b` will return: `Hello from Service B!`

## Screenshots
- Service A: ![image](https://github.com/user-attachments/assets/494ddc96-50b4-43ae-9964-8c9e8858dc19)
- Service B: ![image](https://github.com/user-attachments/assets/b6d7af7c-ee1d-49a7-a1a1-007dae8892b9)



