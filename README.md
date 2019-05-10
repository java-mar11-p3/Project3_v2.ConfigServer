# Project3_v2.ConfigServer

As of now, we are not doing anything with this config service. This documentation is for reference if whoever is doing future iteration of this project want to use it.

dependencies used in pom.xml
-----------------------------
- spring-boot-starter-parent
- spring-cloud-config-server
- spring-cloud-starter-netflix-eureka-client
- spring-cloud-starter-web

application.properties
---------------------------
eureka.client.register-with-eureka=true
eureka.client.fetch-registry=true
eureka.client.serviceUrl.defaultZone=http://localhost:8086/eureka/

- This is to register ConfigService as client on Eureka server

server.port=8888
spring.application.name=config-server

- This is to provide port number and service name

spring.cloud.config.server.git.uri=https://github.com/jordanzeeg/configurationfiles.git

- This is if we have configuration files in a private git repository that could contain location and credential of our database 
  and we don't want to share it publically
- We can provide the link to the private git repository and access the info from there
