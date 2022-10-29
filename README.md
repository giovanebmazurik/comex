# comex

Create a database container:

docker run --name mysql -d     
-p 3306:3306     
-e MYSQL_ROOT_PASSWORD=root     
--restart unless-stopped     
mysql:8

Enter at container
mysql -P 3306 --protocol=tcp -u root -p

command: create database comex