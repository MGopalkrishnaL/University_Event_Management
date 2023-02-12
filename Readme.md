# Project : University Event Management

## Frameworks and languages used
* SpringBoot
* Java

## Data flow in the project
1. Controller
2. Services
3. In memory Database that is we used ArrayList to store the Data.

## Data Structure Used in Project
* ArrayList
## Project Summary
University Event Management is project where We used to store the data of Students and Events.
In this project we had used MVC(Model View Controller) Design.
* When ever we click on the link the action takes place in the Contoller.
* Then it goes to Service layer to perform some business operation and according to the request we had given it will perform and gives the End Result.

## API's
### Student
#### Get : fetch data
* Get All Student 
```
http://localhost:8080/Student/getAll
```
* Get Student by their Id :- required Id in int format. 
```
http://localhost:8080/Student/getById/{id}
```
#### Post : add data
* Add Student
```
http://localhost:8080/Student/add-student
```
#### Delete : delete data
* Delete Student by their Id :- required Id in int format.
```http
http://localhost:8080/Student/delete-student/{id}
```
#### Put : Update data
* Update Student by their Id :- required Id in int format.
```http
http://localhost:8080/Student/update-student/{id}
```
#### The above Links are used to perform CRUD operation on the Students.

### Events
#### Get: fetch the data
* Get All Events 
```http
 http://localhost:8080/Events/get-allEvents
```
* Get Events By Date :- 
* required param=Date  
* key = date in String format like yyyy/mm/dd
* Example : http://localhost:8080/Events/get-allEventsByDate/?Date=2022/12/04
```http
http://localhost:8080/Events/get-allEventsByDate/
```
#### Post : Add data
* Add Event
```http
http://localhost:8080/Events/add-event
```
#### Delete : delete data
* Delete Event by EventId
* required param = EventId
* Key = EventId in String like EV1
* Example:http://localhost:8080/Events/delete-event/?EventId=EV1
```http
http://localhost:8080/Events/delete-event/
```
#### Put : update Data
* Update Event by EventId
* required param = EventId
* Key = EventId in String like EV1
* Example :http://localhost:8080/Events/update-event/?EventId=EV2
```http
http://localhost:8080/Events/update-event/
```
#### The above Links are used to perform the crud operations on Events.

