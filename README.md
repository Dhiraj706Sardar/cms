# College Management System

## 📌 Overview
The **College Management System** is a web-based application designed to streamline administrative and academic processes. It allows students, teachers, and administrators to manage various aspects of college activities efficiently. The system provides authentication, user role-based access, and features such as student and faculty management, leave requests, and dashboards.

## 🚀 Technologies Used
- **Java Spring Boot** - Backend framework
- **MySQL** - Database management
- **Spring Data JPA** - ORM for database operations
- **Lombok** - Reduces boilerplate code
- **Spring MVC** - Model-View-Controller architecture
- **Spring Web** - Enables RESTful API development
- **Spring Security** *(In Development Phase)*

## 🔧 Features
- **Authentication & Authorization** (Spring Security is currently in development)
- **Admin Dashboard** for managing students and faculty
- **Student Dashboard** for viewing courses and details
- **Teacher Dashboard** for managing student records
- **Leave Request Management**
- **REST API Integration**
- **Role-based access control**

## 📂 Project Structure
```
📦 cms
 ┣ 📂 src
 ┃ ┣ 📂 main
 ┃ ┃ ┣ 📂 java
 ┃ ┃ ┃ ┣ 📂 com.college.cms
 ┃ ┃ ┃ ┃ ┣ 📂 controllers
 ┃ ┃ ┃ ┃ ┣ 📂 services
 ┃ ┃ ┃ ┃ ┣ 📂 repositories
 ┃ ┃ ┃ ┃ ┣ 📂 models
 ┃ ┃ ┃ ┃ ┗ 📜 CmsApplication.java
 ┃ ┃ ┣ 📂 resources
 ┃ ┃ ┃ ┣ 📜 application.properties
 ┃ ┃ ┃ ┗ 📜 data.sql (if any seed data is used)
 ┣ 📜 pom.xml
 ┣ 📜 README.md
```

## 🛠 Setup & Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/Dhiraj706Sardar/cms.git
   ```
2. Navigate to the project directory:
   ```bash
   cd cms
   ```
3. Configure **MySQL Database** in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/cms_db
   spring.datasource.username=root
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```
4. Build and run the application:
   ```bash
   mvn spring-boot:run
   ```
5. The application should now be running at `http://localhost:8080`

## 📌 API Endpoints
| Method | Endpoint | Description |
|--------|----------|--------------|
| GET | `/students` | Get all students |
| GET | `/teachers` | Get all teachers |
| POST | `/students` | Add new student |
| POST | `/teachers` | Add new teacher |
| POST | `/leave-request` | Submit leave request |

## 💡 Future Enhancements
- **Frontend Development** *(Needs to be implemented using React.js)*
- **Spring Security for authentication** *(Currently in development phase)*
- **Dockerization** for deployment
- **Automated Testing**

## 🤝 Contributing
Contributions are welcome! Feel free to fork the repository and submit pull requests.

## 📜 License
This project is open-source and available under the **MIT License**.

---
### 🔗 Repository Link
[GitHub Repository](https://github.com/Dhiraj706Sardar/cms.git)

