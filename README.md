# User Management Microservice with JWT and Spring Security

## Introduction
Welcome to my User Management Microservice project! With a solid year of Java experience and four months delving into Spring and Spring Boot, I have crafted this microservice to handle user creation and role assignment, leveraging the robust authentication and authorization capabilities provided by JWT (JSON Web Tokens) and Spring Security.

## Project Overview
This microservice is designed to be a scalable, secure foundation for user management in any application. It supports the dynamic assignment of roles - "user" and "admin", and utilizes Spring Security for endpoint protection, ensuring that actions are carried out by authorized individuals only.

## Features
- **User Registration**: Endpoint for user creation.
- **Role Assignment**: Admins can assign "user" or "admin" roles to the registered users.
- **Authentication**: Secure login process with JWT token generation.
- **Authorization**: Role-based access control to various service endpoints.

## Technologies Used
- **Java**: The language of choice for building the service's core logic.
- **Spring Boot**: Simplifies bootstrapping and development of new Spring applications.
- **Spring Security**: Provides comprehensive security services for Java EE-based enterprise software applications.
- **JWT**: Ensures secure transfer of user identity information between the server and the client.
- **Maven**: Dependency management and build automation tool.



## API Endpoints
`POST /auth/signup` - Endpoint for user registration.

`POST /auth/signin` - Endpoint for user authentication and JWT token retrieval.

## Security
This project uses JWT for secure authentication and Spring Security for authorization checks. Passwords are stored in hashed form for added security.

## Contributing
Feel free to fork this repository and submit pull requests to contribute to this project. Please make sure to update tests as appropriate.



## Contact
If you have any questions or would like to contact me regarding employment opportunities, please email me at trae.brown24@outlook.com.

---

Thank you for visiting my User Management Microservice project. I believe that the combination of Java, Spring Boot, JWT, and Spring Security showcases my growth in backend development and my commitment to building robust, secure applications.

Best regards,

Trae Brown
