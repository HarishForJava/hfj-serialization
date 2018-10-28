# Serialization and DeSerialization Example
Serialization is a process of converting an object into a sequence of bytes which can be persisted to a disk 

or 

database or can be sent through streams. The reverse process of creating object from sequence of bytes is called deserialization.

## Serialization
`http://localhost:8080/rest/serialize` - 
POST request with user JSON eg 


	`[{"yourName":"karthik",
	"mobileNumber":9696969696,
	"yourGirlFriendName":"karthik",
	"yourGirlFriendNameMobileNumber":9143143143
	}]`


## DeSerialization
- `http://localhost:8080/rest/deserialize` 

- GET request which returns user JSON eg 

	`[ {
        "yourName": "karthik",
        "mobileNumber": 9696969696,
        "yourGirlFriendName": "karthik",
        "yourGirlFriendMobileNumber": 9143143143
    }]`

## With transient on GirlFriendMobileNumber - DeSerialization
- `http://localhost:8080/rest/deserialize` 

- GET request which returns user JSON eg 

	`[ {
        "yourName": "karthik",
        "mobileNumber": 9696969696,
        "yourGirlFriendName": "karthik",
        "yourGirlFriendMobileNumber": null
    }]`

