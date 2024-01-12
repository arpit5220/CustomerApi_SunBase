## Steps to Run Project
1. Open project in eclipse/intellej Idea
2. First Use Register Url : 

```
http://localhost:9091/auth/register for Registerring User with json data
{
    "name":"Mradul",
    "email":"mradul@gmail.com",
    "roles":"admin",
    "password":"123"

}
```
3. Then use url to login and get Token
```
http://localhost:9091/auth/login  with json data
{
    "email":"mradul@gmail.com",
    "password":"123"
}

Token: eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJtcmFkdWxAZ21haWwuY29tIiwiaWF0IjoxNzA1MDYwNzk1LCJleHAiOjE3MDUwNjI1OTV9.hiewL0zEV-ocWcKUbUIxoxxa1G6Oq_wbVyxvejgKmhY

```

4. Then you can access all these End Point with sending  Bearer Token in every request
```
Create Customer : http://localhost:9090/api/customers/create
{
    "firstName": "err",
    "lastName": "fchc",
    "street": "Elvnu Street",
    "address": "H no 2 ",
    "city": "Delhi",
    "state": "Delhi",
    "email": "sam@gmail.com",
    "phone": "12345678"
}
Get All Customer : http://localhost:9091/api/customers/get_customer_list
Delete Customer: http://localhost:9090/api/customers/delete/12
Update Customer:  http://localhost:9091/api/customers/update/
```

