-------------------------------------TASKS---------------------------------------

+ deploy
- connect to db mongo
+ connect to sql 
- make two table movies and actors

--------------------------------------DEPLOYMENT----------------------------------


deployed to kyoeb under main gmail account
https://app.koyeb.com/services
url https://zesty-hallie-ivankoretskyy-418f40b9.koyeb.app/
system.properties file is needed for deployment with java version

-----------------------------------------DB MONGO----------------------------------

https://cloud.mongodb.com/v2/667d643303ecd05bf0d4cf59#/metrics/replicaSet/667d6845fd66692fa6b55db3/explorer
LOGIN TO MONGO UNDER SECOND GMAIL ACCOUNT

const connectionString = process.env.ATLAS_URI || "mongodb+srv://ivankoretskyy3:testpassword20240627@cluster0.vzvonrh.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";



-----------------------------------------POSTGRESQL-------------------------------------------

\l list of database
CREATE DATABASE student; // create database student;
\du list of roles
GRANT ALL PRIVILEGES ON DATABASE hulu1 TO "ivan.koretskyy";
\c hulu1; //connect to hulu1
\d find reletion

CREATE USER <YOUR_USERNAME> WITH PASSWORD '<YOUR_PASSWORD>'
CREATE DATABASE <YOUR_DATABASE_NAME> OWNER <YOUR_USERNAME>;



-------------------------------------------MYSql----------------------------------------------------------------------
connect to mysql in terminal 
/usr/local/mysql/bin/mysql -u root -p

CREATE DATABASE hulu;
USE restapi;
CREATE TABLE movie (
  id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(500) NOT NULL);

INSERT INTO movie(id,title) 
VALUES 
(1,'The God Father');



CREATE USER username@'localhost' IDENTIFIED BY 'password';
GRANT ALL ON quotes_database.* TO username@'localhost';

https://www.phpmyadmin.co/tbl_sql.php?db=sql5746484&table=movie

https://www.phpmyadmin.co/tbl_sql.php?db=sql5746484&table=movie