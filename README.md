# Employee Management - Module 8

Spring Boot lab demonstrating a cached employee-count report and a scheduled system status log.

## Features

- `GET /api/reports/employee-count` returns the total number of employees.
- The database count is cached with Caffeine for one minute (`@Cacheable("employeeCount")`).
- A scheduled task writes `System running` to the application console every 30 seconds.
- Caching and scheduling are enabled in the Spring Boot application.

## Run

```bash
mvn spring-boot:run
```

Call the report endpoint:

```bash
curl http://localhost:8080/api/reports/employee-count
```

Example response:

```json
{"totalEmployees":0,"generatedAt":"2026-01-01T00:00:00Z"}
```

The `generatedAt` timestamp reflects each API response; the database count itself is cached for up to one minute.
