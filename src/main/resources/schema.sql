CREATE TABLE users (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       username VARCHAR(255) UNIQUE NOT NULL,
                       email VARCHAR(255) UNIQUE NOT NULL,
                       password VARCHAR(255) NOT NULL
);

CREATE TABLE profiles (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          user_id BIGINT NOT NULL,
                          full_name VARCHAR(255),
                          date_of_birth DATE,
                          address VARCHAR(255),
                          city VARCHAR(255),
                          country VARCHAR(255),
                          phone_number VARCHAR(20),
                          CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES users (id)
);
