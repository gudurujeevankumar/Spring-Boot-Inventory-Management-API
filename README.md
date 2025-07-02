# 📦 Spring Boot Inventory Management API

A full-featured Inventory Management REST API built with **Spring Boot**, **Spring Data JPA**, **H2 Database**, and **Swagger UI**.


<img width="1440" alt="Swagger UI local Host" src="https://github.com/user-attachments/assets/926f248a-c24b-4b7d-a407-1ac605d3e590" />


---

## 🚀 Features
```
- ✅ Add, view, update, and delete products
- 📄 Pagination and sorting support
- 🔍 Filter by category and price range
- 🧠 In-memory H2 database for quick setup
- 📚 Auto-generated Swagger UI documentation
```
---

## 🛠️ Technologies Used
```
- Java 17
- Spring Boot 3.2.5
- Spring Web
- Spring Data JPA
- H2 Database
- Swagger (springdoc-openapi-ui 2.3.0)
- Maven
```
---

## 📁 Project Structure
```
src/main/java/com/ndvtechsys/inventory/
├── controller         # REST controllers
├── exception          # Custom exceptions
├── model              # Entity classes
├── repository         # JPA repositories
├── service            # Business logic layer
├── config             # Swagger/OpenAPI configuration
└── InventoryApiApplication.java
```
---

## ⚙️ Configuration

**`src/main/resources/application.properties`:**

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

springdoc.api-docs.path=/v3/api-docs
springdoc.swagger-ui.path=/swagger-ui.html
```

⸻

▶️ How to Run the Project

🧑‍💻 Option 1: Run from Eclipse
```
 	1.	Open Eclipse
	2.	Import as Existing Maven Project
	3.	Right-click InventoryApiApplication.java
	4.	Select Run As > Java Application
```
💻 Option 2: Run from Terminal
```
cd inventory-api
./mvnw clean install
./mvnw spring-boot:run
```

⸻

🌐 API Endpoints
```
Method	Endpoint					Description
GET	/api/products				Get all products (paginated)
GET	/api/products/{id}			Get product by ID
POST	/api/products				Create a new product
PUT	/api/products/{id}			Update product by ID
DELETE	/api/products/{id}			Delete product by ID
GET	/api/products/category/{category}	Filter products by category
GET	/api/products/price?min=x&max=y		Filter products by price range
```

⸻

🔍 Swagger UI <br>

Test your API directly in the browser! <br>
	•	📌 http://localhost:8080/swagger-ui.html <br>
	•	📄 http://localhost:8080/v3/api-docs <br>

⸻

🧪 H2 Database Console <br>
	•	🌐 URL: http://localhost:8080/h2-console <br>
	•	🛠 JDBC URL: jdbc:h2:mem:testdb <br>
	•	👤 Username: sa <br>
	•	🔐 Password: 

⸻

📦 Sample Product JSON

Use this for Swagger POST or testing endpoints:
```
{
  "name": "Apple MacBook Pro",
  "category": "Electronics",
  "quantity": 10,
  "price": 1999.99
}
```

⸻

👨‍💻 Author

Guduru Jeevan Kumar <br>
📧 gudurujeevankumarguduru3@gmail.com <br>
🔗 [LinkedIn](https://github.com/gudurujeevankumar) <br>
🌐 [Portfolio](https://web-developer-jeevan-kumar-guduru.netlify.app/) <br>

⸻

🙌 Acknowledgements <br>
	•	Thanks to Spring Boot community for documentation and tools <br>
	•	Special thanks to my mentor Srinivasarao Gorantla for continuous support and guidance <br>

