# Project3_v2.ConfigServer

This is the configuration server for the microservices of Project 3. 
This service is currently just a shell that can be utilized to provide configuration to the other services.
For any sensitive configuration information a private github repository can be utilized to provide a way to configure it privately. 



# Project 3 DevOps Documentation

Project 3 DevOps is configured to run on an ec2 located at http://54.86.215.127. 
The jenkins pipeline can be accessed at the url http://54.86.215.127/jenkins with a username and password provided by Revature. 
the Jenkins pipeline builds each service when you ask it to. It runs maven clean, compile, test, and package. 
The jenkins pipeline currently runs all of the unit tests associated with each project during the test step. 
The jenkins pipeline also attempts to deploy a docker image associated with each service. 
This docker image presumably runs properly however we were unable to verify it due to an inability to expose the ports to the host url.

## To run this project

build each pipeline
api gateway is currently set up to run on port 443. 
the api gateway currently does not recognize the other docker images generated by the other pipelines. 
move database connection information from each service into a private repository which can be accessed from the config server. 

## Current Issues

new builds currently do not stop previous builds from running. 
Current deployment doesn't stop the previously run docker images. 
use shell to manually stop the docker images. 
Docker images ports are not currently properly exposed for communication. 
