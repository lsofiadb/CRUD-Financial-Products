# CRUD for Financial Products :moneybag::yen::money_with_wings::credit_card:

## Frontend 
You can check this [repo!](https://github.com/nida152/CRUD-finantial-products/tree/master)

## Technologies :wrench::key:
Spring Boot, Java 17, PostgreSQL, JPA, Lombok, Spring Data JPA, Postman.

## Endpoints Documentation :notebook_with_decorative_cover::triangular_ruler:
In case you want to make requests and test the API, you can refer to the documentation [here!](https://documenter.getpostman.com/view/17256808/2s83meoP1Z)

## HTTP Request Examples :mag:

### POST Transaction :envelope:

*Service Path: http://localhost:8081/transaction/save*

**Body Request**

``` JSON
{
    "date":"2022-11-27T12:46:19-0700",
    "amount":500.0,
    "root_account_id":1,
    "destination_account_id":21,
    "category_id":16
}
```

### GET Transaction :incoming_envelope:

*Service Path: http://localhost:8081/transaction/findById/23*

*Service Path: http://localhost:8081/transaction/getTransactions*

### PUT Transaction :e-mail:

*Service Path: http://localhost:8081/transaction/update*

**Body Request**
``` JSON
{
    "id": 23,
    "date":"2022-11-27T12:46:19-0700",
    "amount":1500.0,
    "root_account_id":1,
    "destination_account_id":21,
    "category_id":16
}
```

### DELETE Transaction :bomb:

*Service Path: http://localhost:8081/transaction/deleteById/22*
