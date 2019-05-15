FROM java:8u111-jdk

ADD target/Project3_v2.ConfigServer.jar /configServer.jar

CMD ["java","-jar", "ConfigServer.jar", "com.java.ConfigServer"]
