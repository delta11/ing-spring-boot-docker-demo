#Build

mvn package docker:build


#Run as daemon 
docker run -p 8080:8080 -d springio/spring-boot-docker-demo:latest

#To read the out put
docker logs <containerid or at least a part of it>

#To see which containers are running
docker ps