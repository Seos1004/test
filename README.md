# Modular Monolithic Spring Boot Project

This repository contains a sample modular monolithic architecture built with **Spring Boot 3.2.5** and **JDK 21** using **Gradle Kotlin DSL**.

## Modules
- **alpha-module**: provides a simple `AlphaService`.
- **omega-module**: provides a simple `OmegaService`.
- **api-module**: Spring Boot application exposing REST endpoints that consume the services from the other modules.

## Running the application
From the project root, run:

```bash
./gradlew bootRun
```

The application exposes endpoints at `/alpha` and `/omega`. Swagger UI is available at `/swagger-ui.html`.
