DROP TABLE IF EXISTS users;
CREATE TABLE users
(
    id    INT generated by default as identity ,
    email VARCHAR(30),
    name  VARCHAR(30),
    tel   VARCHAR(30)
);

DROP TABLE IF EXISTS products;

CREATE TABLE products
(
    id INT generated by default as identity ,
    no   VARCHAR(5),
    name VARCHAR(50)
);

DROP TABLE IF EXISTS orders;

CREATE TABLE orders
(
    id INT generated by default as identity ,
    user_id INT,
    product_id INT
);