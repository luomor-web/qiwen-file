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
find . -name "docker-compose.yml"|xargs -I {} grep -r 'nginx' {}

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

walrus  海象
```

```shell
openssl genrsa -out onlyoffice.key 2048
openssl req -new -key onlyoffice.key -out onlyoffice.csr

You are about to be asked to enter information that will be incorporated
into your certificate request.
What you are about to enter is what is called a Distinguished Name or a DN.
There are quite a few fields but you can leave some blank
For some fields there will be a default value,
If you enter '.', the field will be left blank.
-----
Country Name (2 letter code) [XX]:CN
State or Province Name (full name) []:Beijing
Locality Name (eg, city) [Default City]:Beijing
Organization Name (eg, company) [Default Company Ltd]:yunqiic
Organizational Unit Name (eg, section) []:dev
Common Name (eg, your name or your server's hostname) []:yunqiic.com
Email Address []:1097692918@qq.com

Please enter the following 'extra' attributes
to be sent with your certificate request
A challenge password []:
An optional company name []:

openssl x509 -req -days 365 -in onlyoffice.csr -signkey onlyoffice.key -out onlyoffice.crt
openssl dhparam -out dhparam.pem 2048

/app/onlyoffice/DocumentServer/data/certs
mkdir -p /app/onlyoffice/DocumentServer/data/certs

cp onlyoffice.key /app/onlyoffice/DocumentServer/data/certs/
cp onlyoffice.crt /app/onlyoffice/DocumentServer/data/certs/
cp dhparam.pem /app/onlyoffice/DocumentServer/data/certs/
chmod 400 /app/onlyoffice/DocumentServer/data/certs/onlyoffice.key

sudo docker run -i -t -d -p 443:443 \
 -v /app/onlyoffice/DocumentServer/data:/var/www/onlyoffice/Data onlyoffice/documentserver

mkdir -p data/certs
 
cp onlyoffice.key data/certs/
cp onlyoffice.crt data/certs/
cp dhparam.pem data/certs/
chmod 400 data/certs/onlyoffice.key

sudo docker run -i -t -d -p 1443:443 \
 -v $(pwd)/data:/var/www/onlyoffice/Data onlyoffice/documentserver
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

Tiger 老虎	boar  种猪	mallard  野鸭, 凫
Giraffe  长颈鹿	hog 阉猪,  肥猪	mare 母马
Lion  狮子	gilt  小母猪	marmot  土拨鼠
Deer  鹿	piglet  猪崽	moccasin  嗜鱼蛇
Leopard  豹	sheep 羊	mole 鼹鼠
Monkey  猴子	ewe 母羊	monkey  猴子
Elephant  大象	goat 山羊	mosquito  蚊
Chimpanzees  黑猩猩	lamb  羊羔,羔羊	moth 蛾
Horse  马	zebra  斑马	mouse  家鼠
Bear  熊	antilope  羚羊	mule 骡
Donkey  驴	gazelle  小羚羊	mullet  乌鱼, 黑鱼
Kangaroo  袋鼠	deer 鹿	mussel  淡菜,贻贝
Ox  牛	reindeer  驯鹿	mustang  野马
Hedgehog  刺猬	giraffe  长颈鹿	mutton  羊肉
Sheep  绵羊	camel  骆驼	nanny  雌山羊
Rhinoceros  犀牛	dromedary  单峰驼	nightingale  夜莺
Dog  狗	llama  大羊驼	Norway  lobster 蝉虾
Camel  骆驼	guanaco  原驼	octopus  章鱼
Cat  猫	alpaca  羊驼	orangutan  猩猩
Hippopotamus  河马	vicuna  小羊驼	ostrich  鸵鸟
Pig  猪	elephant  象	otter  水獭
Crocodile  鳄鱼	rhinoceros  犀牛	owl  枭,猫头鹰
Chicken  鸡肉	hippopotamus  河马	ox 牛
Snake  蛇	cat 猫	oyster  牡蛎
Rabbit  兔子	tabby,  she-cat, grimalkin 雌猫	pale  clouded yellow 纹黄蝶
Frog  青蛙	tomcat  雄猫, 公猫	panther,  puma 美洲豹
Duck  鸭子	kitten,  kitty, pussy 小猫	parakeet长尾鹦鹉
Tortoise  乌龟	lion 狮	parrot  鹦鹉
Goose  鹅	lynx 猞猁	partridge  石鸡, 鹧鸪
Fox  狐狸	panther,  puma 美洲豹	




Panda  熊猫	leopard  豹	pelican  鹈鹕
Squirrel  松鼠	tiger 虎	penguin  企鹅
Zebra  斑马	wildcat  野猫	perch  鲈鱼
Mouse  老鼠	bison美洲野牛	pheasant  雉, 野鸡
Wolf  狼	yak 牦牛	pig,  swine 猪
Peacock  （雄）孔雀	dog 狗	pigeon  野鸽
Owl  猫头鹰	badger  獾	piglet,  shoat 年幼的猪
Sparrow  麻雀	weasel  鼬,黄鼠狼	pike  梭子鱼
Toco  toucan Miss ma 这个字典里没有	otter  水獭	plaice  鲽
shrimp  虾	fox 狐	plover  千鸟
Dragofly  蜻蜓	hyena,  hyaena 鬣狗	pony 矮马
Fly  苍蝇；飞虫	wolf 狼	porcupine  箭猪, 豪猪
Cicada  蝉	squirrel  松鼠	porpoise  大西洋鼠海豚
Mantis  螳螂	dormouse  睡鼠	poult  小火鸡
Cricket  蟋蟀	beaver  河狸	prawn 虾
Pigeon  鸽子	marmot  土拨鼠	praying  mantis 螳螂
Crane  鹤	ferret  雪貂	ptarmigan  雷鸟
Penguin  企鹅	bear 熊	pup  年幼的狗
Ostrich  鸵鸟	rabbit  兔子	python  蟒蛇
Crab  蟹	hare 野兔	quail  鹌鹑
Ant  蚂蚁	rat 鼠	queen  ant 蚁后
Bee  蜜蜂	chinchilla  南美栗鼠	queen  bee 蜂王
Ladybird  雌鸟	gopher  囊地鼠	rabbit  兔
Parrot  鹦鹉	Guinea  pig 豚鼠	rabbit  兔子
Swan  天鹅	marmot  土拨鼠	ram 雄绵羊
Eagle  鹰	mole 鼹鼠	rat 鼠
Fish  鱼	mouse  家鼠	rattlesnake  响尾蛇
Butterfly  蝴蝶	vole 田鼠	ray 鳐鱼
Mosquito  蚊子	monkey  猴子	red  mullet, surmullet 羊鱼
adder,  viper 蝰蛇	chimpanzee  黑猩猩	reindeer  驯鹿
albatross  信天翁	gorilla  大猩猩	rhinoceros  犀牛
alligator  短吻鳄, 美洲鳄	orangutan  猩猩	robin  知更鸟
alpaca  羊驼	gibbon  长臂猿	sailfish  旗鱼
anchovy  凤尾鱼	sloth  獭猴	salamander,  triton, newt 蝾螈
anglerfish  安康鱼	anteater  食蚁兽	salmon  鲑鱼
anopheles  按蚊,疟蚊	duckbill,  platypus 鸭嘴兽	sardine  沙丁鱼
ant  蚂蚁	kangaroo  袋鼠	scallop  扇贝
anteater  食蚁兽	koala  考拉, 树袋熊	scops  owl 角枭,耳鸟
antilope  羚羊	hedgehog  刺猬	scorpion  蝎子
armadillo  犰狳	porcupine  箭猪, 豪猪	sea  bream 海鲷
ass,  donkey 驴	bat 蝙蝠	sea  horse 海马
badger  獾	armadillo  犰狳	sea  turtle 海龟
bald  eagle 白头鹰	whale 鲸	sea  urchin 海胆
bat  蝙蝠	dolphin  河豚	seal 海豹
bear  熊	porpoise  大西洋鼠海豚	shark  鲨鱼
beaver  河狸	seal 海豹	sheep  绵羊
bedbug,  bug 臭虫	walrus  海象	shrimp  对虾
bee,  honeybees 蜜蜂	horse 马	silkworm  moth 蚕蛾
beetle  甲虫, 金龟子	stallion  雄马	silverfish  蠹虫
billy  雄山羊	mare 雌马	skipjack  鲣鱼
bird  of paradise 极乐鸟, 天堂鸟	foal,  colt, filly 幼马	sloth  獭猴
bison美洲野牛	gelding  的马	snail  蜗牛
blackbird  乌鸫	donkey,  ass 驴	snake 蛇
boa  王蛇	donkey  雄驴	snipe 鹬
boar  雄猪, 种猪	jenny  ass 雌驴	sole 舌鳎
brood  鸡的统称	hinny  驴骡	sow 雌猪
buck  公兔	mule 马骡	sparrow  麻雀
buffalo  水牛	cattle  牛	spider  蜘蛛
bull,  ox 雄牛	bull,  ox 雄牛	spider  crab 蜘蛛蟹
bullfrog  牛蛙	cow 雌牛	spiny  lobster, rock lobster 大螯虾
bullock,  steer 小阉牛	calf(  pl. calves) 年幼的牛	squid  枪乌贼,鱿鱼
bumble  bee 大黄蜂	herd  牛的统称	squirrel  松鼠
butterfly  蝴蝶	water  buffalo 水牛	stallion  雄马
cabbage  butterfly 纹白蝶	yak 牦牛	starling  八哥
caiman,  cayman 凯门鳄	sheep  绵羊	stink  bug 椿象
calf  小牛, 牛犊	ram 雄绵羊	stork 鹳
calf(  pl. calves) 年幼的牛	ewe 雌绵羊	sturgeon  鲟鱼
camel  骆驼	lamb  年幼的绵羊	sulphur  butterfly 白蝴蝶
canary  金丝雀	flock  绵羊的统称	sunfish  翻车鱼
carp  鲤鱼	mutton  羊肉	swallow  燕子
cat  猫	goat 山羊	swallowtail  凤尾蝶
caterpillar  毛虫	billy  雄山羊	swan 天鹅
catta  雌猫	nanny  雌山羊	swift  褐雨燕
cattle  牛	kid  年幼的山羊	swordfish  剑鱼
centipede  蜈蚣	pig 猪	tabby,  she-cat, grimalkin 雌猫
chaffinch  苍头燕雀	boar 雄猪	tarantula  多毛毒蜘蛛
chameleon  变色龙,避役	sow 雌猪	tarpon  大海鲢
chick  小鸡	piglet,shoat  年幼的猪	teal  小野鸭
chicken  鸡, 雏鸡	herd  猪的统称	termite  蚁
chimpanzee  黑猩猩	dog 狗	thoroughbred  纯种马
chinchilla  南美栗鼠	dog 雄狗	thrush  画眉
chub  鲢鱼	bitch  雌狗	tiger 虎
cicada  蝉	pup  年幼的狗	toad 蟾蜍
clam  蚌	rabbit  兔	tom 雄火鸡
cob  雄天鹅	buck 公兔	tomcat  雄猫
cobra  眼镜蛇	goose 鹅	tomcat  雄猫, 公猫
cod  鳕鱼	gander  雄鹅	tortoise  玳瑁
colt, foal 马驹,小马	goose  雌鹅	trout  鳟鱼
condor  秃鹰	gosling  幼鹅	tuatara  古蜥蜴
copperhead  美洲腹蛇	gaggle  鹅的统称	tunny,  tuna 金枪鱼
coral  snake 银环蛇	chicken  鸡	turbot  大菱鲆
cormorant  鸬鹚	cock,rooster  公鸡	turkey  火鸡
cow  雌牛, 母牛	hen 母鸡	turtle  龟
crab  蟹	chick  小鸡	turtle  dove 斑鸠
crayfish  小龙虾, 喇蛄	brood  鸡的统称	vicuna  小羊驼
cricket  蟋蟀	duck 鸭	vole 田鼠
crocodile  鳄鱼, 非洲鳄	turkey  火鸡	vulture  秃鹫
crow  乌鸦	tom 雄火鸡	wall  lizard 壁虎
crucian  鲫鱼	poult  小火鸡	walrus  海象
cuckoo  杜鹃,布谷鸟	cat 猫	wasp  黄蜂, 胡蜂
cuttloefish  乌贼	tomcat  雄猫	water  buffalo 水牛
cygnet  小天鹅	catta  雌猫	weasel  鼬,黄鼠狼
deer  鹿	kitten  小猫	whale 鲸
dog  狗	horse 马	white  ant 白蚁
dog  雄狗	mare 母马	whitethroat  白喉雀
dolphin  河豚	colt, foal 马驹,小马	whiting  小无须鳕
donkey,  ass 驴	pony 矮马	wiggler  孑孓
dormouse  睡鼠	thoroughbred  纯种马	wildcat  野猫
dove  鸽	mustang  野马	wolf 狼
dragonfly  蜻蜓	mule 骡	




dromedary  单峰驼	ass,  donkey 驴	woodpecker  啄木鸟
drone  雄蜂	ox 牛	worker  ant 工蚁
duck  鸭	buffalo  水牛	yak 牦牛
duckbill,  platypus 鸭嘴兽	bull 公牛	zebra  斑马
eagle  鹰	cow 母牛	horse 马
eel  鳗鱼	calf  小牛, 牛犊	stallion  雄马
elephant  象	bullock,  steer 小阉牛	mare 雌马
ewe  母羊	heifer  小母牛	foal,  colt, filly 幼马
ferret  雪貂	pig,  swine 猪	gelding  的马
flea  跳蚤	boar 种猪	donkey,  ass 驴
flock  绵羊的统称	hog 阉猪,  肥猪	donkey  雄驴
fly  苍蝇	gilt  小母猪	jenny  ass 雌驴
foal,  colt, filly 幼马	piglet  猪崽	hinny  驴骡
fox  狐	sheep 羊	mule 马骡
frog  青蛙	ewe 母羊	cattle  牛
gaggle  鹅的统称	goat 山羊	bull,  ox 雄牛
gander  雄鹅	lamb  羊羔,羔羊	cow 雌牛
gander,  wild goose 雁	zebra  斑马	calf(  pl. calves) 年幼的牛
gannet  塘鹅	antilope  羚羊	herd  牛的统称
gavial  印度鳄	gazelle  小羚羊	water  buffalo 水牛
gazelle  小羚羊	deer 鹿	yak 牦牛
gelding  的马	reindeer  驯鹿	sheep  绵羊
giant  salamander 娃娃鱼, 鲵	giraffe  长颈鹿	ram 雄绵羊
gibbon  长臂猿	camel  骆驼	ewe 雌绵羊
gilt  小母猪	dromedary  单峰驼	lamb  年幼的绵羊
giraffe  长颈鹿	llama  大羊驼	flock  绵羊的统称
glowworm,  firefly 萤火虫	guanaco  原驼	mutton  羊肉
goat  山羊	alpaca  羊驼	goat 山羊
golden  eagle 鹫	vicuna  小羊驼	billy  雄山羊
goldfinch  金翅雀	elephant  象	nanny  雌山羊
goose  雌鹅	rhinoceros  犀牛	kid  年幼的山羊
goose  鹅	hippopotamus  河马	pig 猪
gopher  囊地鼠	cat 猫	boar 雄猪
gorilla  大猩猩	tabby,  she-cat, grimalkin 雌猫	sow 雌猪
gosling  幼鹅	tomcat  雄猫, 公猫	piglet,shoat  年幼的猪
grass  snake 草蛇	kitten,  kitty, pussy 小猫	herd  猪的统称
grasshopper  蚱蜢	lion 狮	dog 狗
grouse  松鸡	lynx 猞猁	dog 雄狗
guanaco  原驼	panther,  puma 美洲豹	bitch  雌狗
Guinea  pig 豚鼠	leopard  豹	pup  年幼的狗
guinea,  fowl 珍珠鸡	tiger 虎	rabbit  兔
gull,  seagull 海鸥	wildcat  野猫	buck 公兔
hake  无须鳕	bison美洲野牛	goose 鹅
hare  野兔	yak 牦牛	gander  雄鹅
hawk,  falcon 隼	dog 狗	goose  雌鹅
hedgehog  刺猬	badger  獾	gosling  幼鹅
heifer  小母牛	weasel  鼬,黄鼠狼	gaggle  鹅的统称
hen  母鸡	otter  水獭	chicken  鸡
herd  牛的统称	fox 狐	cock,rooster  公鸡
herd  猪的统称	hyena,  hyaena 鬣狗	hen 母鸡
hermit  crab 寄居蟹	wolf 狼	chick  小鸡
heron  苍鹰	squirrel  松鼠	brood  鸡的统称
herring  青鱼, 鲱	dormouse  睡鼠	duck 鸭
hinny  驴骡	beaver  河狸	turkey  火鸡
hippopotamus  河马	marmot  土拨鼠	tom 雄火鸡
hog  阉猪, 肥猪	ferret  雪貂	poult  小火鸡
horse  马	bear 熊	cat 猫
horsefly,  gadfly 厩蝇,牛虻	rabbit  兔子	tomcat  雄猫
hummingbird  蜂雀	hare 野兔	catta  雌猫
hyena,  hyaena 鬣狗	rat 鼠	kitten  小猫
iguana  鬣蜥	chinchilla  南美栗鼠	horse 马
Japanese  beetle 日本金龟子	gopher  囊地鼠	mare 母马
jenny  ass 雌驴	Guinea  pig 豚鼠	colt, foal 马驹,小马
kangaroo  袋鼠	marmot  土拨鼠	pony 矮马
kid  年幼的山羊	mole 鼹鼠	thoroughbred  纯种马
kingfisher  翠鸟	mouse  家鼠	mustang  野马
kite  鹞	vole 田鼠	mule 骡
kitten  小猫	monkey  猴子	ass,  donkey 驴
kitten,  kitty, ***** 小猫	chimpanzee  黑猩猩	ox 牛
koala  考拉, 树袋熊	gorilla  大猩猩	buffalo  水牛
ladybird  瓢虫	orangutan  猩猩	bull 公牛
lamb  羊羔,羔羊	gibbon  长臂猿	cow 母牛
large  prawn 大对虾	sloth  獭猴	calf  小牛, 牛犊
lark  百鸟,云雀	anteater  食蚁兽	bullock,  steer 小阉牛
leopard  豹	duckbill,  platypus 鸭嘴兽	heifer  小母牛
lion  狮	kangaroo  袋鼠	pig,  swine 猪
lizard  蜥蜴	koala  考拉, 树袋熊	porpoise  大西洋鼠海豚
llama  大羊驼	hedgehog  刺猬	seal 海豹
lobster  龙虾	porcupine  箭猪, 豪猪	walrus  海象
locust  蝗虫	bat 蝙蝠	mackerel  鲭,鲐
louse,  lice 虱子, 白虱	armadillo  犰狳	magpie  喜鹊
lynx  猞猁	whale 鲸	male  ant 雄蚁
macaw金刚鹦鹉	dolphin  河豚
```