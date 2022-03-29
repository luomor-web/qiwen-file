```shell
mvn clean package
cd docker
cp -r ../release file-fe/
sudo docker-compose build file-service

sudo docker-compose up file-mysql80
sudo docker-compose up -d file-mysql80
sudo docker-compose stop file-mysql80
sudo docker-compose rm file-mysql80

sudo docker-compose up elasticsearch
sudo docker-compose up -d elasticsearch
sudo docker-compose stop elasticsearch
sudo docker-compose rm elasticsearch

sudo docker-compose up kibana
sudo docker-compose up -d kibana
sudo docker-compose stop kibana
sudo docker-compose rm kibana

sudo docker-compose up file-redis
sudo docker-compose up -d file-redis
sudo docker-compose stop file-redis
sudo docker-compose rm file-redis

sudo docker-compose up file-doc
sudo docker-compose up -d file-doc
sudo docker-compose stop file-doc
sudo docker-compose rm file-doc

chmod -R 777 file/qiwenshare
chmod -R 777 file/static

sudo docker-compose up file-service
sudo docker-compose up -d file-service
sudo docker-compose stop file-service
sudo docker-compose rm file-service

find . -name "docker-compose.yml"|xargs -I {} grep -r 'elasticsearch' {}

docker exec -it file-service bash

sudo docker exec file-doc sudo supervisorctl start ds:example
sudo docker exec file-doc sudo supervisorctl stop ds:example
sudo docker exec file-doc sudo sed 's,autostart=false,autostart=true,' -i /etc/supervisor/conf.d/ds-example.conf

./var/www/onlyoffice/documentserver-example/welcome/css/logo.svg
sudo docker exec -it file-doc bash
sudo docker cp 202107291433265023.svg file-doc:/var/www/onlyoffice/documentserver-example/welcome/css/logo.svg

sudo docker run -i -t -d -p 80:80 --restart=always \
    -v /app/onlyoffice/DocumentServer/logs:/var/log/onlyoffice  \
    -v /app/onlyoffice/DocumentServer/data:/var/www/onlyoffice/Data  \
    -v /app/onlyoffice/DocumentServer/lib:/var/lib/onlyoffice \
    -v /app/onlyoffice/DocumentServer/db:/var/lib/postgresql  onlyoffice/documentserver

sudo docker run -i -t -d -p 80:80 -p 443:443 \
    -e LETS_ENCRYPT_DOMAIN=yourdomain.com -e LETS_ENCRYPT_MAIL=email@example.com  onlyoffice/documentserver
    
sudo docker run -i -t -d -p 443:443 --restart=always \
    -v /app/onlyoffice/DocumentServer/data:/var/www/onlyoffice/Data  onlyoffice/documentserver

sudo docker run -i -t -d -p 1443:443 --restart=always onlyoffice/documentserver

sudo docker network create --subnet=172.16.0.0/16 file-network

/qiwenshare/qiwen-file/log/web.log
/home/file/static/upload/20220328/269756914e4f69ecec15337d558cd2bd.svg

mysql -h127.0.0.1 -uroot -p -P3309
root
# create database file default character set utf8mb4 collate utf8mb4_unicode_ci;
drop database file;

mysql -h127.0.0.1 -uroot -p -P3309 file < src/main/resources/import.sql
root

http://localhost:8081/
admin
admin
```

```
roncoo-education
jetlinks-community
cskefu

LOCAL(0, "本地存储"),
ALIYUN_OSS(1, "阿里云OSS对象存储"),
FAST_DFS(2, "fastDFS集群存储"),
MINIO(3, "minio存储"),
QINIUYUN_KODO(4, "七牛云KODO对象存储");

show tables;
+--------------------+
| Tables_in_file     |
+--------------------+
| commonfile         |
| file               |
| fileclassification |
| fileextend         |
| filepermission     |
| filetype           |
| hibernate_sequence |
| image              |
| notice             |
| operationlog       |
| permission         |
| picturefile        |
| recoveryfile       |
| role               |
| role_permission    |
| share              |
| sharefile          |
| storage            |
| sysparam           |
| uploadtask         |
| uploadtaskdetail   |
| user               |
| user_role          |
| userfile           |
| userlogininfo      |
+--------------------+
25 rows in set (0.00 sec)

select * from commonfile;
select * from file;
select * from fileclassification;
select * from fileextend;
select * from filepermission;
select * from filetype;
select * from hibernate_sequence;
select * from image;
select * from notice;
select * from operationlog;
select * from permission;
select * from picturefile;
select * from recoveryfile;
select * from role;
select * from role_permission;
select * from share;
select * from sharefile;
select * from storage;
select * from sysparam;
select * from uploadtask;
select * from uploadtaskdetail;
select * from user;
select * from user_role;
select * from userfile;
select * from userlogininfo;
```

```
A类百 10.0.0.0-10.255.255.255 网络数：1
B类 172.16.0.0-172.31.255.255 网络数：16
C类 192.168.0.0-192.168.255.255 网络数：255
```