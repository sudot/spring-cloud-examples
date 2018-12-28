# eureka注册中心

集群启动(已配置好,可以启动三个)
```
java -jar spring-cloud-eureka-server-1.0-SNAPSHOT.jar --spring.profiles.active=eureka-01
java -jar spring-cloud-eureka-server-1.0-SNAPSHOT.jar --spring.profiles.active=eureka-02
java -jar spring-cloud-eureka-server-1.0-SNAPSHOT.jar --spring.profiles.active=eureka-03
```