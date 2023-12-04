drop table if exists COURSES;
CREATE TABLE COURSES (
  id int NOT NULL,
  name VARCHAR(100) NOT NULL,
  category VARCHAR(20) NOT NULL,
  rating int NOT NULL,
  description VARCHAR(10000) NOT NULL,
  PRIMARY KEY(id)
);