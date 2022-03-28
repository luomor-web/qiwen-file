FROM openjdk:8-jre

RUN apt-get update
RUN apt-get -y install net-tools procps

RUN fc-cache
RUN fc-list
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' > /etc/timezone


RUN mkdir -p /home/file
WORKDIR /home/file

COPY release .
COPY docker-entrypoint.sh .

RUN chmod +x bin/*.sh

ENTRYPOINT ["/home/file/docker-entrypoint.sh"]