## 😀gRPC-Consumer-Producer-Management-System

### 😵 Producer - Consumer Management System using gRPC

- **✍️  Step - 1 ; Registration and save at mysql data (encrypt password)**
- **✍️  Step - 2 ; Login based on that**
- **✍️  Step - 3 ; Set profile**
- **✍️  Step - 4 ; Profile view**
- **✍️  Step - 5 ; Update Profile**

### 😏 Preview Project 

##### Step - 1 : Run "grpcProducer.java"
![Screenshot 2023-10-16 233450](https://github.com/Sumonta056/Socket-Based-Messaging/assets/61287791/00c3894f-9955-42c1-b34c-ee882e157878)



##### Step - 2 : Run "grpcConsumer.java"
![Screenshot 2023-10-16 233508](https://github.com/Sumonta056/Socket-Based-Messaging/assets/61287791/036c8623-116d-4961-88c1-37c726e7645c)



##### Step - 3 : Type - 2 and Proced Registration Process

![Screenshot 2023-10-16 233727](https://github.com/Sumonta056/gRPC-Consumer-Producer-Management-System/assets/61287791/898d6212-4781-4577-829b-b94077f3af6c)


![Screenshot 2023-10-16 233738](https://github.com/Sumonta056/Socket-Based-Messaging/assets/61287791/44d9b841-8814-4b5e-9aa2-78a7d6e2b8e9)

```code
Registration Successful
```

##### Step - 4 : User Login

![Screenshot 2023-10-16 233832](https://github.com/Sumonta056/Socket-Based-Messaging/assets/61287791/d8634e07-517b-4227-a64d-bc2a36d05070)


```code
Login Sucessful and Menu Option
```


##### Step - 5 : Type - 1 for Showing User Profile

![Screenshot 2023-10-16 233847](https://github.com/Sumonta056/Socket-Based-Messaging/assets/61287791/6a5bf001-505c-45b1-b364-94502e7d71dd)






##### Step - 6 : Type - 2 for Updating User Profile

![Screenshot 2023-10-16 233847](https://github.com/Sumonta056/Socket-Based-Messaging/assets/61287791/6a5bf001-505c-45b1-b364-94502e7d71dd)


```code
Sucessfully Updated User Profile
```


## Database Schema

```
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    bio TEXT,
    UNIQUE (username),
    UNIQUE (email)
);
```





