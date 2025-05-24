# microservice-springboot-h2

**User Management RESTful Microservice using Spring Boot and H2**

This microservice provides RESTful APIs to manage users, built with Spring Boot and backed by an H2 in-memory database. It allows clients to create, retrieve, and delete user records via HTTP requests.



**Key Features:**

**H2 Console**

Endpoint: (http://localhost:8080/h2-console)

JDBC URL: jdbc:h2:mem:testdb

![image](https://github.com/user-attachments/assets/a1a2eae4-b5a1-4366-bc1a-7640e0c27c96)


**1. Retrieve All Users**

Endpoint: GET /users

Description: Returns a list of all registered users.

Response: JSON array contains user objects with fields like id, name, and birthDate.

![image](https://github.com/user-attachments/assets/f88d9c80-57fc-43b4-80cd-3a788b9b242a)



**2. Retrieve a User by ID**

Endpoint: GET /users/{id}

Description: Returns the details of a specific user by their unique ID.

Response: JSON object representing the user.

![image](https://github.com/user-attachments/assets/10a5aeaf-bef7-4b10-8274-ce321ed1c7a6)


Error Handling: Returns null user with the given ID does not exist.

![image](https://github.com/user-attachments/assets/bdf5b5b3-054f-4d89-9f91-4ea7a331e7d3)



**3. Create a New User**

Endpoint: POST /users

Description: Accepts user data (e.g., name, birthDate) in the request body and stores it.

Request Body: JSON object with required fields.

{

  "name": "John Doe",
  
  "birthDate": "1990-05-24"
  
}

Response: Returns the created user object with a generated ID and a 201 Created status.

![image](https://github.com/user-attachments/assets/b961c9a0-bb10-4ddc-91d0-9041ff0c0a39)

![image](https://github.com/user-attachments/assets/b24d6400-1a30-489c-af0f-42bc3604a392)




**4. Delete a User by ID**

Endpoint: DELETE /users/{id}

Description: Deletes a user with the specified ID.

Response: Returns 200 No Content on successful deletion.

![image](https://github.com/user-attachments/assets/8deaa818-4d88-4db1-9c12-80a04ee10802)



