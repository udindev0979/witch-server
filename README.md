# witch-server
untuk testing live ke alamat https://witch-app-udindev.herokuapp.com
Request :
- POST https://witch-app-udindev.herokuapp.com/witch/kills/:year
  cont https://witch-app-udindev.herokuapp.com/witch/kills/6, response :
  
  {
    "status": 0,
    "message": "OK",
    "numberOfVillagers": [
        {
            "numberkills": 20,
            "year": 6
        }
    ]
  }
 
- POST https://witch-app-udindev.herokuapp.com/witch/kills/average
  Header Content-Type application/json
  
  body request :
  
  [
    {
        "personName" : "ahmad",
        "ageOfDeath" : 10,
        "yearOfdeath" : 13
    },
     {
        "personName" : "johny",
        "ageOfDeath" : 13,
        "yearOfdeath" : 17
    }

]

response :

{
    "villagePerson": [
        {
            "personName": "ahmad",
            "ageOfDeath": 10,
            "yearOfdeath": 13,
            "bornOnYear": 3,
            "peopleKilled": 4
        },
        {
            "personName": "johny",
            "ageOfDeath": 13,
            "yearOfdeath": 17,
            "bornOnYear": 4,
            "peopleKilled": 7
        }
    ],
    "average": 5.5,
    "status": 0
}



