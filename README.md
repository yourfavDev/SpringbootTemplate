# Spring Boot REST API Template with Simple Name Service

This Spring Boot application provides a RESTful API template that demonstrates clean architecture principles and dependency injection. It offers a simple endpoint that returns JSON-formatted responses containing user-provided names, showcasing Spring Boot's web capabilities and proper separation of concerns.

The project implements a layered architecture with controllers, services, and models, making it an excellent starting point for building scalable Spring Boot applications. It uses Spring Boot 3.1.1 and requires Java 24, offering modern Java features and Spring framework capabilities. The application demonstrates REST API implementation, dependency injection, and proper project structure following Spring Boot best practices.

## Repository Structure
```
.
├── pom.xml                  # Maven project configuration with Spring Boot dependencies
└── src/main/java/org/template
    ├── Main.java           # Application entry point with Spring Boot configuration
    ├── controller          # REST API endpoint definitions
    │   └── HelloController.java
    ├── model              # Data models and business objects
    │   └── PersonModel.java
    └── service            # Business logic implementation
        └── HelloService.java
```

## Usage Instructions
### Prerequisites
- Java Development Kit (JDK) 24 or later
- Apache Maven 3.6.0 or later
- Your preferred IDE (IntelliJ IDEA, Eclipse, or VS Code recommended)

### Installation

1. Clone the repository:
```bash
git clone <repository-url>
cd StructuredProject
```

2. Build the project:
```bash
mvn clean install
```

3. Run the application:
```bash
mvn spring-boot:run
```

### Quick Start

1. Start the application using the instructions above
2. Access the REST endpoint using curl or your preferred HTTP client:

```bash
curl http://localhost:8080/hello/John
```

Expected response:
```json
{"content":"John"}
```

### More Detailed Examples

1. Using different names:
```bash
curl http://localhost:8080/hello/Alice
curl http://localhost:8080/hello/Bob
```

2. Using with web browsers:
Simply navigate to `http://localhost:8080/hello/YourName` in your browser.

### Troubleshooting

Common issues and solutions:

1. Application fails to start
- **Problem**: Port 8080 already in use
- **Solution**: 
```bash
# Find process using port 8080
lsof -i :8080
# Kill the process
kill -9 <PID>
```

2. Build failures
- **Problem**: Incorrect Java version
- **Solution**: Verify Java version:
```bash
java -version
# Ensure it shows version 24 or later
```

3. Debug Mode
- Enable debug logging by adding the following to `application.properties`:
```properties
logging.level.org.template=DEBUG
```
- Run with debug mode:
```bash
mvn spring-boot:run -Dspring-boot.run.arguments=--debug
```

## Data Flow
The application follows a simple request-response flow where HTTP requests are processed through controllers, services, and models to generate JSON responses.

```ascii
Client Request -> HelloController -> HelloService -> PersonModel
     ^                                                  |
     |                                                  |
     +------------------JSON Response------------------+
```

Component interactions:
1. Client sends HTTP GET request to `/hello/{name}`
2. HelloController receives the request and extracts the name parameter
3. HelloController delegates to HelloService
4. HelloService creates a PersonModel with the provided name
5. HelloService formats the response as JSON
6. Response is returned to the client through the controller