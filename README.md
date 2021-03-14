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

# User - Check Login (POST method) 
API request <br/>
```java
  http://localhost:8089/user/login
```
Response Body 
```java
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
<br/>

# User - Save New User (POST method) 
API request <br/>
```java
  http://localhost:8089/user/save
```
Response Body 
```java
{
        "username": "jessifebriaa",
        "nama": "Jessi Febria",
        "email": "jfebria230201@gmail.com",
        "password": "123456789",
        "bio": "Hello world"
}
```
Output
```java
{
    "User": {
        "username": "jessifebriaa",
        "nama": "Jessi Febria",
        "email": "jfebria230201@gmail.com",
        "password": "123456789",
        "bio": "Hello world"
    }
}
```
<br/>

# User - getUserByUsername (GET method) 
API request <br/>
```java
  http://localhost:8089/user/username/jessifebria
```
Output
```java
{
    "User": {
        "username": "jessifebria",
        "nama": "Jessi Febria",
        "email": "jfebria2302@gmail.com",
        "password": "12345",
        "bio": "Hai, my name is Jessi!"
    }
}
```
<br/>


# History - Save New History (POST method) 
API request <br/>
```java
  http://localhost:8089/history/save
```
Response Body (Time not included, using server's time)
```java
{
        "languageIdFrom": "id-ID",
        "languageIdTo": "en-GB",
        "messageFrom": "Saya pergi",
        "messageTo": "I go",
        "user": "jessifebria"
}
```
Output
```java
{
    "History": {
        "id": 10,
        "languageIdFrom": "id-ID",
        "languageIdTo": "en-GB",
        "messageFrom": "Saya pergi",
        "messageTo": "I go",
        "datetime": "2021-03-14T15:11:08.739+00:00",
        "user": "jessifebria"
    }
}
```
<br/>


# History - get User's history (GET method) 
API request <br/>
```java
  http://localhost:8089/history/username/jessifebria
```
Output
```java
{
    "Histories": [
        {
            "id": 10,
            "languageIdFrom": "id-ID",
            "languageIdTo": "en-GB",
            "messageFrom": "Saya pergi",
            "messageTo": "I go",
            "datetime": "2021-03-14T15:11:08.000+00:00",
            "user": "jessifebria"
        },
        ... , 
        {
            "id": 4,
            "languageIdFrom": "id-ID",
            "languageIdTo": "en-GB",
            "messageFrom": "Buku",
            "messageTo": "Book",
            "datetime": "2021-02-11T23:27:48.000+00:00",
            "user": "jessifebria"
        }
    ]
}
```
<br/>



# History - get history by ID (GET method) 
API request <br/>
```java
  http://localhost:8089/history/id/2
```
Output
```java
{
    "History": {
        "id": 2,
        "languageIdFrom": "id-ID",
        "languageIdTo": "en-GB",
        "messageFrom": "Sepatu",
        "messageTo": "Shoes",
        "datetime": "2021-02-21T14:25:21.000+00:00",
        "user": "jessifebria"
    }
}
```
<br/>



# Translate - Basic Translate (GET method) 
API request <br/>
```java
  http://localhost:8089/translate/English/Indonesian/I%20love%20you
```
Output
```java
{
    "Result": {
        "languageIdFrom": "English",
        "languageIdTo": "Indonesian",
        "messageFrom": "I love you",
        "messageTo": "Aku cinta padamu"
    }
}
```
<br/>



# Translate - List Language (GET method) 
API request <br/>
```java
  http://localhost:8089/translate/listlanguage
```
Output
```java
{
    "Languages": [
        "Niuean",
        "Panjabi",
        "Hebrew",
        "CreoleEnglish(Grenadian)",
        "Mongolian",
        "CreoleEnglish(VirginIslands)",
        "TokPisin",
        "Zulu",
        "Coptic",
        "Shona",
        "Swedish",
        "Turkish",
        "Ukrainian",
        "Kannada",
        "Tetum",
        "Comorian(Ngazidja)",
        "Sango",
        "Catalan",
        "Malay",
        "CreoleEnglish(AntiguaandBarbuda)",
        "CreoleEnglish(Bahamas)",
        "Armenian",
        "Swahili",
        "ChineseTraditional",
        "KurdishSorani",
        "Romanian",
        "Bielarus",
        "Yiddish",
        "Macedonian",
        "Breton",
        "CreoleFrench(SaintLucian)",
        "Japanese",
        "Estonian",
        "Bengali",
        "Pashto",
        "Gujarati",
        "Icelandic",
        "Chinese(Simplified)",
        "Kabuverdianu",
        "Dzongkha",
        "Tibetan",
        "Uzbek",
        "Persian",
        "German",
        "Kurdish",
        "Azerbaijani",
        "Telugu",
        "French",
        "Maltese",
        "Indonesian",
        "Esperanto",
        "Tagalog",
        "Turkmen",
        "Nepali",
        "Georgian",
        "Hawaiian",
        "Cebuano",
        "Chamorro",
        "Basque",
        "Lithuanian",
        "Inuktitut(Greenlandic)",
        "ScotsGaelic",
        "Latvian",
        "Tongan",
        "Korean",
        "Khmer",
        "Tamil",
        "Potawatomi",
        "Tokelauan",
        "Marshallese",
        "Vietnamese",
        "Czech",
        "BalkanGipsy",
        "Galician",
        "Lao",
        "Kabylian",
        "Somali",
        "Dutch",
        "Kyrgyz",
        "Nyanja",
        "CreoleEnglish(Vincentian)",
        "Slovak",
        "Bosnian",
        "Russian",
        "Tuvaluan",
        "Serbian",
        "IrishGaelic",
        "CreoleFrench(Haitian)",
        "Kirundi",
        "Samoan",
        "Kinyarwanda",
        "Tajik",
        "Arabic",
        "Portuguese",
        "Greek(Classical)",
        "Bajan",
        "ManxGaelic",
        "Hindi",
        "Spanish",
        "Thai",
        "Morisyen",
        "Norwegian",
        "Fanagalo",
        "Malagasy",
        "Tigrinya",
        "Tamashek(Tuareg)",
        "Syriac(Aramaic)",
        "Uma",
        "Pakistani",
        "SrananTongo",
        "SwissGerman",
        "Kazakh",
        "Burmese",
        "Javanese",
        "Luxembourgish",
        "Wolof",
        "Latin",
        "Bislama",
        "Wallisian",
        "Italian",
        "Palauan",
        "Afrikaans",
        "Slovenian",
        "Pijin",
        "CreoleEnglish(Guyanese)",
        "CreoleFrench(Seselwa)",
        "Maori",
        "Finnish",
        "Mende",
        "Albanian",
        "CreolePortuguese(UpperGuinea)",
        "Polish",
        "Xhosa",
        "Bulgarian",
        "Papiamentu",
        "Welsh",
        "Faroese",
        "Sotho,Southern",
        "Hausa",
        "Croatian",
        "Quechua",
        "English",
        "Maldivian",
        "Sinhala",
        "Bemba",
        "Danish",
        "Hungarian",
        "Amharic",
        "CreoleEnglish(Jamaican)",
        "Greek",
        "Tswana"
    ]
}
```
<br/>



# Translate - Get Code (to save in history db) (POST method) 
API request <br/>
```java
  http://localhost:8089/translate/code/Indonesian
```
Output
```java
{
    "Code": "id-ID"
}
```
<br/>

Thankyou, happy coding!


