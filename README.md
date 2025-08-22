# University Course List Web Service

This project provides both SOAP (JAX-WS) and REST (JAX-RS) web services for managing university courses.

## Structure
- `model/`: Course model
- `service/`: In-memory course logic
- `soap/`: SOAP web service
- `rest/`: REST API endpoint and config
- `Main.java`: Standalone SOAP publisher
- `RestApp.java`: Standalone REST publisher

## How to Run

### Prerequisites
- Java 8 or higher
- Maven

### Build the Project
1. Open terminal in project root (`d:/Assignment-1`).
2. Run:
   ```
   mvn clean package
   ```

### Run SOAP Service
1. In terminal, run:
   ```
   java -cp "target/classes;target/dependency/*" main.java.Main
   ```
2. SOAP WSDL available at: `http://localhost:8080/ws/course?wsdl`

### Run REST Service
1. In terminal, run:
   ```
   mvn exec:java -Dexec.mainClass=main.java.rest.RestApp
   ```
2. REST API available at: `http://localhost:8081/api/courses`

#### Example REST Endpoints
- Get all courses: `GET http://localhost:8081/api/courses`
- Get by ID: `GET http://localhost:8081/api/courses/id/CS101`
- Search by title: `GET http://localhost:8081/api/courses/title/Intro`

#### Example SOAP Request
```
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:soap="http://soap/">
  <soapenv:Header/>
  <soapenv:Body>
    <soap:getCourseById>
      <id>CS101</id>
    </soap:getCourseById>
  </soapenv:Body>
</soapenv:Envelope>
```

---
For any issues, check Maven output and ensure all dependencies are downloaded.
