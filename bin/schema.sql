DROP TABLE IF EXISTS book;

CREATE TABLE IF NOT EXISTS book(
      id int not null auto_increment primary key,
      name varchar_ignorecase(50) not null,
      author varchar_ignorecase(50) not null,
      price int);
