# 📚 Course Registration System  

## 📌 Project Overview  

The **Course Registration System** is a simple web-based application that allows students to:  
- View available courses  
- Register for courses  
- View enrolled students  

It is built with a **Spring Boot backend** connected to **MySQL** and a lightweight **HTML/CSS/JavaScript frontend**.  

---

## ✨ Key Features  

- 📖 **View Courses** – See all available courses stored in the database  
- 📝 **Student Registration** – Register with name, email, and chosen course  
- 👩‍🎓 **View Enrolled Students** – Display all students who registered  
- 🔄 **Database Integration** – Backend connected with MySQL via JPA/Hibernate  
- 🌐 **REST API Consumption** – Frontend communicates with backend using APIs  
- 🖥️ **Simple Frontend** – Built with plain HTML, CSS, and JavaScript  

---

## 🛠️ Technologies Used  

### **Frontend**  
- HTML5  
- CSS3  
- Vanilla JavaScript  
- VS Code  

### **Backend**  
- Java 17+  
- Spring Boot  
- Spring Data JPA  
- Hibernate  
- MySQL  
- IntelliJ IDEA  

### **Deployment & Tools**  
- MySQL Workbench for database  
- IntelliJ IDEA for backend development  
- VS Code for frontend development  

---

## ⚙️ How It Works  

1. **Database Setup**: MySQL stores courses and students data.  
2. **Backend (Spring Boot)**: Provides REST APIs for fetching courses, registering students, and viewing enrolled students.  
3. **Frontend (HTML/JS)**: Calls APIs and displays results on simple web pages.  
4. **Integration**: Students interact with the frontend, which communicates with the backend.  

---

## 📡 API Endpoints  

| Method | Endpoint              | Description                   |
|--------|------------------------|-------------------------------|
| GET    | `/courses`             | Get list of available courses |
| GET    | `/courses/enrolled`    | Get list of enrolled students |
| POST   | `/courses/register`    | Register a student for a course |

---

## 💻 Local Setup: Course Registration System

This guide will walk you through setting up the project on your local machine.

***

### 1. Clone & Navigate

First, get the project files from the GitHub repository and move into the project folder.

1.  **Clone the repository:**
    ```bash
     git clone https://github.com/gopikrish1/Course-Registration-System.git
    ```

2.  **Navigate into the project directory:**
    ```bash
    cd Course-Registration-System
    ```

***

### 2. Backend Setup ⚙️

Next, let's configure and run the Java Spring Boot backend.

1.  **Open the Project**: Launch IntelliJ IDEA (or your preferred IDE) and open the `backend/` folder from the cloned repository.

2.  **Configure MySQL Database**: Locate and open the `application.properties` file, which you can find in `src/main/resources/`. Update the database URL, username, and password to match your local MySQL configuration.

    ```properties
    # src/main/resources/application.properties
    
    spring.datasource.url=jdbc:mysql://localhost:3306/course_reg_system
    spring.datasource.username=root
    spring.datasource.password=yourpassword  # 👈 Replace with your actual MySQL password
    
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    ```
    > **Note:** The `ddl-auto=update` command will automatically create the `course_reg_system` database schema for you if it doesn't already exist.

3.  **Run the Backend**: Open the built-in terminal in your IDE or a separate command prompt and run the following Maven command:
    ```bash
    mvn spring-boot:run
    ```

***

### 3. Confirmation ✅

If everything is set up correctly, the backend server will start and be accessible at the following URL:

👉 **Backend running at: http://localhost:8080**

### 4. Frontend Setup 🎨

The frontend is built with simple HTML, CSS, and JavaScript.

1.  **Open the Project**: Open the `frontend/` folder in your code editor (e.g., VS Code).
2.  **Run the Application**: Use the **Live Server** extension in VS Code to open `index.html`, or open the file directly in your web browser.

#### Available Pages:

* 🏠 `index.html` → Home Page
* 📝 `register.html` → Student Registration Form
* 📖 `availcourses.html` → View Available Courses
* 👩‍🎓 `students.html` → View All Enrolled Students

***

### 5. Project Structure 📂

The repository is organized into two main folders: `backend` and `frontend`.
### Project Structure 📂

The repository is organized into two main folders for the backend and frontend.

```bash
 Course-Registration-System/
├── Course-Registration-System-Backend/
│   ├── .mvn/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/example/CourseRegistrationSystem/
│   │   │   │       ├── Controller/
│   │   │   │       │   └── CourseController.java    # Handles API requests
│   │   │   │       ├── Model/
│   │   │   │       │   ├── Course.java            # Data model for courses
│   │   │   │       │   └── CourseRegistry.java    # Data model for registrations
│   │   │   │       ├── Repository/
│   │   │   │       │   ├── CourseRegistryRepo.java # Interacts with the registry table
│   │   │   │       │   └── CourseRepo.java         # Interacts with the course table
│   │   │   │       ├── Service/
│   │   │   │       │   └── CourseService.java       # Contains business logic
│   │   │   │       └── CourseRegistrationSystemApplication.java # Main application entry point
│   │   │   └── resources/
│   │   │       └── application.properties # Configuration for database, server, etc.
│   │   └── test/                          # Unit and integration tests
│   ├── .gitignore                       # Specifies files for Git to ignore
│   ├── mvnw                             # Maven wrapper for Unix-based systems
│   ├── mvnw.cmd                         # Maven wrapper for Windows
│   └── pom.xml                          # Manages backend dependencies and build settings
└── frontend/                              # Contains all UI files
    ├── index.html                       # Home page
    ├── register.html                    # Student registration page
    ├── availcourses.html                # Page to view available courses
    ├── students.html                    # Page to view enrolled students
    ├── style.css                        # CSS styles for all pages
    └── script.js                        # JavaScript for client-side logic
```

***

## 📜 License

This project is licensed under the **MIT License**. This is a permissive license that allows for reuse, modification, and distribution, both in private and commercial projects.

***

## 👨‍💻 Author & Contact

This project was created by **Gopi Krishnaa. L**. Get in touch through any of the following platforms:
* **📧 Email**: `gopi22029.it@rmkec.ac.in`
* **🔗 LinkedIn**: [Gopikrish01](https://www.linkedin.com/in/Gopikrish01)
* **💻 GitHub**: [Gopikrish1](https://github.com/Gopikrish1)
