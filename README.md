# Student Management System API

A robust RESTful API built with Java and Spring Boot to manage student records. This project demonstrates a clean, layered architecture (Controller, Service, Repository) and uses modern practices for data mapping and persistence.

## Tech Stack
* Java 21
* Spring Boot 3 (Web, Data JPA)
* PostgreSQL
* MapStruct (for object mapping)
* Lombok (to reduce boilerplate)
* Swagger/OpenAPI (for API documentation)

## Key Features
* Full CRUD Operations: Create, Read, Update, and Delete student records.
* DTO Pattern: Decoupled internal entities from API payloads using request/response DTOs.
* Automated Mapping: Utilized MapStruct for safe and fast mapping between Entities and DTOs.
* Auto-generated Documentation: Accessible API testing and documentation via Swagger UI.

## Getting Started

### Prerequisites
* Java 21+ installed
* PostgreSQL installed and running locally
* Maven (or use the provided mvnw wrapper)

### Installation & Running

1. Database Setup:
   Create a local PostgreSQL database named `student_db`.
   Ensure your username and password in `src/main/resources/application.properties` match your local PostgreSQL credentials.

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
