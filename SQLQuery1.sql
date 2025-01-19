CREATE DATABASE my_database;
USE my_database;

CREATE TABLE users (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
);

INSERT INTO users (id,name, email) VALUES ('1','Alice', 'alice@example.com');

select *from users