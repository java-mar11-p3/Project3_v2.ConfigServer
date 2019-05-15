FROM java:8u111-jdk

ADD target/Project3_v2.ConfigServer.jar /configServer.jar

EXPOSE 8888

CMD ["java","-jar", "ConfigServer.jar", "com.java.ConfigServer"]
