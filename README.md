
# ToDo Application
[![Java](https://img.shields.io/badge/Java>=8.0-blue.svg)](https://docs.spring.io/spring-boot/docs/0.5.0.M6/api/org/springframework/boot/SpringApplication.html)
[![maven](https://img.shields.io/badge/maven->=3.0.5-green.svg)](https://www.npmjs.com/package/npm/v/5.5.0)
[![springBoot](https://img.shields.io/badge/SpringBoot->=3.0.6-blue.svg)](https://nodejs.org/en/blog/release/v9.3.0)
>This is a simple TODO application developed using Spring Boot framework, which allows users to manage their tasks in a convenient manner. The application uses an ArrayList as the data structure to store the tasks.

[Homepage]();

## Framework used
 * Spring Boot
## Languaged Uesd
 * Java
## Data Model
>The user data model is defined in the User class, which has the following attributes:
```
todoName (String) : User Name.
todoStatus (Boolean) : Work status Done or Not.
```
## Data Flow
```
1. User send as a request to the application throgh the endpoints
2. the api recived request and sends it to the appropriate controll method
3. the controller method makes a call to the method in service class.
4. he controller method returns a response to the API
5. The API sends the response back to the user
```
## Function Used 

* GetMapping(value = "/getToDoList")
```
This endpoint makes a call to method in ToDoService class which retrieves data of all Todos from database.
```
* PostMapping(value = "/addToDo")
```
This endpoint makes a call to method in ToDoService class which is connected to database. In database we add a new todo given through API.
```
* DeleteMapping(value = "/DeleteToDoByID/{ID}")
```
This endpoint makes a call to method in ToDoService class which is connected to database. In database we delete a ToDo by ToDo Id given through API.
```
* PutMapping(value = "/updateTodoById/{ID}/{status}")
```
This endpoint makes a call to method in ToDoService class which is connected to database. In database we update a ToDo by ToDo Id given through API.
```
* GetMapping(value = "getToDoByTheirStatus")
```
This endpoint makes a call to method in ToDoService class which retrieves data of all Todos basec on status from database.
```
## Data Structure Used

* ArrayList 
```
We have used ArrayList data structure as a database to implement CRUD Operations.
```

## Project Summary
```
The Spring Boot TODO Application is a simple task management system that allows users to add, view, mark as complete, and delete tasks. It utilizes the Spring Boot framework, with an ArrayList serving as the underlying data structure to store the tasks.
```
## Author

Saurav Kumar

* twiter : [@saurav](https://twitter.com/Sauravjha24)
* Github : [@sjha](https://github.com/sjha24)

## Contributing

Contributions , issues and features requestes are welcome !

Feel free to check issues page

## Show your support

Give a rating if this project help you

## License

Copyright : 2023 [Saurav Kumar]()
This project is [GeekSter](https://www.geekster.in/) license
