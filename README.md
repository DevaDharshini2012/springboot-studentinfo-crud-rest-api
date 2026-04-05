# StudentInfo CRUD REST API

This project is a Spring Boot-based RESTful API that performs CRUD (Create, Read, Update, Delete) operations for managing student information. The application follows a layered architecture and integrates MySQL for database operations. Swagger OpenAPI is used for API documentation and testing.

## Features

- Add new student information
- View all student records
- Update student details
- Delete student records
- Interactive API documentation using Swagger UI

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Swagger OpenAPI
- Maven

## Project Structure

The project follows a layered architecture:

```
Controller → Service → Repository → Database
```

- Controller: Handles HTTP requests
- Service: Contains business logic
- Repository: Handles database operations
- Entity: Represents StudentInfo data model

## API Endpoints

| Method | Endpoint | Description |
|-------|----------|-------------|
| POST | /studentinfo/add | Add new student |
| GET | /studentinfo/all | Get all students |
| PUT | /studentinfo/update/{id} | Update student details |
| DELETE | /studentinfo/delete/{id} | Delete student |

## Swagger API Documentation

After running the application, open:

```
http://localhost:8080/swagger-ui/index.html
```

to test APIs interactively.

## How to Run the Project

1. Clone the repository

```
git clone https://github.com/DevaDharshini2012/springboot-studentinfo-crud-api.git
```

2. Open project in Eclipse / IntelliJ

3. Configure MySQL database in:

```
application.properties
```

Example:

```
spring.datasource.url=jdbc:mysql://localhost:3306/studentinfo
spring.datasource.username=root
spring.datasource.password=yourpassword
```

4. Run the application

```
Run As → Java Application
```

## Author

Deva Dharshini  
2026 IT Graduate  
Aspiring Java & Full Stack Developer
