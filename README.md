# redis-session-demo
* 打镜像： 在项目根目录下（和 pom.xml 同路径）执行：
```aidl
./mvnw spring-boot:build-image 
```

* 推送镜像： 执行：
```aidl
docker tag docker.io/library/redis-session-demo:0.0.1-SNAPSHOT dockerchenmin/redis-session:1.0
docker push dockerchenmin/redis-session:1.0 
```
