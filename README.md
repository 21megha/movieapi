# 🎬 Movie Management REST API

This is a simple Java Spring Boot backend application that implements a RESTful API for managing a collection of movies.

The application allows users to add, retrieve, update, and delete movies using an in-memory data store.

---

## 🛠 Technologies Used

- Java 17
- Spring Boot
- Maven
- RESTful APIs
- Jakarta Validation
- In-memory storage (ArrayList)

---

## 🧱 Item Model

The Movie model contains the following fields:

- `id` (Integer) – Unique identifier
- `name` (String) – Movie name (Required)
- `description` (String) – Movie description (Required)
- `genre` (String) – Movie genre

Example JSON representation:

{
  "id": 1,
  "name": "Interstellar",
  "description": "A space exploration movie",
  "genre": "Sci-Fi"
}

---

## 🗄 Data Storage

The application uses an in-memory `ArrayList` to store movie records.

Important:
- Data is not persisted.
- All data will be lost when the application restarts.

---

## 📌 API Endpoints

### 1️⃣ Add a New Movie

POST /movies

Description:  
Adds a new movie to the collection.

Request Body Example:

{
  "name": "Inception",
  "description": "A dream-based thriller",
  "genre": "Sci-Fi"
}

Response:
- 200 OK – Movie added successfully
- 400 Bad Request – If required fields are missing

---

### 2️⃣ Get Movie by ID

GET /movies/{id}

Description:  
Retrieves a single movie by its ID.

Example:
GET /movies/1

Response:
- 200 OK – Returns movie details
- 404 Not Found – If movie does not exist

---

### 3️⃣ Update Movie

PUT /movies/{id}

Description:  
Updates an existing movie using its ID.

Request Body Example:

{
  "name": "Updated Name",
  "description": "Updated description",
  "genre": "Drama"
}

Response:
- 200 OK – Movie updated successfully
- 404 Not Found – If movie not found

---

### 4️⃣ Delete Movie

DELETE /movies/{id}

Description:  
Deletes a movie by its ID.

Response:
- 200 OK – Movie deleted
- 404 Not Found – If movie not found

---

## ✅ Input Validation

Validation is implemented using:

- @NotBlank
- @Valid

If required fields (such as name or description) are missing, the API returns a 400 Bad Request.

---

## ▶️ How to Run the Application Locally

### Prerequisites

Make sure you have the following installed:

- Java 17 or higher
- Maven
- Git (optional)
- IDE (IntelliJ / Eclipse / VS Code) or terminal

---

### Step 1: Clone the Repository

git clone <your-repository-url>

---

### Step 2: Navigate to Project Directory

cd project-folder-name

---

### Step 3: Build the Project

mvn clean install

---

### Step 4: Run the Application

Option 1: Using Maven

mvn spring-boot:run

Option 2: Using IDE

Run the main class:
MovieapiApplication.java

---

### Step 5: Access the Application

Once started, the server runs at:

http://localhost:8080

You can test the APIs using:
- Postman
- cURL
- Browser (for GET requests)

---

## ⚙ Important Implementation Details

- The application follows a layered architecture:
  - Controller layer handles HTTP requests.
  - Service layer contains business logic.
  - Model layer defines the data structure.
- REST principles are followed.
- Proper HTTP status codes are returned.
- In-memory storage is used instead of a database.
- Data resets when the server restarts.

---

## 👩‍💻 Author

Megha Vishvkarma  
Java Backend Developer
