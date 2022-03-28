```shell
sudo docker-compose build file-service

sudo docker-compose up file-doc
sudo docker-compose up -d file-doc
sudo docker-compose stop file-doc
sudo docker-compose rm file-doc

find . -name "docker-compose.yml"|xargs -I {} grep -r 'elasticsearch' {}

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
    
sudo docker network create --subnet=172.16.0.0/16 file-network
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
```

```
A类百 10.0.0.0-10.255.255.255 网络数：1
B类 172.16.0.0-172.31.255.255 网络数：16
C类 192.168.0.0-192.168.255.255 网络数：255
```