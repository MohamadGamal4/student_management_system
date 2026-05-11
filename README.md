# Student Management System API

A robust RESTful API built with Java and Spring Boot to manage student records. This project demonstrates a clean, layered architecture (Controller, Service, Repository) and uses modern practices for data mapping and persistence.

## Tech Stack
* Java 21
* Spring Boot 3 (Web, Data JPA)
* PostgreSQL (Dockerized)
* MapStruct (for object mapping)
* Lombok (to reduce boilerplate)
* Swagger/OpenAPI (for API documentation)
* Docker & Docker Compose

## Key Features
* Full CRUD Operations: Create, Read, Update, and Delete student records.
* DTO Pattern: Decoupled internal entities from API payloads using request/response DTOs.
* Automated Mapping: Utilized MapStruct for safe and fast mapping between Entities and DTOs.
* Containerized Database: Simple and fast database setup using Docker Compose.
* Auto-generated Documentation: Accessible API testing and documentation via Swagger UI.

## Getting Started

### Prerequisites
* Java 21+ installed
* Docker and Docker Compose installed
* Maven (or use the provided mvnw wrapper)

### Installation & Running

1. Start the PostgreSQL database:
   docker-compose up -d

2. Run the Spring Boot application:
   ./mvnw spring-boot:run

3. Access Swagger UI:
   Once the application is running, open your browser and navigate to:
   http://localhost:8080/swagger-ui.html

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /api/students | Add a new student |
| GET | /api/students | Retrieve all students |
| GET | /api/students/{id} | Retrieve a student by ID |
| PUT | /api/students/{id} | Update an existing student |
| DELETE | /api/students/{id} | Delete a student |
