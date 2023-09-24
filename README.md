# Task-1-Java-REST-API-example
The API is build using Spring Boot a java framework.

## Task Description: 
Implement an application in java which provides a REST API with endpoints for searching,
creating and deleting “server” objects:

● GET servers. Should return all the servers if no parameters are passed. When server id
is passed as a parameter - return a single server or 404 if there’s no such a server.

● PUT a server. The server object is passed as a json-encoded message body. Here’s an
example:

{
“name”: ”my centos”,
“id”: “123”,
“language”:”java”,
“framework”:”django”
}

● DELETE a server. The parameter is a server ID.

● GET (find) servers by name. The parameter is a string. Must check if a server name
contains this string and return one or more servers found. Return 404 if nothing is found.

“Server” objects should be stored in MongoDB database.

For this i have used spring boot to create API to fetch thee data from the mongo db

## Demo video: https://drive.google.com/file/d/17n48sDmkxYfpPhPez92PQEueE6DFUj3P/view?usp=sharing

## The steps to Create Project:
### Step-1:
    Install mongo db in the system or we can use Mongo Atlas(for cloud mongo database)
    Install Java JDK in the system to run java code
    Setup JDK path
    Install Spring Tool Suit in the system to create and run spring boot application
    Install Postman to test the Rest API
### Step-2:
    Setup Mongo db
    Create Spring Boot Rest API
### Step-3:
    Set Mongodb URI and Port in application.properties file so that the Rest API should connect to the mongodb
### Step-4:
    Now run the Spring boot Application annd Test using postman

## Demo Images 
### Create Server Object
![Screenshot (236)](https://github.com/pravinkumarmahato/Task-1-Java-REST-API-example/assets/68019573/1589f2eb-3447-4340-ae2b-50bb985d581e)

### Update Server Object
![Screenshot (238)](https://github.com/pravinkumarmahato/Task-1-Java-REST-API-example/assets/68019573/9b56937f-de1b-41da-8e09-660bc5e3315f)

### Delete Server Object
![Screenshot (235)](https://github.com/pravinkumarmahato/Task-1-Java-REST-API-example/assets/68019573/5cc1c2e3-4f71-4ce7-8805-2f451a90cb3a)

### Get Server Object by ID
![Get_Server_By_Id](https://github.com/pravinkumarmahato/Task-1-Java-REST-API-example/assets/68019573/ca932b1a-5854-453c-9fab-e5363cd72ca8)

### Get Server Object by Name
![Get_Server_By_Name](https://github.com/pravinkumarmahato/Task-1-Java-REST-API-example/assets/68019573/f72b8bb1-720c-44fb-9ff4-a11c908c3e85)

### Get All Servers Object
![Get_All_Servers](https://github.com/pravinkumarmahato/Task-1-Java-REST-API-example/assets/68019573/f65fdf78-2ac6-4e80-bac2-443f86513638)


