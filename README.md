# Spring MVC Project

This repository contains a simple project implemented using the **Spring Framework**. It follows the architectural pattern **Controller-Service-Repository** and is built in the style of **Spring MVC (Model-View-Controller)**, with Thymeleaf as the templating engine for rendering HTML pages.

## Features

- **Controller-Service-Repository Architecture**:
    - **Controller**: Handles HTTP requests and serves HTML pages.
    - **Service**: Contains the business logic and intermediates between the controller and repository layers.
    - **Repository**: Handles data access operations and interacts with the database.

- **Spring MVC**:
    - Implements the Model-View-Controller design pattern for organizing the application structure.
    - Models represent the data and are passed to the views.
    - Views are rendered using **Thymeleaf** templates.
    - Controllers manage the flow between the model and view, providing a clear separation of concerns.

- **Thymeleaf Integration**:
    - HTML templates are dynamically populated with data from the backend.
    - Supports iteration, conditionals, and other logic within the templates.

## Technologies Used

- **Spring Framework**: Core framework for building the application.
- **Thymeleaf**: Templating engine for generating dynamic HTML.
- **PostgreSQL**: Configurable database for data storage.
- **Maven**: Build and dependency management.
- **Java 11**: Programming language.

## Advantages of Spring MVC

- Clear separation of concerns with the **Controller-Service-Repository** pattern.
- Easy integration with Thymeleaf for building dynamic HTML pages.
- Modular design ensures maintainability and scalability.
