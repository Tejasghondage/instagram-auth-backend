# Instagram Authentication Backend (Hibernate)

A **console-based authentication system** built using **Java and Hibernate**, implementing core authentication features similar to Instagram.
The project follows a **clean layered architecture (App → Controller → Service → DAO)** and works **without any frontend**.

---

## Features

- User Signup
- User Login
- Forgot Password functionality
  - User verification using **unique username**
  - Fetch registered email from database
  - Generate and send **OTP to email**
  - OTP validation
  - Secure password reset
- Password hashing
- Input validation using regex
- Clean and maintainable architecture

---

## Architecture Overview

```
App (Console Menu)
   ↓
Controller
   ↓
Service (Business Logic)
   ↓
DAO (Hibernate ORM)
   ↓
Database (MySQL)
```

---

## Package Structure

```
com.tejas.instagram
├── app
│   └── App.java
├── controller
│   └── AuthController.java
├── service
│   ├── AuthService.java
│   └── AuthServiceImpl.java
├── dao
│   └── UserDao.java
├── entity
│   └── User.java
├── dto
│   ├── SignupRequest.java
│   ├── LoginRequest.java
│   └── ForgotPasswordRequest.java
├── util
│   ├── HibernateUtil.java
│   ├── PasswordUtil.java
│   ├── OtpUtil.java
│   └── ValidationUtil.java
└── exception
    └── AuthException.java
```

---

## Forgot Password Flow (OTP Based)

1. User enters **unique username**
2. System checks if the user exists
3. Registered email is fetched from database
4. A **6-digit OTP** is generated
5. OTP is sent to the registered email
6. User enters OTP
7. OTP is validated
8. User enters a new password
9. Password is hashed and updated in database

---

## Technologies Used

- Java
- Hibernate ORM
- MySQL
- Maven
- SecureRandom (OTP generation)
- Regex (input validation)

---

## How to Run

1. Clone the repository
2. Configure database in `hibernate.cfg.xml`
3. Run `App.java` as Java Application
4. Use console menu to test features

---

## Author

Tejas Ghondage
Java Full Stack Developer
