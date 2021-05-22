FROM openjdk:8
expose 8080

mkdir var/path/env

env ps var/path/env

cd $ps

copy . .

entrypoint ["java","-jar","catalogueservice.jar"]

expose 8080