# 🎓 College Management System

## 📌 Overview
The **College Management System** is a comprehensive web-based application designed to streamline administrative and academic processes in educational institutions. It provides a centralized platform for students, teachers, and administrators to manage various aspects of college activities efficiently. The system features robust authentication, role-based access control, and intuitive dashboards for different user roles.

## 🚀 Key Features

### 👥 User Management
- **Multi-role Authentication** (Admin, Teacher, Student)
- **Secure Login/Logout** with JWT (JSON Web Tokens)
- **Role-based Access Control** (RBAC)
- **User Registration & Profile Management**

### 📊 Admin Dashboard
- Manage student and faculty accounts
- Course and subject management
- System configuration
- User activity monitoring

### 👨‍🏫 Teacher Dashboard
- Manage class schedules
- Record and manage student attendance
- Grade management
- Leave request handling

### 👨‍🎓 Student Dashboard
- View course materials
- Check attendance records
- View grades and academic progress
- Submit leave applications

### 🛠 Technical Features
- **Spring Security** with JWT authentication
- Role-based access control (RBAC)
- RESTful API architecture
- Responsive web design
- Secure file uploads
- Data export functionality

## 🛠 Technologies Used

### Backend
- **Java 17** - Core programming language
- **Spring Boot 3.x** - Application framework
- **Spring Security** - Authentication and authorization
- **Spring Data JPA** - Database operations
- **Hibernate** - ORM tool
- **JWT** - Secure authentication
- **Maven** - Dependency management

### Frontend
- **Thymeleaf** - Server-side templating
- **HTML5 & CSS3** - Structure and styling
- **JavaScript** - Client-side interactivity
- **Bootstrap 5** - Responsive design

### Database
- **MySQL 8.0** - Relational database
- **H2 Database** - For testing (optional)

### Development Tools
- **Lombok** - Reduces boilerplate code
- **Spring DevTools** - Developer tools
- **Git** - Version control

## 📂 Project Structure

```
📦 cms
┣ 📂 src/main
┃ ┣ 📂 java/com/cms/system/cms
┃ ┃ ┣ 📂 config/           # Configuration classes
┃ ┃ ┣ 📂 controller/       # MVC Controllers
┃ ┃ ┣ 📂 model/           # Entity classes
┃ ┃ ┣ 📂 repository/      # Data access layer
┃ ┃ ┣ 📂 security/       # Security configurations
┃ ┃ ┣ 📂 service/        # Business logic
┃ ┃ ┗ 📜 CmsApplication.java
┃ ┗ 📂 resources
┃   ┣ 📂 static/         # Static resources (CSS, JS, images)
┃   ┣ 📂 templates/      # Thymeleaf templates
┃   ┣ 📜 application.yml # Application configuration
┃   ┗ 📜 data.sql       # Initial data
┣ 📜 .gitignore
┣ 📜 pom.xml            # Maven configuration
┗ 📜 README.md
```

## 🚀 Getting Started

### Prerequisites
- Java 17 or higher
- MySQL 8.0 or higher
- Maven 3.6.3 or higher
- Git

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/Dhiraj706Sardar/cms.git
   cd cms
   ```

2. **Configure Database**
   - Create a MySQL database named `college_management`
   - Update database configuration in `src/main/resources/application.yml`

3. **Build and Run**
   ```bash
   # Build the application
   mvn clean install
   
   # Run the application
   mvn spring-boot:run
   ```

4. **Access the Application**
   - Open your browser and navigate to: `http://localhost:8080`
   - Default admin credentials:
     - Username: admin@college.edu
     - Password: admin123

## 📚 API Documentation

API documentation is available using Swagger UI:
- **Swagger UI**: `http://localhost:8080/swagger-ui.html`
- **API Docs**: `http://localhost:8080/v3/api-docs`

## 🔒 Security

The application implements robust security measures using Spring Security:

### Authentication
- **JWT (JSON Web Token) based authentication**
- Secure password storage using BCrypt hashing
- Token-based session management
- Configurable token expiration

### Authorization
- **Role-based access control (RBAC)** with multiple user roles
- Fine-grained endpoint security
- Method-level security annotations
- CSRF protection enabled
- CORS configuration for API security

### Security Headers
- Content Security Policy (CSP)
- XSS Protection
- HTTP Strict Transport Security (HSTS)
- X-Content-Type-Options
- X-Frame-Options

### Session Management
- Stateless authentication with JWT
- Token refresh mechanism
- Secure cookie handling
- Session timeout configuration

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgments

- Spring Framework
- Bootstrap
- Thymeleaf
- All contributors and open-source libraries used

## 💡 Future Enhancements
- **Frontend Development** *(Needs to be implemented using React.js)*
- **Dockerization** for deployment
- **Automated Testing**
- **Enhanced Reporting** with data visualization
- **Mobile Application** using React Native

---
### 🔗 Repository Link
[GitHub Repository](https://github.com/Dhiraj706Sardar/cms.git)

