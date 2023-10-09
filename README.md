# gRPC-Consumer-Management-System



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





## How To add DB in Java

[Tutorial - 1](https://www.youtube.com/watch?v=avth9uyp4LE)

[Tutorial - 2](https://www.youtube.com/watch?v=E90z9Qw8cHQ&t=7s)
