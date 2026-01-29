# Task Manager API



![Java](https://img.shields.io/badge/Java-17-orange?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-green?logo=spring-boot)
![MongoDB](https://img.shields.io/badge/MongoDB-latest-green?logo=mongodb)
![Maven](https://img.shields.io/badge/Maven-3.6+-red?logo=apache-maven)


> REST API built with Spring Boot and MongoDB to manage tasks.

This project was created to practice backend development, clean architecture, and team collaboration using Git and GitHub.

## Tech Stack

- **Java**
- **Spring Boot**
- **Spring Data MongoDB**
- **MongoDB**
- **Maven**
- **Git & GitHub**


## Project Architecture
The project follows a layered architecture:

Controller → Service → Repository → Database

- **Controller:** Handles HTTP requests and responses
- **Service:** Contains business logic
- **Repository:** Handles data persistence
- **Model:** Represents domain entities

## API Endpoints

| Method | Endpoint | Description |
|------|--------|------------|
| GET | /api/tasks | Get all tasks |
| POST | /api/tasks | Create a new task |
| GET | /api/tasks/search?keyword= | Search tasks by keyword |
| GET | /api/tasks/search/date?date= | Search tasks by date |
| PUT | /api/tasks/{id}/status | Toggle task status |


### Example JSON for creating a task

{
    "title": "Finish backend project",
    "date": "2026-01-28"
}

## Features

- Create tasks
- List all tasks
- Search tasks by title or date
- Toggle task completion status
- Automatic task date assignment

## What we learned

- Designing REST APIs
- Backend layered architecture
- Working with MongoDB
- Separation of concerns
- Team collaboration using Git branches
- Problem-solving and decision-making in backend design




## How to run the project

1. Make sure MongoDB is running locally
2. Clone the repository
3. Run the Spring Boot application
4. The API will be available at http://localhost:8080/api/tasks


## Authors

- GitHub: [Angel0zzx](https://github.com/Angel0zzx)
- GitHub: [torgohd](https://github.com/torgohd-sketch)
