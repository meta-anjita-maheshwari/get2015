/*Assignment 4 :- */
CREATE DATABASE ZipCode;
USE ZipCode;

/*create table states with attributes State_id, State_name
State_id is primary key*/
CREATE TABLE States(
State_id VARCHAR(100),
State_name VARCHAR(100),
PRIMARY KEY(State_id)
);

/*create table city with attributes City_id, City_name, State_id
City_id is primary key
State_id foreign key*/
CREATE TABLE City(
City_id VARCHAR(100),
City_name VARCHAR(100),
State_id VARCHAR(100),
PRIMARY KEY(City_id),
FOREIGN KEY(State_id) REFERENCES States(State_id) ON DELETE CASCADE ON UPDATE CASCADE
);

/*create table zipcode with attributes Zipcode, City_id
Zipcode is primary key
City_id is foreign key*/
CREATE TABLE ZipCode(
Zipcode VARCHAR(100),
City_id VARCHAR(100),
PRIMARY KEY(Zipcode),
FOREIGN KEY(City_id) REFERENCES City(City_id) ON DELETE CASCADE ON UPDATE CASCADE
);

/*insert values into States table*/
INSERT INTO States VALUES('1','RAJASTHAN'),('2','UP'),('3','GUJRAT');

/*insert values into City table*/
INSERT INTO City VALUES('101','JAIPUR','1'),('102','AGRA','2'),('103','GANDHINAGAR','3');

/*insert values into ZipCode table*/
INSERT INTO ZipCode VALUES('302018','101'),('112012','102'),('000860','103');
 
/*selects zip code, city name and state name*/
SELECT z.ZipCode, c.City_name, s.State_name
FROM ZipCode z
INNER JOIN
City c
ON z.City_id = c.City_id
INNER JOIN
States s
ON c.State_id = s.State_id
ORDER BY c.City_name, s.State_name; 
