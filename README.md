Job Portal Application
Overview
A comprehensive web-based job portal application built using modern Java technologies, providing job seekers and employers with a robust platform for job searching and recruitment.
Technologies Used

Frontend:

HTML5
CSS3
Thymeleaf Template Engine


Backend:

Java
Spring Boot
Spring MVC
Spring Security
Spring Data JPA

Database:
MySQL

Features

User registration (as Recruiter or Job Seeker)
Job posting and searching
Resume upload and download
Role-based access control
Secure authentication and authorization

Prerequisites:
JDK 11 or higher
Maven 3.6+
MySQL or PostgreSQL database

Setup and Installation
1. Clone the Repository
bashCopygit clone https://github.com/yourusername/job-portal.git
cd job-portal
2. Database Configuration

Create a MySQL database
Update application.properties with your database credentials

propertiesCopyspring.datasource.url=jdbc:mysql://localhost:3306/jobportal
spring.datasource.username=your_username
spring.datasource.password=your_password
3. Build the Project
bashCopymvn clean install
4. Run the Application
bashCopymvn spring-boot:run
Security Configuration

Implements Spring Security for authentication
Supports role-based access (ROLE_USER, ROLE_EMPLOYER, ROLE_ADMIN)
Password encryption using BCrypt
CSRF protection enabled
JWT token-based authentication

Testing

Unit Tests: JUnit
Integration Tests: Spring Boot Test
Run tests with:

bashCopymvn test
Contributing
