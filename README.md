# miscusi-backdev

This repository contains a restaurant management system implemented in Java using the Spring Boot framework. The system covers menu creation, product management, and order processing.

Main Application Class: BackDevApplication
Entry point of the Spring Boot application.
Initializes sample data upon application startup using the CommandLineRunner interface.
Demonstrates the usage of MenuServ and ProductServ services.

REST API Controller: MenuApiController
Handles REST endpoints for operations related to the menu.
Provides endpoints for creating and updating menu items.
Uses MenuServ for business logic.

Security Configuration: AuthConfiguration
Configures Spring security for the application.
Disables CSRF protection for simplicity.
Allows all requests for demonstration purposes.

Logging Configuration: LoggerConfiguration
Configures a global logger for the application.
Logs information to a file named global-logs.log.

Logger Cleanup Component: LoggerCleanup
Used to clean up resources associated with the global logger.
Closes all handlers of the global logger upon application shutdown.

Entity Classes: Ingredient, Menu, OrderEntity, Product
Represent the main data entities of the application.
Establish relationships between entities using JPA annotations.
Use bidirectional relationships to navigate between related entities.

Repository Interfaces: IngredientRepo, MenuRepo, OrderRepo, ProductRepo
Extend JpaRepository to perform CRUD operations on entities.
Provide basic access functionality for their respective entities.

Service Classes: IngredientServ, MenuServ, OrderServ, ProductServ
Implement business logic for their respective entities.
Use repository interfaces for data access.
Expose methods to perform CRUD operations on entities.

Database Configuration: application.properties
Configures connection details to the MySQL database.
Specifies to Hibernate to generate tables upon application startup for simplicity.

Sample Data SQL File: data.sql
Contains SQL statements to insert sample data into the database.

This restaurant management system serves as a foundation for creating more sophisticated applications. It includes features such as menu creation, product management, and order processing. The system is integrated with Spring Security for basic authentication and authorization.
