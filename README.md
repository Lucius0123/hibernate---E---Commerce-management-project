# Hibernate E-Commerce Application

## Overview
This is a simple Java-based console application that demonstrates core Hibernate ORM functionalities for an E-Commerce system. It includes basic CRUD operations on the User entity and is structured with a clean Maven project format.

## Project Structure
```
HibernateEcommerceApp/
├── pom.xml
├── src/
│   └── main/
│       ├── java/
│       │   └── com/ecommerce/
│       │       ├── App.java
│       │       ├── dao/
│       │       ├── model/
│       │       └── util/
│       └── resources/
│           └── hibernate.cfg.xml
```

## Setup Instructions

### 1. Create MySQL Database
Make sure you have MySQL running, then create the database:
```sql
CREATE DATABASE ecommerce;
```

### 2. Update MySQL Credentials
Check `hibernate.cfg.xml` for:
```xml
<property name="hibernate.connection.username">root</property>
<property name="hibernate.connection.password">root</property>
```
Update it with your actual MySQL credentials if different.

### 3. Build the Project
Use Maven to compile:
```bash
mvn clean install
```

### 4. Run the App
You can run the `App.java` class to test:
```bash
mvn exec:java -Dexec.mainClass="com.ecommerce.App"
```
Or run it from your IDE.

## Technologies Used
- Java
- Hibernate ORM
- MySQL
- Maven
- Jakarta Persistence

## Features Demonstrated
- Hibernate session management
- CRUD operations via DAO pattern
- Basic cart, order, and payment workflows
- Entity relationships: OneToMany, ManyToOne, OneToOne
- Add new users to the database.
- Save user data with Hibernate to MySQL.
- Automatically create the users table using Hibernate's schema generation.
- Organized into layers: Model, DAO, Utility, and Entry point.


