<pre>
The Blog API is a RESTful API built with Spring Boot and JPA that allows users to interact with a blog database. 
With this API, users can perform CRUD (Create, Read, Update, Delete) operations on blog posts. 
The API can be used to retrieve all blog posts or retrieve a specific post by ID. 
The API handles exceptions and sorts blog posts by date and time created (newest first).
It is built using Java 8 and MySQL database.

The API provides the following functionality:
* Create a new blog post
* Retrieve a list of all blog posts sorted by date and time created (newest first)
* Retrieve a single blog post by its ID
* Update an existing blog post
* Delete a blog post

The project uses Spring Boot framework and Hibernate for data persistence. It also handles exceptions gracefully.

Requirements
Java 8
MySQL

Setting up a development environment
* Clone this repository onto your local machine.
* Create a MySQL database and execute the MySQL-data-export.sql script to create the necessary tables.
* Update the application.properties file located in src/main/resources with your MySQL database credentials.
* Open the project in an IDE such as Eclipse.
* Run the BlogApplication.java file as a Java Application.

Using the API
Once the development environment is set up, the API can be accessed through a REST client such as Postman.

GET /blogs
Retrieves all Blog resources sorted by descending order of dateCreated.

GET /blogs/{id}
Retrieves a single Blog resource by its ID.

POST /blogs
Creates a new Blog resource.

PUT /blogs
Updates an existing Blog resource.

DELETE /blogs/{id}
Deletes a single Blog resource by its ID.

</pre>
