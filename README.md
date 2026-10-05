

\# Student Management System



A Student Management System developed using Spring Boot and MongoDB.  

The application provides REST APIs to perform CRUD operations on student records.



\## Features



\- Add a new student

\- View all students

\- View a student by ID

\- Update student details

\- Delete student details

\- MongoDB database integration

\- RESTful APIs

\- JUnit testing



\## Technologies Used



\- Java

\- Spring Boot

\- Spring Data MongoDB

\- MongoDB

\- REST API

\- Maven

\- JUnit

\- Eclipse IDE

\- Postman



\## Student Details



Each student record contains:



\- ID

\- Name

\- Age

\- Branch

\- Marks



\## API Endpoints



| Method | Endpoint | Description |

|---|---|---|

| GET | `/getAll` | Get all students |

| GET | `/get?id=1` | Get student by ID |

| POST | `/add` | Add a new student |

| PUT | `/update?id=1` | Update student details |

| DELETE | `/delete?id=1` | Delete student |



\## Example Student



```json

{

&#x20; "id": 4,

&#x20; "name": "SUDARSHAN",

&#x20; "age": 20,

&#x20; "branch": "CSE",

&#x20; "marks": 85

}



Project Structure

student-management-system/

├── src/

│   ├── main/

│   │   ├── java/

│   │   │   └── com/example/student/

│   │   │       ├── Student.java

│   │   │       ├── StudentApplication.java

│   │   │       ├── StudentController.java

│   │   │       └── StudentRepository.java

│   │   │

│   │   └── resources/

│   │       └── application.properties

│   │

│   └── test/

│       └── java/

│           └── com/example/student/

│               └── StudentRepoTest.java

│

├── pom.xml

├── mvnw

└── mvnw.cmd

How to Run

1\. Start MongoDB



Make sure MongoDB is running on:



localhost:27017

2\. Run the Spring Boot Application



Run StudentApplication.java from Eclipse.



The application runs on:



http://localhost:8080

3\. Test the APIs



Use Postman to test the CRUD operations.



Example:



GET http://localhost:8080/getAll

Database Configuration



The application uses MongoDB with the following configuration:



spring.data.mongodb.port=27017

spring.data.mongodb.database=student

server.port=8080

Purpose



This project was developed as a Full Stack Development practice project to understand Spring Boot, REST APIs, MongoDB integration, and CRUD operations.



Author



Chinmayi M



Diploma in Computer Science and Engineering

DRR Government Polytechnic, Davanagere

