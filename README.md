# Kamus Web Services

Server side for Kamus Android Mobile App. Output in JSON format, created using Java Springboot. Database used : user & history. For translation using free API from https://mymemory.translated.net/ (support 151 language, but the result not always good).

# Program Feature 
Main feature of the program : <br/>
● User (check login, save new user, get user by username)<br/>
● History (add history, get history by username, get history by id)<br/>
● Translate (basic translation)<br/>

# Environment
● Springboot 2.3.9.RELEASE<br/>
● For other dependencies, please see pom.xml<br/>

# How To Run
● Port used = 8089 <br/>
● Database connection = 3010 <br/>
to change, go at application.properties<br/>

# Input & Output ( All Capability )
<br/>
# User 

1. checklogin (POST method)
Input
```java
  http://localhost:8089/user/login
  
  with Response Body: 
  {
       "username": "jessifebria",
      "password": "12345"
  }
```
Output
```java
{
    "status": "OK",
    "user": {
        "username": "jessifebria",
        "nama": "Jessi Febria",
        "email": "jfebria2302@gmail.com",
        "password": "12345",
        "bio": "Hai, my name is Jessi!"
    }
}
```


