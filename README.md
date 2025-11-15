# ProductService

ProductService is a backend service built in **Java**, designed to manage product data through a RESTful API. It supports full **CRUD** (Create, Read, Update, Delete) operations, enabling efficient product management for any front‑end or client application.

---

## Features

- Create new products with relevant data  
- Fetch single or multiple products  
- Update product details  
- Delete products  
- Clean RESTful API design  
- Structured project layout for maintainability

---

## Technology Stack

- **Language:** Java  
- **Framework:** Spring Boot   
- **Build Tool:** Maven / Gradle  
- **API Format:** JSON over HTTP  

---

## Setup & Run
```bash
git clone https://github.com/ganesh883/ProductService.git
cd ProductService
# Update database config in application.properties
mvn clean install
mvn spring-boot:run
